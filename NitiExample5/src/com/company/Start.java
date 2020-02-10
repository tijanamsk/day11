package com.company;
public class Start {
    public static void main(String[] args) {
        //projekat 5 koriscenjem anonimnog objekta klase Thread u svakoj iteraciji for petlje od1-20 kreirajte nit koja ima isti naziv(ime)
        //kao i vrednost trenutnog brojaca for petlje. Osim navedenog ispisati i ime niti.
        for(int i=0;i<=20;i++){
           //argument za naziv niti je string pa cemo morati da koristimo i+ " "

           new Thread(" " + i){ // anonimni objekat klase Thread i taj anonimni objekat mora odmah da se pokrene na kraju .start
               public void run(){
                   System.out.println("Naziv niti je: " + getName());
               }
           }.start();
           //kada se pokrene program vidimo random rezultate ovaj fenomen se zove
            //preplitanje niti-Thread interleaving
        }
    }
}
