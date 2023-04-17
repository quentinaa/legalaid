package org.legalaid.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.legalaid.domain.LegalAd;
import org.legalaid.mapper.LegalAdMapper;
import org.legalaid.service.LegalAdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xiong
 * @version 1.0
 * @description
 * @date 2023/4/17 19:44:28
 */
@Service
public class LegalAdServiceImpl implements LegalAdService  {

    @Autowired
    private LegalAdMapper legalAdMapper;

    //查询广告列表
    @Override
    public List<LegalAd> selectLegalAdList(LegalAd legalAd) {
        QueryWrapper<LegalAd> qw=new QueryWrapper();
        qw.eq("position",legalAd.getPosition());
        List<LegalAd> legalAds = legalAdMapper.selectList(qw);
        return legalAds;
    }
}
