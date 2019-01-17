package com.sgq.testcontroller.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author siguiqiang
 * @create 2019-1-17
 */
@RestController

public class Controller {
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}
