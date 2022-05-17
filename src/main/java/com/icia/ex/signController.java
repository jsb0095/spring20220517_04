package com.icia.ex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class signController {

    @GetMapping("/")
    public String top(String name1,String pass1){
        return "top";
    }
    @GetMapping("/save-form")
    public String saveform(String name1,String pass1){
        return "save-form";
    }
    @Autowired
    signService topService;
    @GetMapping("/save")
    public void sign(@RequestParam("name1") String name1,@RequestParam("pass1") String pass1
    ){
        topService.sign(name1,pass1);
    }
    }

