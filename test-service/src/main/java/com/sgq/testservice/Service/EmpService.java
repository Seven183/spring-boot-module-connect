package com.sgq.testservice.Service;

import com.sgq.testdao.EmpServiceImlmapper;
import com.sgq.testsupport.Emp;
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

    public List<Emp> getAll(){
        return empServiceImlmapper.getAll();
    }

    public List<Emp> getById(Integer id){
        return empServiceImlmapper.getById(id);
    }
}
