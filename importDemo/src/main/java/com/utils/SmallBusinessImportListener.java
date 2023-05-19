package com.utils;


import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.entity.SmallBusinessImportPo;
import com.service.SmallBusinessService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;

/**
 * @author:lishun
 * @create: 2022-09-21 10:52
 * @Description: 小经营店销售批量导入监听器
 */
public class SmallBusinessImportListener extends AnalysisEventListener<SmallBusinessImportPo> {
    private static final Logger LOGGER = LoggerFactory.getLogger(SmallBusinessImportListener.class);
    /**
     * 每隔1000条存储数据库，然后清理list ，方便内存回收
     */
    private static final int BATCH_COUNT = 1000;
    List<SmallBusinessImportPo> list = new ArrayList<SmallBusinessImportPo>();
    /**
     * 如果使用了spring,请使用这个构造方法。每次创建Listener的时候需要把spring管理的类传进来
     *
     * @param demoDAO
     */
    private SmallBusinessService smallBusinessService;

    public SmallBusinessImportListener(SmallBusinessService smallBusinessService) {
        this.smallBusinessService = smallBusinessService;
    }

    public SmallBusinessImportListener() {

    }

    @Override
    public void invoke(SmallBusinessImportPo smallBusinessImportPo, AnalysisContext analysisContext) {
        LOGGER.info("解析到一条数据:{}", JSON.toJSONString(smallBusinessImportPo));
        list.add(smallBusinessImportPo);
        // 达到BATCH_COUNT了，需要去存储一次数据库，防止数据几万条数据在内存，容易OOM
        if (list.size() >= BATCH_COUNT) {
            saveData();
            // 存储完成清理 list
            list.clear();
        }
    }

    /**
     * 所有数据解析完成了 都会来调用
     *
     * @param context
     */
    @Override
    public void doAfterAllAnalysed(AnalysisContext context) {
        // 这里也要保存数据，确保最后遗留的数据也存储到数据库
        saveData();
        LOGGER.info("所有数据解析完成！");
    }

    /**
     * 加上存储数据库
     */
    private void saveData() {
        LOGGER.info("{}条数据，开始存储数据库！", list.size());

        LOGGER.info("存储数据库成功！");
    }
}
