package com.bootdo.system.controller;

import com.bootdo.system.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;


/**
 * @author liyinlong
 * @since 2022/6/8 9:22 上午
 */
@RequestMapping("/demo")
public class DemoController {


    @Autowired
    private DemoService demoService;

    @GetMapping("/test")
    public String test(){
        return demoService.login();
    }

}
