package com.company;

public class Nit1 extends Thread{
    //klasa za prvu nit
    Pogodi pogodi=null; // zajednicki objekat preko kog niti komuniciraju ovaj objekat se smesta u heap memoriju

    public Nit1(Pogodi pogodi) {
        this.pogodi = pogodi;
    }
    @Override
    public void run(){ //koristicemo do-while petlju
        do{
           int broj= (int) (Math.random()*10000+1);
           this.pogodi.broj1=broj;
           //sada radimo sa sinhronizovanim blokovima i to mora u obe niti
            synchronized (pogodi){
                pogodi.counter++;
            }
           //this.pogodi.counterIncrement();
           //this.pogodi.counter++;
        }
        while(this.pogodi.broj1!=this.pogodi.broj2);

    }
}
