package com.sgq.bean.bean3;

public class human implements Sleepable {

    /*
    * 睡觉之前后要做的一些辅助工作，最基本的是穿衣服或者吃安眠药等
    * 一些和业务逻辑“谁家”不相关的动作
    *
    * 这些动作全部加到Sleep上去就违反了单一的职责，这时候我们就可以用上aop 了
    *
    * */
    public void sleep(){

        System.out.println("睡觉中");

    }
}
