package com.yang.config;

import com.yang.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

// 本身就包含@Component注解，也就是本身就是一个组件，会被Spring托管
// @Configuration代表这是一个配置类，就和之前看的xml内的<beans></beans>

@Configuration
@ComponentScan("com.yang.entity")
@Import(value = ImportConfig.class)
public class MyConfig {

    // 注册一个bean,就相当于<bean></bean>
    // 方法名等于bean标签中的id属性
    // 返回值等于bean标签中的class属性

//    @Bean
//    public User getUser(){
//        // 返回要注入bean的对象
//        return new User();
//    }
}
