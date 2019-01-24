package com.sgq.SpringMVC;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;

import java.util.HashMap;
import java.util.Map;

/**
 * @author siguiqiang
 * @create 2019-1-23
 */
@Controller
@RequestMapping("/hello")
public class HelloController {

    //produces = "application/json;charset=UTF-8"
    @RequestMapping(value = "/index")
    public String hello(){
        return "index";
    }

    @RequestMapping("/test")
    @ResponseBody
    public Map<String,String> test(){
        Map<String ,String> map = new HashMap< String ,String>();
        map.put("key","value");
        return map;
    }

    public void addViewControllers(ViewControllerRegistry registy){
        registy.addViewController("index").setViewName("index");
        //registy.addViewController("/upload").setViewName("upload");
    }
}
