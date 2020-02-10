package com.company;

public class Start {
    public static void main(String[] args) {
        //Java niti mogu da se kreiraju na dva nacina
        //1.nasledjivanje klase thread koja sadrzi run metodu u kojoj se navodi kod koji je potrebno da odredjena nit izvrsava
        //2.implementacija interface runnable koji takodje sadrzi metodu run. Medjutim da bi se nit kreirala implementacijom interface Runnable
        // instancu klasu koja implementira interfejs runnable treba proslediti konstruktoru klase Thread ina taj nacin se nit pokrece
        //Projekat kreiranja niti nasledjivanje klase Thread

        MyThread myThread=new MyThread(); //sada pokrecemo MyThread nit
        //myThread.run();// ovo nikada ne raditi ne pokrece se nit vec se samo izvrsava metoda
        myThread.start(); //nit se pokrece metodom start //niti postoje samo za JVM za procesor niti ne postoje


    }
}
