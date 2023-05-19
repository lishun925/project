package com.java.aqsDemo;

import com.java.thread.myThread.utils.ThreadUtils;

import java.util.concurrent.ExecutorService;

/**
 * @author:lishun
 * @create: 2023-05-18 15:41
 * @Description: 测试类
 */
public class test {
    public static void main(String[] args) {
        ExecutorService threadPool = ThreadUtils.getInstance();
        MyLock lock = new MyLock();
        try {
            for (int i = 1; i <= 10; i++) {
                final int num = i;
                threadPool.execute(() -> {
                    lock.lock();
                    System.out.println("序号 " + num + "  " + Thread.currentThread().getName() + " \t 办理业务");
                    lock.unlock();
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            threadPool.shutdown();
        }
    }
}
