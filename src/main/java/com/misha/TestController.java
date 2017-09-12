package com.misha;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {

    @RequestMapping (value = "/")
    public ModelAndView controllerForAll() {
        ModelAndView modelAndView = new ModelAndView("home");
        modelAndView.addObject("textval", "transferred value");
        return modelAndView;
    }
}
