package com.java.sjms.dlms.test;

import com.java.sjms.dlms.HungrySingleton;

import java.text.ParseException;

/**
 * @author:lishun
 * @create: 2022-06-29 10:01
 * @Description: 测试类
 */
public class test {
    public static void main(String[] args) throws ParseException {
        /**
         * 饿汉式测试
         */
        for (int i = 0; i < 10000; i++) {
            HungrySingleton serialGenerator = HungrySingleton.getInstance();
            System.out.println(serialGenerator.next());
        }
    }
}
