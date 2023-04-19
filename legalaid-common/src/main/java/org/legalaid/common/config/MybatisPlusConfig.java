package org.legalaid.common.config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.context.annotation.Bean;

/**
 * @author xiong
 * @version 1.0
 * @description
 * @date 2023/4/19 18:54:05
 */
public class MybatisPlusConfig {
    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor() {
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor(); //配置插件类
        interceptor.addInnerInterceptor(new PaginationInnerInterceptor(DbType.MYSQL)); //具体到配置哪一个插件
        return interceptor;
    }
}
