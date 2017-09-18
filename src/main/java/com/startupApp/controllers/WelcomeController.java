package com.startupApp.controllers;

import com.startupApp.dao.DaoUser;
import com.startupApp.dao.FakeDaoUserImpl;
import com.startupApp.entities.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class WelcomeController {

    @RequestMapping (value = "/")
    public ModelAndView controllerForAll() {
        User u1 = new User(1, "l1", "fn1", "ln1");
        User u2 = new User(2, "l2", "fn2", "ln2");
        User u3 = new User(3, "l3", "fn3", "ln3");
        User u4 = new User(4, "l4", "fn4", "ln4");

        DaoUser<User,String> daoUser = new FakeDaoUserImpl();
        daoUser.insert(u1);
        daoUser.insert(u2);
        daoUser.insert(u3);
        daoUser.insert(u4);

        List<User> users  = daoUser.getAll();

        ModelAndView modelAndView = new ModelAndView("home", "map", users);
        modelAndView.addObject("lenght", users.toArray().length);
        return modelAndView;
    }
}
