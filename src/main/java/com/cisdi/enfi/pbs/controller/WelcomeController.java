package com.cisdi.enfi.pbs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

    @RequestMapping("/hello")
    public String Welcome(ModelMap map){
        map.put("name","zkw");
        return "hello";
    }

    @RequestMapping("/login")
    public String Login(ModelMap map){
        map.put("name","zkw");
        return "login";
    }

    @RequestMapping("/test")
    public String EasyUITest(ModelMap map){
        map.put("name","zkw");
        return "easyui/test";
    }

}
