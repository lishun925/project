package com.java.sjms.gcms;

/**
 * @author:lishun
 * @create: 2022-06-29 15:42
 * @Description: 食物工厂类
 */
public class FoodFactory {
    public food getType(String type) {
        if ("苹果".equals(type)) {
            return new apple();
        } else if ("橘子".equals(type)) {
            return new orange();
        } else {
            System.out.println("请输入正确的类型！");
            return null;
        }
    }
}
