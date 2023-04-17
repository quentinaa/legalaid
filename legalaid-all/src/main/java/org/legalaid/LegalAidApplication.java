package org.legalaid;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author xiong
 * @version 1.0
 * @description
 * @date 2023/4/16 16:42:06
 */
@SpringBootApplication
@MapperScan("org.legalaid.mapper")//指定mapper持久层接口所在包路径
public class LegalAidApplication {
    public static void main(String[] args) {
        SpringApplication.run(LegalAidApplication.class,args);
        System.out.println("启动成功");
    }
}
