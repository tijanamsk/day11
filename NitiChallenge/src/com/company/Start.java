package com.company;

public class Start {
    public static void main(String[] args) {
        Kamion k=new Kamion();
        Skladiste s=new Skladiste();

        Radnik1 r1=new Radnik1(k,s);
        Radnik2 r2=new Radnik2(k,s);

        r1.start();
        r2.start();
        try{
            Thread.sleep(5000);
        }
        catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        System.out.println("Cigle u kamionu: " + k.brojCigli);
        System.out.println("Cigle u skladistu: " + s.brojCigli);

        // kreirati java projekat koji simulira skladiste
        //u skladistu se skladiste samo cigle i potrebno je da dva radnika prenesu 1000 cilgi iz kamiona u skladiste u toku jednog dana
        //cigle su teske i u jednoj iteraciji svaki radnik moze da odnese samo po jednu ciglu
        // na kraju simulacije program treba da prikaze broj cigli u skladistu i u kamionu
        // dakle na kraju simulacije treba da bude 1000 cigli u skladistu i 0 cigli u kamionu

        //klasa kamion i skaldiste
        // u kamionu je broj cigli=1000
        //skladiste broj cigle=0
        //radnici su isti nasledjuju klasu Thread-preko konstruktora dajemo imena
        // u svakoj iteraciji radnik radi inkrement i dekrement i tu su inkrement i dekrement zajednicki
    }
}
