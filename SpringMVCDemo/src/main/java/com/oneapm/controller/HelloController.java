package com.oneapm.controller;

import com.oneapm.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping({"/hello","/"})
    public String hello(String username, Model model){
        model.addAttribute("username",username) ;
        User user = new User() ;
        user.setId(1001);
        user.setUsername("Jack");
        model.addAttribute(user) ;
        model.addAttribute("zhangsan") ;
        System.out.println("hello called");
        return "hello" ;
    }

    @RequestMapping("/welcome")
    public String welcome(String username,Model model){
        model.addAttribute("username",username) ;
        return "welcome" ;
    }
}
