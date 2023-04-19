package org.legalaid.admin.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import org.legalaid.admin.domain.AdminLegalAd;

import java.util.List;

public interface AdminLegalAdService {
    //查询广告列表
    List<AdminLegalAd> selectLegalAdList(AdminLegalAd legalAd);

    void addLegalAds(AdminLegalAd legalAd);

    void updateLegalAds(AdminLegalAd legalAd);

    void deleteLegalAdsById(Integer id);

    //分页查询
    /**
     *
     * @param pageNum 当前第几页
     * @param pageSize 每页显示多少条
     * @param adminLegalAd 查询参数对象
     * @return
     */
    IPage<AdminLegalAd> adminPageList(int pageNum,int pageSize,AdminLegalAd adminLegalAd);

    /**
     * 新增轮播
     * @param adminLegalAd
     * @return
     */
    int saveAdminLegalAd(AdminLegalAd adminLegalAd);
}
