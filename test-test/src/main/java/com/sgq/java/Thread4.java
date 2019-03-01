package com.sgq.java;

import java.util.Date;

/**
 * @author siguiqiang
 * @create 2019-2-14
 */
public class Thread4 {

    public static class MyRunnable implements Runnable {
        @Override
        public void run(){
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            String name1 = Thread.currentThread().getName();
            System.out.println(name1 + new Date().toLocaleString());
        }
    }

    public static void main(String[] args) {
//        MyRunnable myRunnable = new MyRunnable();
//        myRunnable.run();
//        String name = Thread.currentThread().getName();
//        System.out.println(name);

          MyRunnable myRunnable = new MyRunnable();
          //给线程起一个别名
          Thread thread = new Thread(myRunnable,"new Thread");
          thread.start();

          String name = Thread.currentThread().getName();
          System.out.println(name);
    }

}
