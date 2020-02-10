package com.company;

public class Class {
    // pomocu metode Thread.currentThread() prikazite ime i prioritet glavne niti
    //ovim ujedno i potvrdjujemo da se svaki put kada se pokrene java app kreira glavna nit metode main
    public static void main(String[] args) {
        //metoda staticka metoda Thread.currentThread vraca referencu na nit koja se trenutno izvrsava
        Thread myThread=Thread.currentThread(); //mi cemo staviti main nit jer se ona ovde izvrsava
        System.out.println("Name of the main thread is: " + myThread.getName());
        System.out.println("Priority of the current thread is: " + myThread.getPriority());

    }
}
