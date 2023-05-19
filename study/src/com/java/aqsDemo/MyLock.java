package com.java.aqsDemo;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/**
 * @author:lishun
 * @create: 2023-05-18 15:16
 * @Description: 自定义锁，不可重入锁
 */
public class MyLock implements Lock {


    //内部类，aqs同步类
    class MySync extends AbstractQueuedSynchronizer {
        @Override
        protected boolean tryAcquire(int arg) {
            if (compareAndSetState(0,1)){
                System.out.println("获得锁成功");
                //加上了锁,并设置owner为当前线程
                setExclusiveOwnerThread(Thread.currentThread());
                return true;
            }
            System.out.println("获得锁失败");
            return false;
        }

        @Override
        protected boolean tryRelease(int arg) {
            setExclusiveOwnerThread(null);
            setState(0);
            return true;
        }

        @Override
        protected boolean isHeldExclusively() {
            return getState() == 1;
        }

        public Condition newCondition(){
            return new ConditionObject();
        }
    }
    private MySync mySync = new MySync();
    //加锁（不成功进入阻塞队列等待）
    @Override
    public void lock() {
        mySync.acquire(1);
    }

    //加锁可打断
    @Override
    public void lockInterruptibly() throws InterruptedException {
        mySync.acquireInterruptibly(1);
    }
    //加锁(不成功不会进入阻塞队列等待，可以去做其他事情)
    @Override
    public boolean tryLock() {
        return mySync.tryAcquire(1);
    }
    //尝试加锁 带时间
    @Override
    public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
        return mySync.tryAcquireNanos(1,unit.toNanos(time));
    }
    //释放锁
    @Override
    public void unlock() {
        mySync.release(1);
    }
    //创建条件变量
    @Override
    public Condition newCondition() {
        return mySync.newCondition();
    }
}
