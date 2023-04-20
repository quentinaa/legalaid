package org.legalaid.wxapi.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.legalaid.wxapi.domain.LegalAd;
import org.legalaid.wxapi.domain.LegalCategory;
import org.springframework.stereotype.Repository;

@Repository
public interface LegalCategoryMapper extends BaseMapper<LegalCategory> {

}
