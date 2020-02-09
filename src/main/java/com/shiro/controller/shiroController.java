package com.shiro.controller;


import com.hello.entity.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/shiro")
public class shiroController {



    @RequestMapping("")
    public String initLogin() {
        System.out.println("进入登录页面");
        return "login";
    }



    @RequestMapping("/login")
    public String  login(User user, Model model){
        String error = null;
        try {
            Subject subject = SecurityUtils.getSubject();
            UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(user.getLoginName(),user.getLoginPassword());
            System.out.println("loginName====>"+user.getLoginName());
            System.out.println("loginPassword====>"+user.getLoginPassword());

            subject.login(usernamePasswordToken);
            error = "成功！！！！";

        } catch (UnknownAccountException e) {
            error = "用户名/密码错误";
        } catch (IncorrectCredentialsException e) {
            error = "用户名/密码错误";
        } catch (AuthenticationException e) {
            //其他错误，比如锁定，如果想单独处理请单独catch处理
            error = "其他错误：" + e.getMessage();
        }
        model.addAttribute("msg",error);
        return "/hello/ind";
    }

    @RequestMapping("/unauthorized")
    public String  unauthorized(Model model){
        model.addAttribute("msg","没登录!!!!unauthor");
        return "unauthor";
    }

    @RequestMapping("/authenticated")
    public String  authenticated(Model model){
        model.addAttribute("msg","登录成功！！！authenticated");
        return "unauthor";
    }

}
