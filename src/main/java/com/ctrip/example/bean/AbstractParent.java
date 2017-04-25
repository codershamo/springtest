package com.ctrip.example.bean;

import com.ctrip.example.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

/**
 * @author xuefeng.sha
 * @email xuefeng.sha@qunar.com
 * @date 2017/4/11 16:27
 */
public abstract class AbstractParent {
    private static final Logger LOGGER = LoggerFactory.getLogger(AbstractParent.class);
    private String name;
    @Resource
    private TestService testService;

    protected void parentSay() {
        testService.sayHello();
        System.out.println(name);
    }

    @PostConstruct
    void init() {
        name = "sha";
        testService.sayHello();
        System.out.println("init");
        LOGGER.info("log init");
    }

    public AbstractParent() {
        System.out.println("parent construct");
    }
}

