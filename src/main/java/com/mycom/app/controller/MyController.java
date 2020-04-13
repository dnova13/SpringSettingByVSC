package com.mycom.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MyController {

    @GetMapping("/{name}.html")
    public String page(@PathVariable String name, Model model) {
        model.addAttribute("pageName", name);
        return "page";
    }
}