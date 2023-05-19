package com.myextensible.extensible.test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.myextensible.extensible.ExtensibleApplication;
import com.myextensible.extensible.entity.Classroom;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import com.alibaba.fastjson.JSONObject;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author:lishun
 * @create: 2022-05-13 11:20
 * @Description: 测试
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ExtensibleApplication.class)
public class test {

    @Test
    public void queryClassRoom() {
        String str = "{\"name\":\"任务名称\",\"rwmc\":\"heehh\"," +
                "}";
        JSONObject info = JSONObject.parseObject(str);
        JSONArray jsonArray = info.getJSONArray("data");
        String js = JSONObject.toJSONString(jsonArray);
        List<InspectTaskPo> po = JSONObject.parseArray(js, InspectTaskPo.class);
        System.out.println("info=====>" + info);
        System.out.println("jsonArray=====>" + jsonArray);
        System.out.println("js=======>" + js);
        System.out.println("po=======>" + po);
    }
}
