package com.sgq.SpringMVC;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;

/**
 * @author siguiqiang
 * @create 2019-1-23
 */
@Controller
@RequestMapping("/hello")
public class HelloController {

    //produces = "application/json;charset=UTF-8"
    @RequestMapping(value = "/index" ,produces = "application/xml;charset=UTF-8")
    public String hello(){
        return "index";
    }


    public void addViewControllers(ViewControllerRegistry registy){
        registy.addViewController("index").setViewName("index");
        registy.addViewController("/upload").setViewName("upload");
    }
}
