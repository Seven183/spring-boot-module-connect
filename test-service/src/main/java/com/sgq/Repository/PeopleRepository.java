package com.sgq.Repository;

import com.sgq.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @author siguiqiang
 * @create 2019-1-22
 */
//默认的springboot-rest的URL是实体类表名+s，eg:localhost:8080/persons,
//但是想改名用下面的RepositoryRestResource(path = "people")指定固定的名字
@RepositoryRestResource(path = "people")
public interface PeopleRepository extends JpaRepository<Person ,Long> {
    //@RestResource(path = "nameStartsWith", rel = "nameStartsWith")
    Person findByNameStartsWith(@Param("name")String name);
}
