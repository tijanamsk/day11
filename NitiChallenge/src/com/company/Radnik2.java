package com.company;

public class Radnik2 extends Thread {
    Kamion k;
    Skladiste s;

    public Radnik2(Kamion k, Skladiste s) {
        this.k = k;
        this.s = s;
    }
    public void run(){
        do{
            this.k.setBrojCigli();
            this.s.setBrojCigli();
        } while( this.k.brojCigli>0);
        //while(this.s.brojCigli<1000|| this.k.brojCigli>0);

    }
}
