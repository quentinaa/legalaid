package org.legalaid.wxapi.controller;

import org.legalaid.common.core.controller.BaseController;
import org.legalaid.common.core.domain.AjaxResult;
import org.legalaid.wxapi.domain.LegalAd;
import org.legalaid.wxapi.domain.LegalCategory;
import org.legalaid.wxapi.service.LegalAdService;
import org.legalaid.wxapi.service.LegalCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author xiong
 * @version 1.0
 * @description 广告控制层
 * @date 2023/4/17 20:07:10
 */
@RestController
@RequestMapping("/legal/category")
public class LegalCategoryController extends BaseController {
    @Autowired
    private LegalCategoryService legalCategoryService;

    //查询业务列表
    @GetMapping("/categoryList")
    public List<LegalCategory> list(LegalCategory legalCategory){
        List<LegalCategory> LegalCategoryList = legalCategoryService.selectLegalCategoryList(legalCategory);
        return LegalCategoryList;
    }

    //逻辑删除业务
    @DeleteMapping   ("/deleteLegalCategoryById/{id}")
    public AjaxResult deleteLegalCategoryById(@PathVariable int id){
        System.out.println(id);
        return toAjax( legalCategoryService.deleteLegalCategoryById(id));
    }
}
