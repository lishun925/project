package com.java.sjms.cxgcms;

/**
 * @author:lishun
 * @create: 2022-06-29 16:13
 * @Description:
 */
public class FactoryForB implements Produce {
    @Override
    public Food get() {
        return new B();
    }
}
