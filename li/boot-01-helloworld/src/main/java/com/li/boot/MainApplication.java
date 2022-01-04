package com.li.boot;

import com.li.boot.bean.Car;
import org.apache.naming.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
//@SpringBootConfiguration
//@EnableAutoConfiguration
//@ComponentScan("com.li.boot")
public class MainApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class, args);
        String[] names = run.getBeanDefinitionNames();
        for (String name : names) {
            System.err.println(name);
        }
        boolean tomcat001 = run.containsBean("tomcat001");
        System.out.println("tomcat001:"+tomcat001);
        boolean user01 = run.containsBean("user01");
        System.out.println("user01:"+user01);
        //BeanFactory a = null;
        //ApplicationContext b =null;
        boolean hehe = run.containsBean("hehe");
        System.out.println("hehe:"+hehe);
        boolean haha = run.containsBean("haha");
        System.out.println("haha:"+haha);
    }
}
