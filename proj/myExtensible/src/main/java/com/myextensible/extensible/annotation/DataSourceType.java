package com.myextensible.extensible.annotation;

import com.myextensible.extensible.common.DataSourceTypeEnum;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author:lishun
 * @create: 2022-05-11 14:53
 * @Description: 数据源类型
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface DataSourceType {
    DataSourceTypeEnum value() default DataSourceTypeEnum.master;
}
