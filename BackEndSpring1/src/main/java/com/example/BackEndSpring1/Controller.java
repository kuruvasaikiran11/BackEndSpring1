package com.example.BackEndSpring1;

import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;

@RestController
public class Controller{
    Map<Integer, String> users = new HashMap<>();
    @GetMapping("/get_user")
    public String getUsers(@RequestParam("num") int id){
        return users.get(id);
    }
    @PostMapping("/add_user")
    public void addUser(@RequestParam("id") int id, @RequestParam("name") String name){

        users.put(id, name);
    }
}