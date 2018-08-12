package com.nnu.web;

import com.nnu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class indexController {
    private UserService userService;

    @RequestMapping(value = {"/", "index.html"})
    public ModelAndView index(){
        System.out.println(userService.getName(1));
        return new ModelAndView("index");
    }

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
