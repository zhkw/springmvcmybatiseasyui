package com.cisdi.enfi.pbs.controller;

import com.cisdi.enfi.pbs.domain.Monkeys;
import com.cisdi.enfi.pbs.service.MonkeysService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MonkeyController {
    @Autowired
    private MonkeysService monkeysService;

    @RequestMapping("/monkey")
    public String getMonkey(Model model){
        Monkeys monkey = monkeysService.getMonkey(1);
        model.addAttribute("item",monkey);
        return "monkey";

    }
}
