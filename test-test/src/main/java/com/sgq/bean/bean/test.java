package com.sgq.bean.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class test {

    public static void main(String[] args){

        //如果是web项目，则使用注释的代码加载配置文件，这里是一般的Java项目，所以使用下面的方式
        //ApplicationContext ac = new ClassPathXmlApplicationContext("E:\\spring-boot\\springboot\\test-test\\src\\main\\java\\com\\sgq\\bean\\bean\\spring.xml");
        ApplicationContext ac = new FileSystemXmlApplicationContext("E:\\spring-boot\\springboot\\test-test\\src\\main\\java\\com\\sgq\\bean\\bean\\spring.xml");
        Sleepable sleeper =(Sleepable)ac.getBean("humanProxy");
        sleeper.hello();
    }

}