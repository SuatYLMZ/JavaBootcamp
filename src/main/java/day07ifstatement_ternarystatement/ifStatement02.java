package day07ifstatement_ternarystatement;

import java.util.Scanner;

public class ifStatement02 {
    public static void main(String[] args) {

        //Example 1:Get user's age
        //          0-4 ==> Baby   -   5-12 ==> Kid   -   13-19 ==>Teenager   -   20-30 ===> Adult
        //          Other ==> Undefined   -   Negative ages ==> Invalid age
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age...");
        byte age = input.nextByte();

        if(age<0){
            System.out.println("Invalid age");
        }else if(age<5){
            System.out.println("Baby");
        }else if(age<13){
            System.out.println("Kid");
        }else if(age<20){
            System.out.println("Teenager");
        }else if(age<31){
            System.out.println("Adult");
        }else {
            System.out.println("Undefined");
        }


            // Always keep the order and write it in that order, so you won't get a wrong answer







    }
}
