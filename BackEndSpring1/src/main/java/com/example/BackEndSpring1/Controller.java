package com.example.BackEndSpring1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class Controller{
    HashMap<Integer, String> hm = new HashMap<>();

    @GetMapping("/get_user")
    public String getuser(@RequestParam("num") int num){
        return hm.get(num);
    }
    @PostMapping("/add_user")
    public void adduser(@RequestParam("user") String user, @RequestParam("num") int num){
        hm.put(num, user);
    }
}