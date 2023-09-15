package com.codsofttask1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        int randomNumber = randomNumberGenerator.getRandomNumber();
        int guessNumber;
        int attempt = 1;
        do {
            System.out.println("Guess the Number Attempt No " + attempt);
            guessNumber = scanner.nextInt();
            if(guessNumber > randomNumber){
                System.out.println("Too Long");
                attempt++;
            }
            else if(guessNumber < randomNumber){
                System.out.println("Too Short");
                attempt++;
            }

        }
        while (randomNumber !=  guessNumber);

        System.out.println("Yoo You Guessed Right");



    }
}
