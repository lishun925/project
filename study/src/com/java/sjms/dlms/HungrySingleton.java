package com.java.sjms.dlms;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HungrySingleton {
    private String str = "GYBZ";
    /* 持有私有静态实例，防止被引用 */
    public static HungrySingleton hungrySingleton = null;

    static {
        try {
            hungrySingleton = new HungrySingleton();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    /**
     * 私有构造方法，防止被实例化
     */
    private HungrySingleton() throws ParseException {
    }

    /**
     * 生成唯一序列号
     *
     * @return
     */
    public synchronized String next() throws ParseException {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parse = sdf.parse(sdf.format(date));
        Long time1 = parse.getTime();
        return str + time1;
    }

    /**
     * 懒汉式静态工厂方法，创建实例
     *
     * @return
     */
    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }
}
