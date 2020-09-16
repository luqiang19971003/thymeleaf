package com.offcn.controller;


import com.offcn.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SecondController {

    @GetMapping("/second")
    public String second(Model model){
        List<User> list =new ArrayList();
        User user1=new User(1,"1111",11);
        User user2=new User(2,"2222",22);
        User user3=new User(3,"3333",33);
        User user4=new User(4,"4444",44);
        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);
        model.addAttribute("user",list);
        return "index1";
    }

}
