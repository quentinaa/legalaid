package org.legalaid.service;

import org.legalaid.domain.LegalAd;

import java.util.List;

public interface LegalAdService {
    //查询广告列表
    List<LegalAd> selectLegalAdList(LegalAd legalAd);
}
