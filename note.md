## 常用依赖
```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
       http://www.springframework.org/schema/beans/spring-beans.xsd
       http://www.springframework.org/schema/context
       https://www.springframework.org/schema/context/spring-context.xsd">

    <!-- 指定要扫描的包路径,这个包下的注解就会生效 -->
    <context:component-scan base-package="com.yang.entity"/>
    <context:annotation-config/>
    
</beans>
```

## 注解说明
- @Autowired：自动装配先通过类型，然后名字
    - @Qualifier(value="xxx"): 如果Autowired不能唯一自动装配上属性，则需要通过这个注解起别名
- @Nullable：字段标记了这个注解,说明这个字段可以为null
- @Resource：自动装配先通过名称，然后类型
- @Component：组件，放在类上，说明这个类被Spring管理了
- @Scope("xxx")：采用什么模式进行实例化




