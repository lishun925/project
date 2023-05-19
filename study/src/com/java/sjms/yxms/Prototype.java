package com.java.sjms.yxms;

/**
 * @author:lishun
 * @create: 2022-06-29 17:01
 * @Description: 原型模式
 */
public class Prototype implements Cloneable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        } finally {
            return null;
        }
    }

    public static void main(String[] args) {
        Prototype pro = new Prototype();
        Prototype pro1 = (Prototype) pro.clone();
        System.out.println(pro1);
    }
}
