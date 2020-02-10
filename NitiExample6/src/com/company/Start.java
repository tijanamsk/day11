package com.company;

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        // kreirati program koji pita korisnika kolika je duzina niza voce koji je tipa String
        //korisnik zatim unosi zeljenu duzinu nizu
        //nakon toga korisnik preko konzole unosi elemente niza voce
        // konacno koriscenjem anonimne klase Thread program prikazuje sve unete elemente niza i to 5 puta
        String voce[];
        Scanner input=new Scanner(System.in);
        System.out.println("Unesite zeljenu duzinu niza: ");
        int duzina=input.nextInt();
        voce=new String[duzina];
        for(int i=0;i<voce.length;i++){  //korisnik unosi elemente niza
            System.out.println("Element["+i+"]=");
            String clan=input.next();
            voce[i]=clan;
            System.out.println();
        }
        //ispis clanova niza

        for(int i=0;i<5;i++){ // pravimo 5 niti
            new Thread("" +i){
                public void run(){
                    for(int i=0;i<voce.length;i++){
                        System.out.println("NIt " + getName()+"Element niza " + i + " je " + voce[i]);
                    }
                }
            }.start();

        }
    }
}
