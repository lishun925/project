package com.java.demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author:lishun
 * @create: 2022-11-07 20:04
 * @Description:
 */
public class BookManagement {
    private static final ExecutorService threadPool = Executors.newFixedThreadPool(5);

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 20; i++) {
            //执行任务
            service.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(666);
                    System.out.println(888);
                    //说明是使用线程池来创建线程
                }
            });
        }
    }
}
