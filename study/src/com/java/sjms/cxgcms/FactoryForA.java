package com.java.sjms.cxgcms;

/**
 * @author:lishun
 * @create: 2022-06-29 16:12
 * @Description:
 */
public class FactoryForA implements Produce {
    @Override
    public Food get() {
        return new A();
    }
}
