package com.sgq.controller.PageHelper;

import com.sgq.Service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author siguiqiang
 * @create 2019-1-22
 */
@RestController
public class PageController {

    @Autowired
    EmpService empService;

    //  开启分页
    @GetMapping("/Course")
    public Object findAllCourse(
            @RequestParam(name = "pageNum", required = false, defaultValue = "2") int pageNum,
            @RequestParam(name = "pageSize", required = false, defaultValue = "4") int pageSize) {

        return empService.findAllCourse(pageNum, pageSize);

    }
}
