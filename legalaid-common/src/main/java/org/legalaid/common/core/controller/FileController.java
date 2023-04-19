package org.legalaid.common.core.controller;

import cn.xuyanwu.spring.file.storage.FileInfo;
import cn.xuyanwu.spring.file.storage.FileStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author xiong
 * @version 1.0
 * @description
 * @date 2023/4/18 20:10:06
 */
@RestController
public class FileController {
    @Autowired
    private FileStorageService fileStorageService;//注入实列
    /**
     * 上传文件，成功返回文件 url
     */
    @PostMapping("/upload")
    public String upload(MultipartFile file) {
        FileInfo fileInfo = fileStorageService.of(file).upload();  //将文件上传到对应地方
        //System.out.println(fileInfo.toString());
        //System.out.println(fileInfo.getUrl());
        return fileInfo == null ? "上传失败！" : fileInfo.getUrl();
    }

}
