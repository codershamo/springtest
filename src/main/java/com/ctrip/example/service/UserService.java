package com.ctrip.example.service;

import com.ctrip.example.bean.User;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author xuefeng.sha
 * @email xuefeng.sha@qunar.com
 * @date 2017/3/31 17:58
 */
@Service
public class UserService {
    @Resource
    private ApplicationContext applicationContext;

    public void sayHello() {
        User user = applicationContext.getBean(User.class, "sha", 1);
        User user1 = applicationContext.getBean(User.class, "xue", 2);

        System.out.println(user == user1);
        System.out.println(user.getName());
        System.out.println(user1.getName());
    }
}

