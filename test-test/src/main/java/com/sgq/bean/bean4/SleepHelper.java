package com.sgq.bean.bean4;


/*
* 包含了睡觉的辅助动作，用AOP的术语来说就是通知Advice.
* */


public class SleepHelper  {


    public void beforeSleep(){

        System.out.println("睡觉之前，脱衣服");
    }

    public void afterSleep() {

        System.out.println("睡醒穿衣服回去");
    }
    public void tt(){

        System.out.println("睡醒穿衣服回去wan");
    }
    public void ttt(){

        System.out.println("睡醒穿衣服回去wan");
    }
    public void t(){

        System.out.println("睡");
    }
}
