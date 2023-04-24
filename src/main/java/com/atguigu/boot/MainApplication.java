package com.atguigu.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 *主程序类
 */
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        //返回ioc容器
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class, args);
        //查看容器内的组件
        String[] beanDefinitionNames = run.getBeanDefinitionNames();
        for (String name : beanDefinitionNames) {
            System.out.println(name);
        }

    }
}
