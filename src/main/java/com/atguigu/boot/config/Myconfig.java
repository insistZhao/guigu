package com.atguigu.boot.config;

import com.atguigu.boot.bean.Car;
import com.atguigu.boot.bean.Pet;
import com.atguigu.boot.bean.User;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 默认也是单实例的
 * 配置类本身也是组件
 *
 */
@Configuration(proxyBeanMethods = true)
@EnableConfigurationProperties(Car.class)
public class Myconfig {
    @Bean
    public User user1(){
        return new User("张三",12);
    }
    @Bean
    public Pet pet1(){
        return new Pet("小狗");
    }
 }
