package com.company;

public class Product {
    private int content;
    private boolean available=false;// ovo je kontrolna promenljiva koja pokazuje da li ima mesta u bufferu tj da li je proizvod raspoloziv
    // wait i notify metode moraju da se pozivaju u okviru synchronized metoda

    //put metoda za stavljanje necega u bufer
    public synchronized void put(int value){
        if(available){ // ako je product u buffer znaci da vise nema mesta i proizvodjac ide u cekanje i to mora da bude u try-catch
            try{
                wait();
            }catch(InterruptedException ex){
                ex.printStackTrace();
            }

        }
        //kada prodje ovaj kod if, proizvodjac stavlja proizvod u buffer
        System.out.println("Put value " + value);
        content=value;
        available=true;// signizira potrosacima da je proizvod dostupan
        notifyAll(); //  obavestava niti da je proizvod dostupan
    }
    //metoda get za potrosaca
    public synchronized int get(){
        if(!available){
            try{
                wait(); // ako nema proizvoda idem u wait
            }catch(InterruptedException ex){
                ex.printStackTrace();
            }
        }
        //nakon waita konzumiram proizvod iz buffera
        System.out.println("Get value " + content);
        available=false; // signalizira drugim nitima da je proizvod potrosen
        notifyAll();
        return content;

    }

}
