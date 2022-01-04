package com.li.boot.controller;

import com.li.boot.bean.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    Car car;
    @RequestMapping("/car")
    public Car car(){
        return car;
    }
    @RequestMapping("/hello")
    public String handle01() {
        return "Hello,sping boot 2";
    }
}
