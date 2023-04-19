package test;

import com.baomidou.mybatisplus.core.metadata.IPage;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.legalaid.LegalAidApplication;
import org.legalaid.admin.domain.AdminLegalAd;
import org.legalaid.admin.service.AdminLegalAdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author xiong
 * @version 1.0
 * @description
 * @date 2023/4/19 19:08:12
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = LegalAidApplication.class)
public class AdminTest {
    @Autowired
    private AdminLegalAdService adminLegalAdService;

    @Test
    public void findAdminLegalAdList(){
        AdminLegalAd adminLegalAd=new AdminLegalAd();
        List<AdminLegalAd> adminLegalAds = adminLegalAdService.selectLegalAdList(adminLegalAd);
        System.out.println(adminLegalAds);
    }

    @Test
    public void adminPageList(){
        AdminLegalAd ad=new AdminLegalAd();
        IPage<AdminLegalAd> iPage = adminLegalAdService.adminPageList(0, 5, ad);
        System.out.println(iPage.getPages());
        System.out.println(iPage.getCurrent());
        System.out.println(iPage.getSize());
        System.out.println(iPage.getTotal());

    }
    @Test
    public void saveAdminLegalAd(){
        AdminLegalAd ad=new AdminLegalAd();
        ad.setContent("3");
        ad.setDeleted("3");
        ad.setEnabled("3");
        ad.setLink("3");
        ad.setName("3");
        ad.setUrl("2334");
        adminLegalAdService.saveAdminLegalAd(ad);
    }
}
