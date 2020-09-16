package com.offcn.controller;


import com.offcn.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
public class FirstController {

    /**
     * 将数据返回到index页面中
     */
    @GetMapping("/first")
    public String first(Model model){
        String message="Hello Thymeleaf";
        model.addAttribute("message",message);

        User user=new User(1,"张三",12);
        model.addAttribute("user",user);

        Map<String,Object> map=new HashMap<>();
        map.put("src","1.png");
        model.addAttribute("map",map);

        return "index";
    }
}
