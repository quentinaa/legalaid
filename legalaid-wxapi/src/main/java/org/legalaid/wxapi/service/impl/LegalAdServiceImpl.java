package org.legalaid.wxapi.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.legalaid.wxapi.domain.LegalAd;
import org.legalaid.wxapi.mapper.LegalAdMapper;
import org.legalaid.wxapi.service.LegalAdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author xiong
 * @version 1.0
 * @description
 * @date 2023/4/17 19:44:28
 */
@Service
public class LegalAdServiceImpl implements LegalAdService {

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

    @Override
    public void addLegalAds(LegalAd legalAd) {
        int insert = legalAdMapper.insert(legalAd);
        if (insert>0){
            System.out.println("添加成功");
        }else {
            throw new RuntimeException();
        }
    }

    @Override
    public void updateLegalAds(LegalAd legalAd) {
        legalAd.setAddTime(new Date());
        legalAdMapper.updateById(legalAd);
    }

    @Override
    public void deleteLegalAdsById(Integer id) {
        legalAdMapper.deleteById(id);
    }
}
