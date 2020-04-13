package com.mycom.app.controller;

import java.util.List;

import com.mycom.app.dto.BoardDTO;
import com.mycom.app.service.BoardService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {


    @Autowired
    BoardService service;

    //@RequestMapping(value = "/ex", method = RequestMethod.GET)
    // RequestMapping 보다 간단한 어노테이션
    // post 방식은 @PostMapping 이용
    @GetMapping( value = {"/","/home"}) 
                     
    public String home(Model model) {

        model.addAttribute("title", "Home");
        //return "/WEB-INF/home";
        return "home";
    }

    @GetMapping("/ex")
    public String ex(Model model) {

        List<BoardDTO> bList = service.getBoardList();

        model.addAttribute("title", "EX");
        model.addAttribute("list", bList);
        return "ex";
    }
}