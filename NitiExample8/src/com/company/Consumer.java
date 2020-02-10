package com.company;

public class Consumer extends Thread{
    private Product product;
    private int number;
    public Consumer(Product product, int number) {
        this.product = product;
        this.number = number;
    }
    public void run(){
        int value=0;
        for(int i=0;i<10;i++){
            value=product.get();
        }

        //challenge problem proizvodjac-potrosac sa
    }
}
