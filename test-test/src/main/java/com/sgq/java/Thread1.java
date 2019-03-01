package com.sgq.java;

/**
 * @author siguiqiang
 * @create 2019-2-13
 */
public class Thread1 {
    public static void main(String[] args) {


        //创建一个线程对象，覆盖其run方法，传入参数为线程的名字
        Thread t1=new Thread(){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        };

        //调用start方法启动线程
        t1.start();
        for (int i = 1; i <=10 ; i++) {
            System.out.println("主线程循环："+i+"次");
        }
        System.out.println(Thread.currentThread().getName());



        //创建一个线程对象，覆盖其run方法，传入参数为线程的名字
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        });

        //调用start方法启动线程
        t2.start();
        for (int i = 1; i <=100 ; i++) {
            System.out.println("主线程循环："+i+"次");
        }
        System.out.println(Thread.currentThread().getName());


    }
}
