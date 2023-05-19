package com.example.importdemo;

import com.example.importdemo.service.SmallBusinessService;
import org.apache.http.entity.ContentType;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


@Component
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
class ImportdemoApplicationTests {
    @Autowired
    SmallBusinessService smallBusinessService;

    @Test
    void contextLoads() throws IOException {
        String PATH = "C:\\Users\\86187\\Desktop\\临时文档\\导入excel\\";
        String fileName = PATH + "小经营店销售模板.xlsx";
        File picFile = new File(fileName);
        FileInputStream fileInputStream = new FileInputStream(picFile);
        MultipartFile multipartFile = new MockMultipartFile(picFile.getName(), picFile.getName(),
                ContentType.APPLICATION_OCTET_STREAM.toString(), fileInputStream);
        smallBusinessService.importSmallBusiness(multipartFile);
    }

}
