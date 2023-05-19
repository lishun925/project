package com.java.sjms.dlms;

public class LazySinglton {
    /* 持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载
     */
    private static LazySinglton lazy = null;

    /* 私有构造方法，防止被实例化 */
    private LazySinglton() {
    }

    /* 1:懒汉式，静态工程方法，创建实例 */
    //存在线程安全问题
    public static synchronized LazySinglton getInstance() {
        if (lazy == null) {
            lazy = new LazySinglton();
        }
        return lazy;
    }


    public String getMessage() {
        return "6666";
    }
}
