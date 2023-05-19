package com.service;

import com.utils.ResultMsg;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @author:lishun
 * @create: 2022-10-13 09:58
 * @Description:
 */
@Service
public interface SmallBusinessService {

    ResultMsg importSmallBusiness(MultipartFile file) throws IOException;
}
