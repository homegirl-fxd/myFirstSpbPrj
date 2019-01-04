package com.xiaodan.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by fengxiaodan on 2018/6/14.
 */
@RestController
public class MiyaController {
    @Value("${my.name}")
    private String name;
    @Value("${my.age}")
    private  String age;

    @RequestMapping(value="/miya")
    public String miya() {
        return name+":"+age;
    }
}
