package com.java.sjms.jzzms;

/**
 * @author:lishun
 * @create: 2022-06-29 16:49
 * @Description: 建造者模式
 */
public class Jzzms {
    static class Student {
        String name = null;
        int number = -1;
        String sex = null;

        public Student(Builder builder) {
            this.name = builder.name;
            this.number = builder.number;
            this.sex = builder.sex;
        }

        static class Builder {
            String name = null;
            int number = -1;
            String sex = null;

            public Builder setName(String name) {
                this.name = name;
                return this;
            }

            public Builder setNumber(int number) {
                this.number = number;
                return this;
            }

            public Builder setSex(String sex) {
                this.sex = sex;
                return this;
            }

            public Student build() {
                return new Student(this);
            }
        }
    }

    public static void main(String[] args) {
        Student A = new Student.Builder().setName("张三").setNumber(1).build();
        Student B = new Student.Builder().setSex("男").setName("李四").setNumber(222).build();
        System.out.println(A.name + " " + A.number + " " + A.sex);
        System.out.println(B.name + " " + B.number + " " + B.sex);
    }

}
