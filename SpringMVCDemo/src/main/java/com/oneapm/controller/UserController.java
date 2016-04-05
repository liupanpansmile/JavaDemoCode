package com.oneapm.controller;

import com.oneapm.dao.UserDao;
import com.oneapm.dao.UserDaoImpl;
import com.oneapm.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/4/4.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    private UserDao userDao ;
    public UserController(){
        userDao = new UserDaoImpl() ;
    }

    @RequestMapping(value = "/users",method = RequestMethod.GET)
    public String list(Model model){
        List<User> users = userDao.getAllUsers() ;
        model.addAttribute("users",users) ;
        return "list" ;
    }

    @RequestMapping(value="/add",method=RequestMethod.GET)
    public String add(Model model) {
        model.addAttribute("user",new User()) ;
        return "add";
    }

    @RequestMapping(value="/add",method=RequestMethod.POST)
    public String add(User user){
        userDao.add(user) ;
        return "redirect:/user/users";
    }

    @RequestMapping(value="/delete",method = RequestMethod.POST)
    public String delete(String username){
        userDao.delete(username) ;
        return "redirect:/user/users";
    }

    @RequestMapping(value = "update",method = RequestMethod.POST)
    public String update(User user){
        userDao.update(user) ;
        return "redirect:/user/users";
    }


}
