package org.legalaid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author xiong
 * @version 1.0
 * @description
 * @date 2023/4/16 16:42:06
 */
@SpringBootApplication
public class LegalAidApplication {
    public static void main(String[] args) {
        SpringApplication.run(LegalAidApplication.class,args);
        System.out.println("启动成功");
    }
}
