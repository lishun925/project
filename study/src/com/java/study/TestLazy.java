package com.java.study;

import com.java.sjms.dlms.LazySinglton;

public class TestLazy {
    public static void main(String[] args) {

/*        System.out.println("单线程测试");
        System.out.println(LazySinglton.getInstance());
        System.out.println(LazySinglton.getInstance());
        System.out.println(LazySinglton.getInstance());*/

        System.out.println("多线程测试");
        Thread t1 = new Thread(new ExectorThread());
        Thread t2 = new Thread(new ExectorThread());
        t1.start();
        t2.start();
        System.out.println("Exector End");
    }
}

class ExectorThread implements Runnable {

    @Override
    public void run() {
        LazySinglton lazySinglton = LazySinglton.getInstance();
        System.out.println(Thread.currentThread().getName() + ":" + lazySinglton.getMessage());
    }
}
