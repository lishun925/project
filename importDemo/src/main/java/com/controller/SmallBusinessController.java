package com.controller;

import com.service.SmallBusinessService;
import com.utils.ResultMsg;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @author:lishun
 * @create: 2022-10-13 15:48
 * @Description: 控制器
 */
@Controller
@RequestMapping("/smallBusiness")
public class SmallBusinessController {

    @Resource
    private SmallBusinessService smallBusinessService;


    @RequestMapping("request!importBatch.do")
    public String importBatch(@RequestPart("file") MultipartFile file, HttpServletRequest request) {
        ResultMsg resultMsg = new ResultMsg();
        try {
            resultMsg = smallBusinessService.importSmallBusiness(file);
        } catch (Exception e) {
            resultMsg = new ResultMsg(false, "上传失败，请检查上传的excel文件！");
        } finally {
        }
        return null;
    }

}
