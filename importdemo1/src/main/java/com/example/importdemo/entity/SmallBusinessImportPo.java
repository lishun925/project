package com.example.importdemo.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author:lishun
 * @create: 2022-09-21 10:54
 * @Description: 小经营销售批量导入实体类
 */
@Data
public class SmallBusinessImportPo implements Serializable {
    /**
     * 经营主体
     *//*
    @ExcelProperty(value = "经营主体")
    private String jyzt;
    *//**
     * 主体业态
     *//*
    private String ztyt;
    *//**
     * 所属专业范围
     *//*
    private String sszyfw;

    *//**
     * 监管状态
     *//*
    private String jgzt;
    *//**
     * 地址类型
     *//*
    private String dzlx;
    *//**
     * 市州编码
     *//*
    @ExcelProperty(value = "地市")
    private String szbm;
    *//**
     * 区市县编码
     *//*
    @ExcelProperty(value = "区市县")
    private String qsxbm;
    *//**
     * 乡镇街道编码
     *//*
    @ExcelProperty(value = "乡镇街道")
    private String xzjdbm;
    *//**
     * 社会信用代码
     *//*
    @ExcelProperty(value = "社会信用代码")
    private String shxydm;
    *//**
     * 备案号
     *//*
    @ExcelProperty(value = "备案号")
    private String bah;
    *//**
     * 经营者姓名
     *//*
    @ExcelProperty(value = "经营者")
    private String jyz;
    *//**
     * 身份证号
     *//*
    @ExcelProperty(value = "身份证号")
    private String sfzhm;
    *//**
     * 联系电话
     *//*
    @ExcelProperty(value = "联系电话")
    private String lxdh;
    *//**
     * 营业地址
     *//*
    @ExcelProperty(value = "营业地址")
    private String yydz;
    *//**
     * 备案状态
     *//*
    private String qyzt;
    *//**
     * 食品类别
     *//*
    @ExcelProperty(value = "食品类别")
    private String splbTree;
    */
    /**
     * 销售范围
     *//*
    @ExcelProperty(value = "销售范围")
    private String spxsTree;*/

