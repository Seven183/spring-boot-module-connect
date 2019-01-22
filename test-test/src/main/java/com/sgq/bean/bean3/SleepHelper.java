package com.sgq.bean.bean3;

/*
* 包含了睡觉的辅助动作，用AOP的术语来说就是通知Advice.
* */

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class SleepHelper  {

    @Pointcut("execution(* *.sleep())")
    public void sleepPoint(){}


    @Before("sleepPoint()")
    public void before(){

        System.out.println("睡觉之前，脱衣服");
    }

    @AfterReturning("sleepPoint()")
    public void afterReturning() {
        System.out.println("睡醒穿衣服回去");
    }


}
