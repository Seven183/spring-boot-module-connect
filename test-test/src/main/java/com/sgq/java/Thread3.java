package com.sgq.java;



/**
 * @author siguiqiang
 * @create 2019-2-14
 */
public class Thread3 {

    public static class MyThread extends Thread{
        @Override
        public void run(){
            String name1 = Thread.currentThread().getName();
            System.out.println(name1);
        }
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        String name = Thread.currentThread().getName();
        System.out.println(name);
    }

}
