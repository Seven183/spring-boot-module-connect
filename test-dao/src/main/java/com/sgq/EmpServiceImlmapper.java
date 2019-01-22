package com.sgq;

import com.sgq.entity.Course;
import com.sgq.entity.Emp;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author siguiqiang
 * @create 2019-1-17
 */
@Mapper
public interface EmpServiceImlmapper {

     List<Emp> getAll();

     List<Emp> getById(Integer id);

     List<Course> Course();}

