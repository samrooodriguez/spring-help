package com.help;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

public class UsersCtrl {

    @GetMapping("profiles")
    @ResponseBody
    public String showProfile(){
        return "profile page placeholder";
    }

    @PostMapping("/profile")
    @ResponseBody
    public String getProfileInfo(@RequestAttribute String username){
        System.out.println("username = " + username);
        return "profile page submission placeholder " + username;
    }

    @GetMapping("/users")
    @ResponseBody
    public List<String> showListOfUsers(){
        List<String> users = new ArrayList<>();
        users.add("Fer");
        users.add("Ryan");
        users.add("Sophie");
        return users;
    }

    @GetMapping("/forgotPassword")
    public String forgotPassword(){
        return "forgotPassword page placeholder";
    }

}
