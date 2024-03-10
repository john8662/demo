package com.example.filedemo.demos.web;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

@RestController
@RequestMapping("/user")
public class UserController {

    @PostMapping("/login")
    public Map login(@RequestBody User user) throws InterruptedException {
        Map<String,Object> map = new HashMap<>();
        user.setToken(UUID.randomUUID().toString());
//        Thread.sleep(3*1000);
        map.put("code",200);
        map.put("msg","登录成功");
        map.put("data",user);
        return map;
    }
}
