package com.sgq.controller.SpringMVC;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @author siguiqiang
 * @create 2019-1-24
 */
@Controller
public class springmvcController {

    @RequestMapping(value = "/index")
    public String hello(){
        return "index1";
    }
}
