package org.legalaid.controller;

import org.legalaid.common.core.controller.BaseController;
import org.legalaid.domain.LegalAd;
import org.legalaid.service.LegalAdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

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
}
