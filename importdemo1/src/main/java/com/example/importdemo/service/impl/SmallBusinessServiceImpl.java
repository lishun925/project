package com.example.importdemo.service.impl;

import com.alibaba.excel.EasyExcel;
import com.example.importdemo.entity.SmallBusinessImportPo;
import com.example.importdemo.service.SmallBusinessService;
import com.example.importdemo.utils.ResultMsg;
import com.example.importdemo.utils.SmallBusinessImportListener;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author:lishun
 * @create: 2022-10-13 09:59
 * @Description: 实现类
 */
@Service
public class SmallBusinessServiceImpl implements SmallBusinessService {

    @Override
    public ResultMsg importSmallBusiness(MultipartFile file) throws IOException {
        // 1.获取导入的文件
        String fileName = file.getOriginalFilename();
        String fileType = fileName.substring(fileName.lastIndexOf('.') + 1);
        String xlsxType = "xlsx";
        String xlsType = "xls";
        if (!xlsxType.equals(fileType) && !xlsType.equals(fileType)) {
            return new ResultMsg(false, "请上传后缀为.xlsx或.xls的文件！");
        }
        //获取文件流
        InputStream inputStream = file.getInputStream();
        //easyexcel导入文件
        SmallBusinessService smallBusinessService = new SmallBusinessServiceImpl();
        EasyExcel.read(inputStream, SmallBusinessImportPo.class, new SmallBusinessImportListener(smallBusinessService)).sheet().doRead();
        /*EasyExcel.read(new BufferedInputStream(file.getInputStream())).head(SmallBusinessImportPo.class).sheet().doReadSync();*/
        return new ResultMsg(true, "导入成功！", null, null);
    }
}
