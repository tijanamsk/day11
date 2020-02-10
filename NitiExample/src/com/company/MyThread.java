package com.company;

public class MyThread extends Thread{

    //nit ce da izvrsava kod koji se navodi u metodi run()
    @Override
    public void run(){
        System.out.println("MyThread is running!!!");
    }
}
