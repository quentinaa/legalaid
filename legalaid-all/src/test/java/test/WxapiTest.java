package test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.legalaid.LegalAidApplication;
import org.legalaid.wxapi.domain.LegalAd;
import org.legalaid.wxapi.domain.LegalCategory;
import org.legalaid.wxapi.mapper.LegalAdMapper;
import org.legalaid.wxapi.mapper.LegalCategoryMapper;
import org.legalaid.wxapi.service.LegalAdService;
import org.legalaid.wxapi.service.LegalCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author xiong
 * @version 1.0
 * @description
 * @date 2023/4/20 22:47:10
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = LegalAidApplication.class)
public class WxapiTest {
    @Autowired
    private LegalCategoryMapper legalCategoryMapper;
    @Autowired
    private LegalCategoryService legalCategoryService;
    @Test
    public void LegalAdMapperTest(){
        System.out.println(legalCategoryMapper.toString());
        List<LegalCategory> legalCategories = legalCategoryMapper.selectList(null);
        System.out.println(legalCategories);
    }

    @Test
    public void LegalAdServiceTest(){
       LegalCategory legalCategory=new LegalCategory();
        System.out.println(legalCategoryService.selectLegalCategoryList(legalCategory));
    }

    @Test
    public void deleteLegalCategoryById(){
        Integer id=1036007;
        legalCategoryService.deleteLegalCategoryById(id);
    }
}
