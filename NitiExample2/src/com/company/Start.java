package com.company;
// ovaj pristup se koristi vise kod funkcionalnog programiranja-lambda izrazi
public class Start {
    public static void main(String[] args) {
        //kreiranje niti implementiranje interface runnable
        //nit koja implementira runnable se pokrece tako sto se konstruktoru klase Thread kao argument prosledimo instancu klase koja je implementirala
        //interface Runnable

        //1.kreiranje instance MyRunnable
        MyRunnable myRunnable=new MyRunnable();
        //2.ovako kreirani objekat prosledjujemo konstruktoru klase Thread, ovo je primer preko imenovanog objekta
        Thread myThread=new Thread(myRunnable);
        //3. na kraju pokrecemo nit
        myThread.start();
    }
}
