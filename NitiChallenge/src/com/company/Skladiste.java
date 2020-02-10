package com.company;

public class Skladiste {

    public volatile int brojCigli=0;
    public synchronized  void setBrojCigli(){
        //if(brojCigli<1000)
            brojCigli++;
    }




}
