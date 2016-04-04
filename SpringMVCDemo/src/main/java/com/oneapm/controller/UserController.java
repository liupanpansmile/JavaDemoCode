package com.oneapm.controller;

import com.oneapm.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2016/4/4.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    private Map<String,User> users = new HashMap<String, User>()  ;

    public UserController(){
        users.put("jack",new User("Jack","jack","my@163.com")) ;
        users.put("marry",new User("Marry","mary","my@1632.com")) ;
        users.put("ant",new User("Ant","ant","my@1632.com")) ;
    }

    @RequestMapping(value = "/users",method = RequestMethod.GET)
    public String list(Model model){
        model.addAttribute("users",users) ;
        return "list" ;
    }

    @RequestMapping(value="/add",method=RequestMethod.GET)
    public String add(){
        return "add";
    }

    @RequestMapping(value="/add",method=RequestMethod.POST)
    public String add(User user){
        users.put(user.getUsername(),user) ;
        return "redirect:/user/users";
    }
}
