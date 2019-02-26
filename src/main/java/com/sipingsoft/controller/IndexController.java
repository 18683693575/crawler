package com.sipingsoft.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Chuan.Chen
 * @version 1.0.0
 * @description
 * @contact chuan.chen@sipingsoft.com
 * @createTime 2019年02月26日 14:39:00
 */
@RestController
public class IndexController {

    @Value("${server.port:8031}")
    private String host;

    @RequestMapping("/getIndex")
    public String getIndex(){
        return "getIndex";
    }

    @RequestMapping("/getHost")
    public String getHost(){
        return host;
    }

    @RequestMapping("/getHost1")
    public String getHost1(){
        return host;
    }
}
