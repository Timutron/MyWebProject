package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/registration")
    public String registration(){
        return "registration";
    }

    @GetMapping({"/", "/homePage"})
    public String homePage(){
        return "homePage";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/userPage")
    public String userPage(){
        return "userPage";
    }

    @GetMapping("/adminPage")
    public String adminPage(){
        return "adminPage";
    }
}
