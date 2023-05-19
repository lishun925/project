package com.java.sjms.gcms.test;

import com.java.sjms.gcms.FoodFactory;

/**
 * @author:lishun
 * @create: 2022-06-29 15:21
 * @Description: 测试类
 */
public class test {
    public static void main(String[] args) {
        String str = "橘子";
        FoodFactory foodFactory = new FoodFactory();
        foodFactory.getType(str).print();
    }
}
