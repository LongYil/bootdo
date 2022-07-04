package com.bootdo.system.service.impl;

import com.bootdo.system.service.DemoService;
import org.springframework.stereotype.Service;

/**
 * @author liyinlong
 * @since 2022/6/8 9:25 上午
 */
@Service("zeus")
public class DemoServiceImpl implements DemoService {

    @Override
    public String login() {
        return "zeus";
    }
}
