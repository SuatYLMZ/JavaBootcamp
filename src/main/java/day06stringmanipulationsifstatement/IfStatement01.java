package day06stringmanipulationsifstatement;

import java.util.Scanner;

public class IfStatement01 {
    public static void main(String[] args) {

        /*
            If you study hard you will get offer soon

            Note: To execute our codes under some conditions we use "if-statement"
         */



        //Example1: if a number is positive, print positive o the console

        int a = 12;


        //1.Way
        if (a>0){
            System.out.println("Positive");
        }
        if (a<0){
            System.out.println("Negative");
        }
        if (a==0){
            System.out.println("Neutre");
        }



        //2.Way
        if (a>0){
            System.out.println("Positive");
        } else if (a<0) {
            System.out.println("Negative");
        } else  {
            System.out.println("Neutre");
        }




        //Example2: Type code that prints day names for the given day numbers
        //          1==> Sunday
        //          2==> Monday
        //          7==> Saturday

        Scanner input= new Scanner(System.in);
        System.out.println("Enter day number to see day name please:");

        byte dayNum= input.nextByte();

        if (dayNum==1){
            System.out.println("Sunday");
        }else if (dayNum==2) {
            System.out.println("Monday");
        }else if (dayNum==3) {
            System.out.println("Tuesday");
        }else if (dayNum==4) {
            System.out.println("Wednesday");
        }else if (dayNum==5) {
            System.out.println("Thursday");
        }else if (dayNum==6) {
            System.out.println("Friday");
        }else if (dayNum==7) {
            System.out.println("Saturday");
        }else {
            System.out.println("I told you to enter day numbers, are you good?");
        }

    }

        }









