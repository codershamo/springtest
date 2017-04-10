package com.ctrip.example;

import com.ctrip.example.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author xuefeng.sha
 * @email xuefeng.sha@qunar.com
 * @date 2017/3/31 17:45
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.sayHello();
    }
}

