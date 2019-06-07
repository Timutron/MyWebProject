package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @Autowired
    private IUserService iuserService;

    @PostMapping("/registration")
    public ModelAndView addUser(User user){
        ModelAndView modelAndView = new ModelAndView();
        User userFromDB = iuserService.findByLogin(user.getLogin());
        if (userFromDB != null){
            modelAndView.addObject("message", "Такой пользователь уже существует");
        }
        iuserService.save(user);
        modelAndView.setViewName("registration");
        return modelAndView;
    }
}
