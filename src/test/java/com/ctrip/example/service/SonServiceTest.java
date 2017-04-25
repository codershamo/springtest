package com.ctrip.example.service;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.Set;

/**
 * @author xuefeng.sha
 * @email xuefeng.sha@qunar.com
 * @date 2017/4/11 16:31
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class SonServiceTest {

    @Resource
    private StaticTestService staticTestService;

    @Resource
    private SonService sonService;

    @Test
    public void TestSonSay() {
        sonService.sonSay();
    }

    @Test
    public void testStatic(){
        staticTestService.test();
    }

    @Test
    public void scan() {
        System.out.println("start");
        ClassScaner scaner = new ClassScaner();
        Set<Class> bean = scaner.doScan("com.ctrip.example.bean");
        bean.forEach(e -> System.out.println(e.getName()));
    }
}
