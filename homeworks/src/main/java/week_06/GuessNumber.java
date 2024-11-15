package week_06;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random  random= new Random();
        int guessedNum= random.nextInt(11);// generate random nums from 0-100 included.

        System.out.println(" let's start our game!");
        System.out.println("try to guess a number from 1- 10");

        do {
            System.out.println("please enter your guessed number: ");
            int input = scanner.nextInt();
            if (input == guessedNum){
                System.out.println(" congratulation! your guess is correct");
                break;
            }
            if (input > guessedNum){
                System.out.println(" your guess is too high, try gain");
            }

            if (input < guessedNum){
                System.out.println(" your guess is too low, try gain");
            }
        }while (true);
        scanner.close();



    }
}
