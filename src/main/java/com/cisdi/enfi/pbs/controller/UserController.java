package com.cisdi.enfi.pbs.controller;

import com.cisdi.enfi.pbs.domain.Monkeys;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {
    private Logger logger = LoggerFactory.getLogger(UserController.class);

    @RequestMapping("/login")
    @ResponseBody
    public Map<String,Object> getResult(@RequestParam(value="username",required = true) String username,
                                  @RequestParam(value="password",required = true) String password){
        Map<String,Object> map = new HashMap<>();
        if(username.equals("a") && password.equals("b")){
            map.put("msg","OK");
        }
        else
            map.put("msg","ERROR");
        return map;
    }

    @RequestMapping("/testJson1")
    public void getUserJSON1(HttpServletResponse response) throws IOException {
        response.setContentType("application/json");
        response.getWriter().println("{\"name\":\"third\",\"id\":\"1\"}");
    }

    @RequestMapping("/testJson2")
    @ResponseBody
    public Monkeys getUserJSON2() {
        Monkeys monkeys=new Monkeys();
        monkeys.setId(10);
        monkeys.setName("pig");
        monkeys.setAge(20);
        monkeys.setGender("F");
        return monkeys;
    }

    @RequestMapping("/testJson3")
    @ResponseBody
    public Map<String,Object> getUserJSON3() {
        Map<String,Object> map = new HashMap<>();
        map.put("name","掌声");
        map.put("age",10);
        map.put("array",new String[]{"a","b","c"});
        return map;
    }

}