    @ExcelProperty("被抽样单位名称")
    private String bcydwmc;
    @ExcelProperty("更新时间")
    private String gxsj;
    @ExcelProperty("抽样场所")
    private String cycs;
    @ExcelProperty("被抽样省份")
    private String bcysf;
    @ExcelProperty("被抽样地市")
    private String bcyds;
    @ExcelProperty("县(市、区)")
    private String xsq;
    @ExcelProperty("单位地址(被抽样单位)*")
    private String dwdz;
    @ExcelProperty("生产许可证号")
    private String scxkzh;
    @ExcelProperty("样品名称")
    private String ypmc;
    @ExcelProperty("抽样数量")
    private String cysl;
    @ExcelProperty("抽样编号*")
    private String cybh;
    @ExcelProperty("食品大类")
    private String spdl;
    @ExcelProperty("食品亚类")
    private String spyl;
    @ExcelProperty("食品次亚类")
    private String spcyl;
    @ExcelProperty("食品细类")
    private String spxl;
    @ExcelProperty("生产/加工/购进日期")
    private String cprq;
    @ExcelProperty("样品规格*")
    private String ypgg;
    @ExcelProperty("样品批号*")
    private String ypph;
    @ExcelProperty("生产日期*")
    private String scrq;
    @ExcelProperty("保质期*")
    private String bzq;
    @ExcelProperty("抽样单位名称")
    private String cydwmc;
    @ExcelProperty("抽样人员*")
    private String cyry;
    @ExcelProperty("抽样时间*")
    private String cysj;
    @ExcelProperty("检验机构名称")
    private String jyjgmc;
    @ExcelProperty("检验目的*")
    private String jymd;
    @ExcelProperty("报告书编号*")
    private String bgsbh;
    @ExcelProperty("收检日期*")
    private String syrq;
    @ExcelProperty("报告日期*")
    private String bgrq;
    @ExcelProperty("所在省份*")
    private String szsf;
    @ExcelProperty("样品类型")
    private String yplx;
    @ExcelProperty("包装分类")
    private String bzfl;
    @ExcelProperty("标识生产企业名称")
    private String qymc;
    @ExcelProperty("标识生产企业地址*")
    private String qydz;
    @ExcelProperty("标识生产企业省份")
    private String qysf;
    @ExcelProperty("标识生产企业市")
    private String qycs;
    @ExcelProperty("标识生产企业县")
    private String qyx;
    @ExcelProperty("报送分类-2")
    private String bsfl2;
    @ExcelProperty("报送分类-1")
    private String bsfl1;
    @ExcelProperty("抽样环节")
    private String cyhj;
    @ExcelProperty("备注(检验机构)")
    private String jyjgbz;
    @ExcelProperty("备注(样品)")
    private String ypbz;
    @ExcelProperty("年度")
    private String nd;
    @ExcelProperty("结论*")
    private String jl;
    @ExcelProperty("商标")
    private String sb;
    @ExcelProperty("任务来源*")
    private String rwly;
    @ExcelProperty("样品状态")
    private String ypzt;
    @ExcelProperty("区域类型")
    private String qylx;
    @ExcelProperty("营业执照号")
    private String yyzzid;
    @ExcelProperty("报告分类")
    private String bgfl;
    @ExcelProperty("是否委托生产")
    private String sfwtsc;
    @ExcelProperty("委托省(市、自治区)*")
    private String wts;
    @ExcelProperty("委托地区(市、州、盟)")
    private String wtdq;
    @ExcelProperty("委托县(市、区)")
    private String wtx;
    @ExcelProperty("是否进口")
    private String sfjk;
    @ExcelProperty("原产国")
    private String ycg;
    @ExcelProperty("省抽国抽")
    private String sfgc;
    @ExcelProperty("检验项目")
    private String jyxm;
    @ExcelProperty("检验结果*")
    private String jyjg;
    @ExcelProperty("结果判定*")
    private String jgpd;
    @ExcelProperty("检验依据*")
    private String jyyj;
    @ExcelProperty("判定依据*")
    private String pdyj;
    @ExcelProperty("最小允许限*")
    private String zxyxx;
    @ExcelProperty("最小允许限单位*")
    private String zxyxxdw;
    @ExcelProperty("最大允许限*")
    private String zdyxx;
    @ExcelProperty("最大允许限单位*")
    private String zdyxxdw;
    @ExcelProperty("结果单位*")
    private String jgdw;
    @ExcelProperty("分类")
    private String fl;
    @ExcelProperty("检验结论")
    private String jyjl;
    @ExcelProperty("执行标准/技术文件*")
    private String zxbz;
    @ExcelProperty("质量等级*")
    private String zldj;
    @ExcelProperty("任务来源（省）")
    private String rwlys;
    @ExcelProperty("任务来源（市）")
    private String rwlycity;
    @ExcelProperty("任务来源（县）")
    private String rwlyx;
    @ExcelProperty("委托企业名称")
    private String wtqymc;
    @ExcelProperty("网络平台名称")
    private String wlptmc;
    @ExcelProperty("是否为评价性抽检")
    private String sfwpjxj;
    @ExcelProperty("日期类型")
    private String rqlx;
    @ExcelProperty("食用农产品合格证")
    private String syncphgz;
    @ExcelProperty("注册证号")
    private String zczh;


    @ExcelIgnore
    private String scjgry;
    @ExcelProperty("第一次提交到秘书处的时间")
    private String dyctjdmscsj;
    @ExcelIgnore
    private String ypsx;
    @ExcelProperty("部署机构省")
    private String bsjgse;
    @ExcelProperty("部署机构市")
    private String bsjgsh;
    @ExcelProperty("部署机构县")
    private String bsjgx;
    @ExcelProperty("单价")
    private String dj;
    @ExcelIgnore
    private String bysl;
    @ExcelIgnore
    private String xzqhbm;
    @ExcelIgnore
    private String jyjgsz;
    @ExcelIgnore
    private String wcptszds;
    @ExcelIgnore
    private String bsjg;
    @ExcelIgnore
    private String snsw;
    @ExcelIgnore
    private String bcydwdq;
    @ExcelIgnore
    private String scqydq;
    @ExcelProperty("异议审批状态")
    private String yyspzt;
    @ExcelProperty("异议处置结果")
    private String yyczjg;

}
