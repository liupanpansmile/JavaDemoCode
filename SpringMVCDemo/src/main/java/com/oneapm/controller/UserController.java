package com.oneapm.controller;

import com.oneapm.dao.UserDao;
import com.oneapm.dao.UserDaoImpl;
import com.oneapm.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/4/4.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    private UserDao userDao;

    public UserController() {
        userDao = new UserDaoImpl();
    }

    @RequestMapping(value = "{username}", method = RequestMethod.GET)
    public String getUser(@PathVariable String username, Model model) {
        User user = userDao.getUser(username);
        List<User> list = new ArrayList<User>();
        if (user != null) {
            list.add(user);
        }
        model.addAttribute("users", list);
        return "list";
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public String list(Model model) {
        List<User> users = userDao.getAllUsers();
        model.addAttribute("users", users);
        return "list";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add(Model model) {
        model.addAttribute("user", new User());
        System.out.println("add get");
        return "add";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String add(User user) {
        userDao.addUser(user);
        System.out.println("add post");
        return "redirect:/user/users";
    }


    @RequestMapping(value = "/delete/{username}", method = RequestMethod.GET)
    public String delete(@PathVariable String username, Model model) {
        String forword;
        if (userDao.deleteUser(username) == 1) {
            forword = "redirect:/user/users";
        } else {
            model.addAttribute("msg", "不存在此用户");
            forword = "error";
        }
        return forword;
    }

    @RequestMapping(value = "update", method = RequestMethod.POST)
    public String update(User user, Model model) {
        String forword;
        if (userDao.updateUser(user) == 1) {
            forword = "redirect:/user/users";
        } else {
            model.addAttribute("msg", "不存在此用户");
            forword = "error";
        }
        return forword;
    }

    @RequestMapping(value = "update", method = RequestMethod.GET)
    public String update(Model model) {
        model.addAttribute("user", new User());
        return "update";
    }

}
