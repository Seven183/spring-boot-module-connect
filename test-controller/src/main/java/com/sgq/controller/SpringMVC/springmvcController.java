package com.sgq.controller.SpringMVC;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author siguiqiang
 * @create 2019-1-24
 */
@Controller
@RequestMapping("/mvc")
public class springmvcController {

    @RequestMapping(value = "/index")
    public String hello(){
        return "index1";
    }
}
