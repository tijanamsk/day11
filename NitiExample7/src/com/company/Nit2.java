package com.company;

public class Nit2 extends Thread {
    Pogodi pogodi=null;

    public Nit2(Pogodi pogodi) {
        this.pogodi = pogodi;
    }
    @Override
    public void run(){
        do {
            int broj= (int) (Math.random()*10000+1);
            this.pogodi.broj2=broj;
            synchronized (pogodi){
                pogodi.counter++;
            }
            //this.pogodi.counterIncrement();
            //this.pogodi.counter++;
        }
        while(this.pogodi.broj2!=this.pogodi.broj1);

    }
}
