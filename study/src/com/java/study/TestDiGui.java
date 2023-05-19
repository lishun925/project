package com.java.study;

/**
 * @author:lishun
 * @create: 2022-05-10 21:28
 * @Description: 测试递归算法
 */
public class TestDiGui {
    private static int n = 0;

    public static void main(String[] args) {
        System.out.println(getSum(4));
    }

    public static int getSum(int m) {
        if (m == 1)
            return 1;
        n += getSum(m - 1) + 1;
        return n;
    }
}
