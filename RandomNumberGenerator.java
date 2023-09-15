package com.codsofttask1;

public class RandomNumberGenerator {
     private int randomNumber ;

    public int getRandomNumber() {
        randomNumber = (int) (Math.random()*100);
        return randomNumber;
    }
}
