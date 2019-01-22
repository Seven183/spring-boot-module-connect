package SpringMvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author siguiqiang
 * @create 2018-12-17
 */
@Controller
public class hello {

    private static final String SUCCESS ="success";

    //基于注解版的
    @RequestMapping("/l*")
    public String helloWorld(){
        System.out.println(Runtime.getRuntime().maxMemory()/1024/1024);
        return SUCCESS ;
    }

    @RequestMapping(value = "/textpolo")
    public String testpolo(){
        System.out.println("testPOLO............" );
        return SUCCESS;
    }

    @RequestMapping("/myView")
    public String myOiew(){
        System.out.println("testmyview............");
        return "myView";

    }

    @RequestMapping("/testPathValiable/{id}")
    public String test02(@PathVariable("id")  Integer id){
        System.out.println("testPathValiable......" + id);
        return SUCCESS;
    }

//
//    @RequestMapping()
//    public String test03(){
//        System.out.println("");
//        return SUCCESS;
//    }
//
//
//    @RequestMapping()
//    public String test04(){
//        System.out.println("");
//        return SUCCESS;
//    }
//
//
//    @RequestMapping()
//    public String test05(){
//        System.out.println("");
//        return SUCCESS;
//    }
//
//
//    @RequestMapping()
//    public String test06(){
//        System.out.println("");
//        return SUCCESS;
//    }

}
