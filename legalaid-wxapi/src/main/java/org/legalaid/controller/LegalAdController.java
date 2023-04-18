package org.legalaid.controller;

import org.legalaid.common.core.controller.BaseController;
import org.legalaid.domain.LegalAd;
import org.legalaid.service.LegalAdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author xiong
 * @version 1.0
 * @description
 * @date 2023/4/17 20:07:10
 */
@RestController
@RequestMapping("/legal/ad")
public class LegalAdController extends BaseController {
    @Autowired
    private LegalAdService legalAdService;


    @GetMapping("/list")
    public List<LegalAd> list(LegalAd legalAd){
        List<LegalAd> legalAds = legalAdService.selectLegalAdList(legalAd);
        return legalAds;
    }
    //添加广告
    @PostMapping("/addLegalAds")
    public void addLegalAds(@RequestBody LegalAd legalAd){
        legalAdService.addLegalAds(legalAd);
    }
    //修改广告
    @PostMapping("/updateLegalAds")
    public void updateLegalAds(@RequestBody LegalAd legalAd){
        legalAdService.updateLegalAds(legalAd);
    }
    //删除广告
    @GetMapping("/deleteLegalAdsById/{id}")
    public List<LegalAd> deleteLegalAds(@PathVariable Integer id){
        legalAdService.deleteLegalAdsById(id);
        return legalAdService.selectLegalAdList(null);
    }
}
