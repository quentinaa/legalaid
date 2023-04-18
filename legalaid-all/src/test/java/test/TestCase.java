package test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.legalaid.LegalAidApplication;
import org.legalaid.domain.LegalAd;
import org.legalaid.mapper.LegalAdMapper;
import org.legalaid.service.LegalAdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author xiong
 * @version 1.0
 * @description
 * @date 2023/4/17 19:20:19
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = LegalAidApplication.class)
public class TestCase {
    @Autowired
    private LegalAdMapper legalAdMapper;
    @Autowired
    private LegalAdService legalAdService;
    @Test
    public void LegalAdMapperTest(){
        System.out.println(legalAdMapper.toString());
        List<LegalAd> legalAds = legalAdMapper.selectList(null);
        System.out.println(legalAds);
    }

    @Test
    public void LegalAdServiceTest(){
        LegalAd legalAd=new LegalAd();
        legalAd.setPosition("1");
        System.out.println(legalAdService.selectLegalAdList(legalAd));
    }
    @Test
    public void addLegalAds( ){
       LegalAd legalAd=new LegalAd();
       long id=2;
       legalAd.setId(id);
        legalAd.setLink("1");
        legalAd.setName("zy");
        legalAd.setPosition("1");
        legalAd.setUrl("1");
        legalAdService.addLegalAds(legalAd);
    }
    @Test
    public void deleteLegalAdsById() {
        legalAdService.deleteLegalAdsById(2);
    }
}
