package com.nnu.web;

import com.nnu.domain.User;
import com.nnu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@RestController
public class LoginController {
    private UserService userService;

    @RequestMapping(value = {"/", "index.html"})
    public ModelAndView index(){
        return new ModelAndView("login");
    }

    @RequestMapping(value = "/login")
    public ModelAndView login(HttpServletRequest request, LoginCommand loginCommand){
        User user = userService.findMatch(loginCommand.getUserid(), loginCommand.getPassword());
        if(user == null){
            request.getSession().setAttribute("user", user);
            return new ModelAndView("login", "error", "用户名或密码错误。");
        }
        request.getSession().setAttribute("user", user);

        return new ModelAndView("main");
    }

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
