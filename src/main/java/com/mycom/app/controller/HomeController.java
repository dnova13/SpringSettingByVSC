package com.mycom.app.controller;

import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Model model) {

        model.addAttribute("title", "Home");
        return "home";
    }

    @RequestMapping(value = "/ex", method = RequestMethod.GET)
    public String ex(Model model) {

        model.addAttribute("title", "EX");
        return "ex";
    }
}