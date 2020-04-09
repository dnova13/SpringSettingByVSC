package com.mycom.app.controller;

import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    //@RequestMapping(value = "/ex", method = RequestMethod.GET)
    // RequestMapping 보다 간단한 어노테이션
    // post 방식은 @PostMapping 이용
    @GetMapping( value = {"/","/home"}) 
                     
    public String home(Model model) {

        model.addAttribute("title", "Home");
        return "home";
    }

    @GetMapping("/ex")
    public String ex(Model model) {

        model.addAttribute("title", "EX");
        return "ex";
    }
}