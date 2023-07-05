package ssg.ssgday05class01;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {


        // Select  a number between 1 and 100 to the computer
        // ask the user to guess this number
        // guide the user to large or small the number in each guess entered
        // when the user finds the number, print to the user how many guesses he found the number


        Random rnd = new Random();
        int num = rnd.nextInt();
        Scanner scan = new Scanner(System.in);
        int guess = 0;
        int counter = 0;

        while (num != guess){
            System.out.println("Please enter a number");
            guess=scan.nextInt();

            if (guess>num){
                System.out.println("You should choose a smaller number");
            } else if(guess<num) {

            }
        }

    }
}
