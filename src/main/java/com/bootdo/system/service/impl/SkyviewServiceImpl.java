package com.bootdo.system.service.impl;

import com.bootdo.system.service.DemoService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

/**
 * @author liyinlong
 * @since 2022/6/8 9:26 上午
 */
@Service("skyview")
@ConditionalOnProperty(value="system.usercenter",havingValue = "skyview")
public class SkyviewServiceImpl implements DemoService {

    @Override
    public String login() {

        return "skyview";
    }
}
