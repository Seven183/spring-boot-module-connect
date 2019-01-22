package com.sgq.Repository;

import com.sgq.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;


/**
 * @author siguiqiang
 * @create 2019-1-21
 */
public interface MyRepository extends JpaRepository<Person,Long> {
}