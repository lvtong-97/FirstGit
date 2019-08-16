package com.example.demo.controller;

import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
//@RequestMapping("/show")
public class UserController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }

    @Autowired
    UserService us;
    @RequestMapping("/show")
    public String show(){
        String rs=us.getUser(1);
        System.out.println(rs);
        return rs;
    }
/*
    @RequestMapping("/index")
    public String index(Model model){
        model.addAttribute("name","nihao");
        return "show";
    }*/

    @RequestMapping("/index1")
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView("show");
        return mv;
    }



}
