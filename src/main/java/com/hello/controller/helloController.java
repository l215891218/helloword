package com.hello.controller;


import com.hello.entity.User;
import com.hello.service.helloService;
import com.word.entity.Word;
import com.word.service.wordService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class helloController {

    @Autowired
    private helloService a;


    @Autowired
    private wordService b;

    @RequestMapping("/index")
    public String  index(User user, Model model){
//        a.index();
        model.addAttribute("user",user);
        return "/hello/ind";

    }
    @RequestMapping("/upd")
    public String  upd(){
        Word word = new Word();
        word.setLoginName("admin");
        word.setUserName("李伟");
        b.upd(word);
        return "/hello/ind";
    }
    @RequestMapping("/login")
    public String  login(User user, Model model){
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(user.getLoginName(),user.getLoginPassword());
        System.out.println("loginName====>"+user.getLoginName());
        System.out.println("loginPassword====>"+user.getLoginPassword());
        model.addAttribute("msg","成功！！！！");
        return "/hello/ind";
    }

}
