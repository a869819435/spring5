package com.yang.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
/** 扫描Bean并注入 */
@ComponentScan({"com.yang.dao","com.yang.service"})
@Import(value = SpringDaoConfig.class)
/** 开启事务支持 */
@EnableTransactionManagement
public class ApplicationConfig {

}
