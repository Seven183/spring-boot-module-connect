package com.sgq.Spring.Schedualed;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author siguiqiang
 * @create 2019-1-22
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(SchedualedConfig.class);
        //SchedualTaskService aop = ac.getBean(SchedualTaskService.class);
        //System.out.println(aop);

        ac.close();
    }
}

