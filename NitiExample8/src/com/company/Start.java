package com.company;

public class Start {
    public static void main(String[] args) {
        // problem consumer-producer, gde imamo jedan buffer
        Product product=new Product();

        Producer p1=new Producer(product,1);
        Consumer c1=new Consumer(product,1);
        p1.start();
        c1.start();
    }
}
