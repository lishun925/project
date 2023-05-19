package com.java.thread.myThread.utils;

import java.util.concurrent.*;

/**
 * @author:lishun
 * @create: 2022-07-28 11:00
 * @Description: 手动创建线程池工具类
 */
public class ThreadUtils {

    private ThreadUtils() {
    }

    private static ExecutorService executorService = execotur();

    private static ExecutorService execotur() {
        ExecutorService threadPool = new ThreadPoolExecutor(
                5,
                5,
                1,
                TimeUnit.SECONDS,
                new LinkedBlockingDeque<>(5),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy()
        );
        return threadPool;
    }

    public static ExecutorService getInstance() {
        return executorService;
    }
}
