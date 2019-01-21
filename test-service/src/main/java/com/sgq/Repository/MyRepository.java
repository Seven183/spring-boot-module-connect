package com.sgq.Repository;


import com.sgq.Emp;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;



/**
 * @author siguiqiang
 * @create 2019-1-21
 */
@Configuration
public interface MyRepository extends JpaRepository<Emp,Long> {

}
