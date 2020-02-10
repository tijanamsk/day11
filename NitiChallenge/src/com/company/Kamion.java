package com.company;

public class Kamion {
    public volatile int brojCigli=1000;
    public synchronized  void setBrojCigli(){
        //if (brojCigli>0)
            brojCigli--;
    }


}
