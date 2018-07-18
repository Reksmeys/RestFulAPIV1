package com.reksmey.demo.controllers.ui;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class filterCustomController {

    @GetMapping("/index")
    public String filter(ModelMap m){
        m.addAttribute("name", "helele");
        return "index";
    }
}
