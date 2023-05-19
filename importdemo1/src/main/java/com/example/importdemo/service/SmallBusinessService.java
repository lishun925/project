package com.example.importdemo.service;

import com.example.importdemo.utils.ResultMsg;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * @author:lishun
 * @create: 2022-10-13 09:58
 * @Description:
 */
public interface SmallBusinessService {

    ResultMsg importSmallBusiness(MultipartFile file) throws IOException;
}
