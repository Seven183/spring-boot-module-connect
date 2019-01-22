package com.sgq.bean.bean;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/*
* 包含了睡觉的辅助动作，用AOP的术语来说就是通知Advice.
* */
public class SleepHelper implements MethodBeforeAdvice,AfterReturningAdvice {

    public void before(Method agro,Object[] agr1,Object agr2)throws Throwable{
        System.out.println("睡觉之前，脱衣服");
    }

    public void afterReturning(Object agr0,Method arg1,Object[] arg2,Object arg3)
            throws Throwable{
        System.out.println("睡醒穿衣服回去");
    }
}
