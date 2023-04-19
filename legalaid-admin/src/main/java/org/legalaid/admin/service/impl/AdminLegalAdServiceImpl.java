package org.legalaid.admin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.legalaid.admin.domain.AdminLegalAd;
import org.legalaid.admin.mapper.AdminLegalAdMapper;
import org.legalaid.admin.service.AdminLegalAdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * @author xiong
 * @version 1.0
 * @description
 * @date 2023/4/17 19:44:28
 */
@Service
public class AdminLegalAdServiceImpl implements AdminLegalAdService {

    @Autowired
    private AdminLegalAdMapper adminLegalAdMapper;

    //查询广告列表
    @Override
    public List<AdminLegalAd> selectLegalAdList(AdminLegalAd legalAd) {
        QueryWrapper<AdminLegalAd> qw=new QueryWrapper();
        qw.eq("position",legalAd.getPosition());
        List<AdminLegalAd> legalAds = adminLegalAdMapper.selectList(qw);
        return legalAds;
    }

    @Override
    public void addLegalAds(AdminLegalAd legalAd) {
        int insert = adminLegalAdMapper.insert(legalAd);
        if (insert>0){
            System.out.println("添加成功");
        }else {
            throw new RuntimeException();
        }
    }

    @Override
    public void updateLegalAds(AdminLegalAd legalAd) {
        legalAd.setAddTime(new Date());
        adminLegalAdMapper.updateById(legalAd);
    }

    @Override
    public void deleteLegalAdsById(Integer id) {
        adminLegalAdMapper.deleteById(id);
    }

    @Override
    public IPage<AdminLegalAd> adminPageList(int pageNum, int pageSize, AdminLegalAd adminLegalAd) {
        QueryWrapper<AdminLegalAd> qw=new QueryWrapper<>();
        //判断前端传过来的名字，或者位置不为空，才做名字模糊查询，位置相等的条件查询
        if (Objects.nonNull(adminLegalAd.getName())||Objects.nonNull(adminLegalAd.getPosition())){
            qw.like("name",adminLegalAd.getName()).or(w->w.eq("position",adminLegalAd.getPosition()));
        }
        Page<AdminLegalAd> page=new Page<>(pageNum,pageSize);
        return adminLegalAdMapper.selectPage(page,qw);
    }

    @Override
    public int saveAdminLegalAd(AdminLegalAd adminLegalAd) {
        return adminLegalAdMapper.insert(adminLegalAd);
    }
}
