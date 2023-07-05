package day07ifstatement_ternarystatement;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class ifStatement01 {
    public static void main(String[] args) {

        //Example1: Type code to check if a given character is upper case or lower case or others ?

        char ch = 'S';   //==> My code should print upper case

        if(ch>='A' && ch<='Z'){
            System.out.println("Upper Case");
        } else if (ch>='a' && ch<='z') {
            System.out.println("Lower Case");
        } else {
            System.out.println("Others");
        }



        //Example 2: If a number is less than 300 or greater than 3000
        //           print "Perfect Number" on the console, otherwise
        //           print "Regular Number" on the console.


        int num = 3200;

        if(num<300 || num>3000){
            System.out.println("Perfect Number");
        } else {
            System.out.println("Regular Number");
        }


        // Example3: Type code to check if a number is "Even" or "Odd"

        int n= 8;

        if (n%2==0){
            System.out.println("The Number Is Even");
        }else{
            System.out.println("The Number Is Odd");
        }


        //Example4: Type code to print the number of months for the given month name
        //           February-->2         May-->5         December-->12        Tom-->Invalid month name

        String monthName="January";

        if (monthName.equalsIgnoreCase("January")){
            System.out.println(1);
        }else if (monthName.equalsIgnoreCase("February")){
            System.out.println(2);
        }else if (monthName.equalsIgnoreCase("March")){
            System.out.println(3);
        }else if (monthName.equalsIgnoreCase("April")){
            System.out.println(4);
        }else if (monthName.equalsIgnoreCase("May")){
            System.out.println(5);
        }else if (monthName.equalsIgnoreCase("June")){
            System.out.println(6);
        }else if (monthName.equalsIgnoreCase("July")){
            System.out.println(7);
        }else if (monthName.equalsIgnoreCase("August")){
            System.out.println(8);
        }else if (monthName.equalsIgnoreCase("September")){
            System.out.println(9);
        }else if (monthName.equalsIgnoreCase("October")){
            System.out.println(10);
        }else if (monthName.equalsIgnoreCase("November")){
            System.out.println(11);
        }else if (monthName.equalsIgnoreCase("December")){
            System.out.println(12);
        }else {
            System.out.println("Invalid Month Name");
        }


    }
}
