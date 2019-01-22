package com.sgq.Repository;

import com.sgq.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * @author siguiqiang
 * @create 2019-1-21
 */
public interface MyRepository extends JpaRepository<Person,Long> {
}