package com.java.io;

import com.java.io.utils.IoUtils;

import java.io.*;

/**
 * @author:lishun
 * @create: 2022-07-28 11:39
 * @Description: 读取文件
 */
public class readFile {
    private static IoUtils ioUtils = new IoUtils();

    public static void main(String[] args) {
        /**
         * FileReader读取文件
         */
    /*   File file = IoUtils.getFile("H:\\GoodGoodStudy\\一线大厂面试题\\21-数据结构与算法面试题（2020最新版）-重点.pdf");
        IoUtils.readerFile(file);*/


        /**
         * InputStream 读取文件
         */
        try {
            InputStream inputStream = new FileInputStream("H:\\GoodGoodStudy\\一线大厂面试题\\学习日志.txt");
            OutputStream outputStream = new FileOutputStream("H:\\GoodGoodStudy\\一线大厂面试题\\学习日志1.txt");
            int bytesRead = 0;
            byte[] buffer = new byte[8192];
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                System.out.println(new String(buffer, 0, bytesRead));
                outputStream.write(buffer, 0, bytesRead);
            }
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        /**
         * FileInputStream 读取文件
         */
        copeFile("H:\\GoodGoodStudy\\一线大厂面试题\\学习日志.txt", "H:\\GoodGoodStudy\\一线大厂面试题\\学习日志2.txt");
    }


    public static void copeFile(String sourceFile, String targetFile) {
        try {
            //实例化字节流
            FileInputStream fileInputStream = new FileInputStream(sourceFile);
            FileOutputStream fileOutputStream = new FileOutputStream(targetFile);
            //实例化处理流
            BufferedInputStream bf = new BufferedInputStream(fileInputStream);
            BufferedOutputStream bo = new BufferedOutputStream(fileOutputStream);
            byte[] buffer = new byte[1024];//字符数组缓冲区
            int temp = 0;
            while ((temp = bf.read(buffer)) != -1) {
                System.out.println(new String(buffer, 0, temp));
                bo.write(buffer, 0, temp);
            }
            bo.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
