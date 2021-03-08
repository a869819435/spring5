package com.yang.config;

import com.yang.dao.UserMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.jetbrains.annotations.NotNull;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class SpringDaoConfig {

    /**
     * 配置数据源
     * @return
     */
    @Bean
    public DriverManagerDataSource getDataSource(){
        // 返回要注入bean的对象
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/mybatis?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone=Asia/Shanghai&autoReconnect=true&failOverReadOnly=false");
        dataSource.setUsername("root");
        dataSource.setPassword("123456");
        return dataSource;
    }

    /**
     * 配置sqlSessionFactory(链接sql的工厂)
     * @return
     * @throws Exception
     */
    @Bean
    public SqlSessionFactory getSqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
        sqlSessionFactory.setDataSource(this.getDataSource());
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        try {
            sqlSessionFactory.setConfigLocation(resolver.getResource("classpath:mybatis-config.xml"));
            // @MapperScan(basePackages = { "com.yang.dao" })可以在配置文件开头写入这代替下面的扫描
            sqlSessionFactory.setMapperLocations(resolver.getResource("classpath:mapper/UserMapper.xml"));
            sqlSessionFactory.setTypeAliasesPackage("mapper");
            return sqlSessionFactory.getObject();
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    /**
     * 注入sqlSession到Spring
     * @return
     * @throws Exception
     */
    @Bean
    public SqlSessionTemplate getSqlSession() throws Exception {
        try {
            return new SqlSessionTemplate(this.getSqlSessionFactory());
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    /**
     * 声名式事务(mybatis-spring会自动植入切点)
     * @return
     */
    @Bean
    public DataSourceTransactionManager transactionManger(){
        return new DataSourceTransactionManager(this.getDataSource());
    }

    @Bean
    public UserMapper userMapper(@NotNull SqlSessionTemplate sqlSessionTemplate){
        return sqlSessionTemplate.getMapper(UserMapper.class);
    }

}
