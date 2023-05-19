package com.entity;

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
     */
    @ExcelProperty(value = "经营主体")
    private String jyzt;
    /**
     * 主体业态
     */
    private String ztyt;
    /**
     * 所属专业范围
     */
    private String sszyfw;

    /**
     * 监管状态
     */
    private String jgzt;
    /**
     * 地址类型
     */
    private String dzlx;
    /**
     * 市州编码
     */
    @ExcelProperty(value = "地市")
    private String szbm;
    /**
     * 区市县编码
     */
    @ExcelProperty(value = "区市县")
    private String qsxbm;
    /**
     * 乡镇街道编码
     */
    @ExcelProperty(value = "乡镇街道")
    private String xzjdbm;
    /**
     * 社会信用代码
     */
    @ExcelProperty(value = "社会信用代码")
    private String shxydm;
    /**
     * 备案号
     */
    @ExcelProperty(value = "备案号")
    private String bah;
    /**
     * 经营者姓名
     */
    @ExcelProperty(value = "经营者")
    private String jyz;
    /**
     * 身份证号
     */
    @ExcelProperty(value = "身份证号")
    private String sfzhm;
    /**
     * 联系电话
     */
    @ExcelProperty(value = "联系电话")
    private String lxdh;
    /**
     * 营业地址
     */
    @ExcelProperty(value = "营业地址")
    private String yydz;
    /**
     * 备案状态
     */
    private String qyzt;
    /**
     * 食品类别
     */
    @ExcelProperty(value = "食品类别")
    private String splbTree;
    /**
     * 销售范围
     */
    @ExcelProperty(value = "销售范围")
    private String spxsTree;

}
