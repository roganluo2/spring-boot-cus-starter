# 自定义starter流程
1.新建maven项目并且引入相应依赖
````xml
<dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-autoconfigure</artifactId>
      <version>1.5.9.RELEASE</version>
    </dependency>
````
2.添加属性配置类（非必须）
@ConfigurationProperties(prefix="hello")
注入以hello开头的配置
3.条件配置类，@ConditionalOnClass关联的类配置条件
4.自动配置类
注解@ConditionalOnClass等条件的指定
5.注册配置
在src/main/resources 下新建META-INF/spring.factories
添加org.springframework.boot.autoconfigure.EnableAutoConfiguration=需要扫描的类
