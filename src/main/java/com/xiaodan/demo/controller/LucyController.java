package com.xiaodan.demo.controller;

import com.xiaodan.demo.bean.ConfigBean;
import com.xiaodan.demo.bean.UserBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by fengxiaodan on 2018/6/14.
 */
@RestController
@EnableConfigurationProperties({ConfigBean.class})
public class LucyController {
    @Autowired
    ConfigBean configBean;

    @RequestMapping(value = "/lucy")
    public String miya () {
        return configBean.getName()+" : "+configBean.getAge();
    }

    @Autowired
    UserBean user;

    @RequestMapping(value ="/user")
    public String user() {
        return user.getName() +" : " + user.getAge();
    }
}
