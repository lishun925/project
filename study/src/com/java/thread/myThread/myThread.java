package com.java.thread.myThread;

import com.java.thread.myThread.utils.ThreadUtils;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.concurrent.*;

/**
 * @author:lishun
 * @create: 2022-07-28 10:13
 * @Description: 手动创建的线程池
 */
public class myThread {
    public static void main(String[] args) {
        ExecutorService threadPool = ThreadUtils.getInstance();
        try {
            for (int i = 1; i <= 10; i++) {
                final int num = i;
                threadPool.execute(() -> {
                    //打印当前线程名称
                    //暂停一会线程
                    System.out.println("序号 " + num + "  " + Thread.currentThread().getName() + " \t 办理业务");
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            threadPool.shutdown();
        }
        System.out.println(6666666);
    }

}
