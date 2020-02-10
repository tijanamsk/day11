package com.company;

public class Class {
    public static void main(String[] args) {
        //kreirati nit koja se pokrece pomocu anonimne klase(objekta) thread u glavnoj metodi main
        //cim imamo anonimni objekat ne treba nam klasa

        Thread myThread=new Thread("Our Thread"){
          public void run(){
              System.out.println("Our Thread has started");
          }
        }; // ovo je anonimna klasa
        myThread.start();
        System.out.println("Thread name is " + myThread.getName());
    }
}
