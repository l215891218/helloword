package com.word.controller;


import com.word.service.wordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/word")
public class WordController {

    @Autowired
    private wordService a;

    @RequestMapping("/index")
    public String  index(){
        a.index();
        return "/hello/ind";
    }
}
