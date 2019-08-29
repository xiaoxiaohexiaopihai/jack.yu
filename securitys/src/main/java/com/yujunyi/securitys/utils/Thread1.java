package com.yujunyi.securitys.utils;

public class Thread1 extends Thread{
    private String name;

    public Thread1(String name){
        this.name=name;
    }

    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println(name + "运行  :  " + i);
            try {
                sleep((int) Math.random() * 10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Thread1 thread1 = new Thread1("huxiong");
        Thread1 thread11 = new Thread1("tangjiao");
        thread1.start();
        thread11.start();
    }
}
