package com.myextensible.extensible.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author zhenye 2018/8/7
 */
@Data
public class Classroom {
    /**
     * 主键id
     */
    private Integer id;
    /**
     * 年级
     */
    private Integer grade;
    /**
     * 班号
     */
    private Integer classNo;
    /**
     * 语文老师id
     */
    private Integer chineseTeacherId;
    /**
     * 数学老师id
     */
    private Integer mathTeacherId;
    /**
     * 英文老师id
     */
    private Integer englishTeacherId;
    /**
     * 操作时间
     */
    private Date operateTime;
    /**
     * （0：未删除，1：已删除）
     */
    private Integer flag;
}
