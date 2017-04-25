package com.ctrip.example.service;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

/**
 * @author xuefeng.sha
 * @email xuefeng.sha@qunar.com
 * @date 2017/4/14 18:28
 */
@Component
public class StaticTestService {
    private static UserService userService;
    @Resource
    private UserService userService1;

    @PostConstruct
    void init() {
        userService = userService1;
    }

    public static void test() {
        System.out.println("static");
        userService.sayHello();
    }
}

