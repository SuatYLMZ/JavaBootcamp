package practices.forwhiledowhileloop;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {

        // Select  a number between 1 and 100 to the computer  70
        // ask the user to guess this number
        // guide the user to large or small the number in each guess entered
        // when the user finds the number, print to the user how many guesses
        // he found the number
        //90


        //11 sara 7

        // fatih  7

        //fatma noor 13..

//        Random rnd = new Random();// 50-100
//
//        int number=rnd.nextInt(100);// 1-100   87
//        Scanner scan= new Scanner(System.in);
//        System.out.println("Please Enter a number ");
//
//        int guess=0;
//        int counter=0;
//        while (number!=guess){
//
//            guess=scan.nextInt();
//            if (guess>number){
//                System.out.println("you must Enter a small number");
//            } else if (guess<number) {
//                System.out.println("you must Enter a large number");
//            }
//            counter++;
//
//        }
//
//        System.out.println("You find my number  "+counter +" guessed");
//
        // 2nd way

        int number = 42;
        Scanner input = new Scanner(System.in);
        int guess;
        int attempt = 0;
        System.out.println("Guess the number between 1 and 100:");
        do {
            guess = input.nextInt();
            attempt++;
            if (guess < number) {
                System.out.println("larger");
            } else if (guess > number) {
                System.out.println("smaller");
            }
        } while (guess != number);
        System.out.println("You found the number in " + attempt);



    }
}