package com.example.importdemo.utils;

import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.unit.DataSize;

import javax.servlet.MultipartConfigElement;

/**
 * @author:lishun
 * @create: 2022-10-25 09:55
 * @Description: 文件上传配置类
 */
@Configuration
public class FileUploadConfig {
    @Bean
    public MultipartConfigElement multipartConfigElement() {
        MultipartConfigFactory factory = new MultipartConfigFactory();
        // 单个数据大小
        factory.setMaxFileSize(DataSize.parse("102400KB")); // KB,MB
        // 总上传数据大小
        factory.setMaxRequestSize(DataSize.parse("1024000KB"));
        return factory.createMultipartConfig();
    }
}
