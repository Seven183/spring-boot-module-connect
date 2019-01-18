package com.sgq.testcontroller.controller;


import com.sgq.testservice.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author siguiqiang
 * @create 2019-1-17
 */
@RestController
public class Controller {

    @Autowired
    EmpService empService;

//    @GetMapping("/hello")
//    public String hello() {
//        return "hello";
//    }

    @RequestMapping (value = "/getAll" ,method = RequestMethod.GET)
    public Object getAll(){
        return empService.getAll();
    }

}
