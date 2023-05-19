package com.java.sjms.cxgcms;

/**
 * @author:lishun
 * @create: 2022-06-29 16:15
 * @Description:
 */
public class AbstractFactory {
    public void ClientCode(String name) {
        Food x = new FactoryForA().get();
        x = new FactoryForB().get();
        System.out.println(x);
    }
}
