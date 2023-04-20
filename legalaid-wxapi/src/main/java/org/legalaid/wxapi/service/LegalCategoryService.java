package org.legalaid.wxapi.service;

import org.legalaid.wxapi.domain.LegalAd;
import org.legalaid.wxapi.domain.LegalCategory;

import java.util.List;

public interface LegalCategoryService {
    //查询业务列表
    List<LegalCategory> selectLegalCategoryList(LegalCategory legalCategory);

   // void addLegalAds(LegalCategory legalCategory);

    //void updateLegalAds(LegalCategory legalCategory);

    int deleteLegalCategoryById(Integer legalCategoryId);
}
