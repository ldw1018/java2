package com.bdqn.oop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

//@ImportResource(locations = {"classpath:bean.xml"})//导入外部配置文件
@SpringBootApplication
public class OopApplication {

    public static void main(String[] args) {
		System.out.println(111)
        SpringApplication.run(OopApplication.class, args);
    }
}
