package com.company;

public class Start {
    public static void main(String[] args) {
        //napraviti program koji simulira da dve niti igraju igru pogadjanja brojeva
        // svaka nit u svakoj iteraciji pogadja jedan broj iz intervala 1-10000
        //kada obe niti pogode isti broj izvrsavanje programa se zaustavlje i broj koje su obe niti pogodile se prikazuje na standardnom izlazu
        //brojevi koje ce niti koristiti bice u heapu

        //pravimo zajednicki objekat preko kog niti komuniciraju
        /*Pogodi pogodi=new Pogodi();
        Nit1 nit1=new Nit1(pogodi);
        Nit2 nit2=new Nit2(pogodi);
        nit1.start();
        nit2.start();
        System.out.println("Brojevi koju su pogodjeni su: " +pogodi.broj1 + " " +pogodi.broj2);*/
        //kada ovako pokrenemo ispisuje se samo 0 i 0 jer main ima prioritet
        //mozemo da uspavamo glavnu nit pomocu metode sleep i sleep baca IntereptudedException i stavljamo try catch
        Pogodi pogodi=new Pogodi();
        Nit1 nit1=new Nit1(pogodi);
        Nit2 nit2=new Nit2(pogodi);
        nit1.start();
        nit2.start();
        try{
            Thread.sleep(5000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        //alternativno resenje je join
        /*try{
            nit1.join();
            nit2.join();
        }catch(InterruptedException e)*/
        System.out.println("Brojevi koju su pogodjeni su: " +pogodi.broj1 + " " +pogodi.broj2);
        System.out.println("Vrednost countera je: " + pogodi.counter);
    }
}
