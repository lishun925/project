package com.java.study;

import java.util.Date;

/**
 * @author:lishun
 * @create: 2022-05-13 11:14
 * @Description: 转换的Po
 */
public class InspectTaskPo {
    private static final long serialVersionUID = -5940636377590110562L;
    // 计划流水号
    private Long jhlsh;

    // 计划名称
    private String jhmc;

    // 任务名称
    private String rwmc;

    // 监管专业
    private String sszy;

    // 企业类型
    private String qylx;

    // 任务类型
    private String rwlx;

    // 开始时间
    private Date kssj;

    // 结束时间
    private Date jssj;

    // 检查依据
    private String jcyj;

    // 检查方式
    private String jcfs;

    // 检查模式
    private String jcms;

    // 检查要求
    private String jcyq;

    // 检查表单ID
    private Long jcbdid;

    // 任务接收对象
    private String rwjsdx;

    // 任务接收对象类型
    private String rwjsdxlx;

    // 是否需进行签收
    private String sfxjxqs;

    // 任务接收对象id
    private String rwjsdxids;

    // 是否指定企业
    private Integer sfzdqy;

    //联系人
    private String lxr;

    //联系电话
    private String lxdh;

    // 制定人
    private String zdr;

    // 制定单位
    private String zddw;

    // 状态（未发布、已发布、已完成）
    private Integer zt;

    // 当前节点
    private Integer step;

    // 任务来源
    private String origin;

    // 任务来源id
    private String originid;

    //企业指标内容json
    private String zbnr;

    // 企业指标
    private String qyzb;

    // 检查事由
    private String jcsy;
}
