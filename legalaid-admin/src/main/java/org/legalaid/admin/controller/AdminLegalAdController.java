package org.legalaid.admin.controller;

import org.legalaid.admin.domain.AdminLegalAd;
import org.legalaid.admin.service.AdminLegalAdService;
import org.legalaid.common.core.controller.BaseController;
import org.legalaid.common.core.domain.AjaxResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * @author xiong
 * @version 1.0
 * @description
 * @date 2023/4/19 19:54:28
 */
@RestController
@RequestMapping("/admin/ad")
public class AdminLegalAdController extends BaseController {
    @Autowired
    private AdminLegalAdService adminLegalAdService;

    @GetMapping("/list")
    public List<AdminLegalAd> list(AdminLegalAd legalAd){
        List<AdminLegalAd> legalAds = adminLegalAdService.selectLegalAdList(legalAd);
        return legalAds;
    }

    /**
     * 插入轮播图
     * @param adminLegalAd
     * @return
     */
    @PostMapping("/addAdminLegalAd")
    public AjaxResult addAdminLegalAd(@RequestBody AdminLegalAd adminLegalAd){
      return toAjax(adminLegalAdService.saveAdminLegalAd(adminLegalAd));
    }
}
