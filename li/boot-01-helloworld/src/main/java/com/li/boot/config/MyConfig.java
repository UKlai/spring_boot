package com.li.boot.config;

import ch.qos.logback.core.db.DBHelper;
import com.li.boot.bean.Car;
import com.li.boot.bean.Pet;
import com.li.boot.bean.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Import({User.class, DBHelper.class})
@Configuration(proxyBeanMethods=true)
@ImportResource("classpath:beans.xml")
@EnableConfigurationProperties(Car.class)
public class MyConfig {
    @Bean("tomcat001")
    public Pet tomcat(){
        return new Pet("tomcat");
    }

    @Bean
    @ConditionalOnBean(name = "tomcat001")
    public User user01(){
        return new User("zs",18);
    }
}
