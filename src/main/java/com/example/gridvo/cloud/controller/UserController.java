package com.example.gridvo.cloud.controller;

import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "用户")
@Slf4j
public class UserController {

    @GetMapping("user/login")
    public String login(){
        return "index";
    }
    @GetMapping("test")
    public String test(){
        return "index";
    }

}
