package com.sgq.Spring.aop.bean3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class test3 {

    public static void main(String[] args){
        @SuppressWarnings("resource")
        //如果是web项目，则使用注释的代码加载配置文件，这里是一般的Java项目，所以使用下面的方式
        //ApplicationContext ac = new ClassPathXmlApplicationContext("aop/aop/spring.xml");
        //这里是一般的Java项目，所以使用下面的方式
        ApplicationContext appCtx = new FileSystemXmlApplicationContext("E:\\spring-boot\\springboot\\test-test\\src\\main\\java\\com\\sgq\\aop\\bean3\\spring.xml");
        Sleepable sleeper =(Sleepable)appCtx.getBean("human");
        sleeper.sleep();
    }

}
