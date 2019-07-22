package com.bdqn.oop.config;

import com.bdqn.oop.controller.UserService;
import com.bdqn.oop.controller.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author ldwjava
 * @Date 2018/6/2 10:37
 * @Desc TODO
 **/

@Configuration   //表明当前类是一个配置类
public class MyAppConfig {
    /**
     * 将方法返回值 注入容器 ,组件名默认  方法名
     * @return
     */
    @Bean
    public UserService userService() {
        return new UserServiceImpl();
    }
}
