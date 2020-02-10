package com.company;

public class Pogodi {
    public int broj1; //ovo treba da bude private ali da nas ne zbunilo ostaje public//ovo je za prvu nit
    public int broj2; // ovo je za drugu nit

    public int counter; // brojac poganjanja koliko puta su niti prosle dok nisu dosle do istog broja
    //ovde je counter kriticna sekcija
    // ako obe niti pristupe counteru rezultat ce biti manji, najbolji nacin da se ovo resi je preko Monitora i to preko synchronized
    // ako je cela metoda synchronized znaci da ce metodu u jednom trenutku moci da izvrsava samo jedna nit
    //synchronized je u Javi deo koji omogucava da resi problem kriticnih sekcija

    //sinhronizovana metoda i ona se poziva u niti1 i niti2
    public synchronized void counterIncrement(){ // ovo znaci da ovu metodu moze da izvrsi samo jedna nit u svakom trenutku
        counter++;
    }
}
