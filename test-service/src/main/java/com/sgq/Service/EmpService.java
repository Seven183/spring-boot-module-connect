package com.sgq.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sgq.*;
import com.sgq.Repository.MyRepository;
import com.sgq.entity.Course;
import com.sgq.entity.Emp;
import com.sgq.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import java.util.List;


/**
 * @author siguiqiang
 * @create 2019-1-17
 */
@Service
public class EmpService {

    @Autowired
    EmpServiceImlmapper empServiceImlmapper;

    @Autowired
    MyRepository myRepository;


    public List<Emp> getAll(){
        return empServiceImlmapper.getAll();
    }

    public List<Emp> getById(Integer id){
        return empServiceImlmapper.getById(id);
    }

    public List<Person> findAll(){ return  myRepository.findAll();}

    public PageInfo<Course> findAllCourse(int pageNum, int pageSize) {
        //将参数传给这个方法就可以实现物理分页了，非常简单。
        PageHelper.startPage(pageNum, pageSize);
        List<Course> userDomains = empServiceImlmapper.Course();
        PageInfo result = new PageInfo(userDomains);
        return result;
    }


}
