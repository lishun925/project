package com.java.io.utils;

import java.io.*;

/**
 * @author:lishun
 * @create: 2022-07-28 11:40
 * @Description: IO工具类
 */
public class IoUtils {
    public static File getFile(String filePath) {
        try {
            String path = filePath;
            File file = new File(path);
            if (!file.exists()) {
                file.getParentFile().mkdirs();
                file.createNewFile();
            }
            return file;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 读取文件内容
     *
     * @param file
     * @return
     */
    public static String readerFile(File file) {
        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            while (br.readLine() != null) {
                System.out.println(br.readLine());
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != br)
                    br.close();
                if (null != fr)
                    fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    /**
     * 写入文件并覆盖原内容
     *
     * @param str
     * @param file
     */
    public static void writeFile(String str, File file) {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(file, false);
            bw = new BufferedWriter(fw);
            bw.write(str);
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != bw)
                    bw.close();
                if (null != fw)
                    fw.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /*
     * 追加text写入文件，用来做log日志打印
     * */
    public void saveWriteFile(String path, String str) {
        FileWriter fw = null;
        try {
            //如果文件存在，则追加内容；如果文件不存在，则创建文件
            File f = new File(path);
            fw = new FileWriter(f, true);
        } catch (IOException e) {
            e.printStackTrace();
        }
        PrintWriter pw = new PrintWriter(fw);
        pw.println("/n");
        pw.println(str);
        pw.flush();
        try {
            fw.flush();
            pw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 删除文件或者文件夹
     *
     * @param file
     * @return
     */
    public static boolean delFile(File file) {
        if (!file.exists()) {
            return false;
        }

        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File f : files) {
                delFile(f);
            }
        }
        return file.delete();
    }

    /**
     * 删除文件或者文件夹（排除需要过滤的）
     *
     * @param file     要删除的文件夹、文件
     * @param filePath 需要过滤的 文件夹、文件
     * @return
     */
    public static boolean delWithOutFile(File file, File filePath) {
        if (!file.exists() || !filePath.exists()) {
            return false;
        }

        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File f : files) {
                if (!f.getAbsolutePath().equals(filePath.getAbsolutePath())) {
                    delFile(f);
                }
            }
        }
        return file.delete();
    }
}
