package com.sgq.controller;

import com.sgq.Service.EmpService;
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



    @RequestMapping (value = "/getAll" ,method = RequestMethod.GET)
    public Object getAll(){
        return empService.getAll();
    }


    @RequestMapping (value = "/getById/{id}",method = RequestMethod.GET)
    public Object getById(@PathVariable Integer id){
        return empService.getById(id);
    }



//    @RequestMapping(value = "/findAll" ,method = RequestMethod.POST)
//    public Object findAll(@RequestBody(required = false) JSONObject params){return empService.FindAll();}
}
