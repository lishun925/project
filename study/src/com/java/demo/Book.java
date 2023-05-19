package com.java.demo;

/**
 * @author:lishun
 * @create: 2022-11-07 19:58
 * @Description:
 */
public class Book {
    private String title;
    private float listPrice;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getListPrice() {
        return listPrice;
    }

    public void setListPrice(float listPrice) {
        this.listPrice = listPrice;
    }

    /**
     * 重写toString
     *
     * @return
     */
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", listPrice=" + listPrice +
                '}';
    }
}
