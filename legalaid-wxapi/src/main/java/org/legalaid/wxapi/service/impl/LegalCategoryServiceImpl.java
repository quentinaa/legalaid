package org.legalaid.wxapi.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.legalaid.wxapi.domain.LegalAd;
import org.legalaid.wxapi.domain.LegalCategory;
import org.legalaid.wxapi.mapper.LegalAdMapper;
import org.legalaid.wxapi.mapper.LegalCategoryMapper;
import org.legalaid.wxapi.service.LegalAdService;
import org.legalaid.wxapi.service.LegalCategoryService;
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
public class LegalCategoryServiceImpl implements LegalCategoryService {

    @Autowired
    private LegalCategoryMapper legalCategoryMapper;


    @Override
    public List<LegalCategory> selectLegalCategoryList(LegalCategory legalCategory) {
        QueryWrapper<LegalCategory> qw=new QueryWrapper<>();

        return  legalCategoryMapper.selectList(qw);
    }

    @Override
    public int deleteLegalCategoryById(Integer legalCategoryId) {
        return legalCategoryMapper.deleteById(legalCategoryId);
    }
}
