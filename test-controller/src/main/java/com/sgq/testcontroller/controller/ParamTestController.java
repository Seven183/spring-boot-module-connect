package com.sgq.testcontroller.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.*;

/**
 * @author siguiqiang
 * @create 2019-1-18
 */

@RestController
public class ParamTestController {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @PostMapping("/say/{id}")
    public String sayHello(@PathVariable Integer id){
        return  "id"+id;
    }

    @RequestMapping(value = "/test",method = RequestMethod.POST)
    public void test(@RequestBody(required=false) JSONObject params){
        System.out.println("name"+params);

    }

    @RequestMapping(value="/hello1",method= RequestMethod.GET)
    public String say(@RequestParam Integer id){
        return "id=:"+id;
    }


    @RequestMapping(value = "/hello2", method = RequestMethod.GET)
    public String sayHello(@RequestParam Integer id, @RequestParam String name) {
        return "id:" + id + " name:" + name;
    }

//  获取url参数值，执行参数名称方式 localhost:8080/hello?userId=1000
//  输出：id：100

//    注意
//    不输入id的具体值，此时返回的结果为null。具体测试结果如下：
//    id：null
//    不输入id参数，则会报如下错误：
//    whitelable Error Page错误
    @RequestMapping(value="/hello3",method= RequestMethod.GET)
    public String sayHello1(@RequestParam("userId") Integer id){
        return "id:"+id;
    }

    //required=false 表示url中可以无id参数，此时就使用默认参数
    @RequestMapping(value="/hello4",method= RequestMethod.GET)
    public String sayHello2(@RequestParam(value="id",required = false,defaultValue = "1") Integer id){
        return "id:"+id;
    }


}
