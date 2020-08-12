package com.woc.demo;

public class Tg1 {
    public static void main(String[] args) {
        TgParent rnbl = new TgParent();
        ThreadGroup tg1 = new ThreadGroup("First Group");

        Thread t1;
        t1 = new Thread(tg1,rnbl);
        //t1.start();
        Thread t2;
        t2 = new Thread(tg1,rnbl,"Mythread2");
        //t2.start();
        
        tg1.setMaxPriority(Thread.MAX_PRIORITY);

        ThreadGroup tg2 = new ThreadGroup("Second Group");

        Thread t3;
        t3 = new Thread(tg2,rnbl);
        //t3.start();
        Thread t4;
        t4 = new Thread(tg1,rnbl,"Mythread4");
        //t4.start();

        tg1.setMaxPriority(Thread.MAX_PRIORITY);
        tg2.setMaxPriority(Thread.MIN_PRIORITY);
        System.out.println("tg2 priority ="+ tg2.getMaxPriority());
        
    }
}
