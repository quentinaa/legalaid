package org.legalaid.service;

import org.legalaid.domain.LegalAd;

import java.util.List;

public interface LegalAdService {
    //查询广告列表
    List<LegalAd> selectLegalAdList(LegalAd legalAd);

    void addLegalAds(LegalAd legalAd);

    void updateLegalAds(LegalAd legalAd);

    void deleteLegalAdsById(Integer id);
}
