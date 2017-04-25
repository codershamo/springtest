package com.ctrip.example.service;

import com.ctrip.example.bean.AbstractParent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @author xuefeng.sha
 * @email xuefeng.sha@qunar.com
 * @date 2017/4/11 16:30
 */
@Service
public class SonService extends AbstractParent {
    private static final Logger LOG = LoggerFactory.getLogger(SonService.class);

    public void sonSay() {
        parentSay();
    }

    public SonService() {
        LOG.error("sha");
        LOG.info("xue");
        System.out.println("son construct");
    }
}

