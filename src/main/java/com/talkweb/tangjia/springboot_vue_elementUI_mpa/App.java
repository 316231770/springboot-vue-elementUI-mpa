package com.talkweb.tangjia.springboot_vue_elementUI_mpa;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@MapperScan(basePackages="com.talkweb.tangjia.springboot_vue_elementUI_mpa.dao")
public class App 
{
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
