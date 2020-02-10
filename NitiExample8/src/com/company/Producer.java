package com.company;

public class Producer extends Thread {
    private Product product;
    private int number;

    public Producer(Product product, int number) {
        this.product = product;
        this.number = number;
    }
    public void run(){
        for(int i=0;i<10;i++){
            product.put(i);
            try{
                sleep ((int)(Math.random()*100));
            } catch(InterruptedException ex){
                ex.printStackTrace();
            }

        }
    }
}
