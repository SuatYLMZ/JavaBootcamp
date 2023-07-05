package ssg.ssgday03class01;

import java.util.Scanner;

public class StringManipulations02 {

     /*
          Question 2) Ask the user to enter their email address,
          If mail does not contain @gmail.com "Please enter gmail address",
          Ends with @gmail.com "Your email has been saved"
          If it doesn't end with @gmail.com, please check my spelling and print it.
        */
    // frotan@gmail.com

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter Your Email");

        String email = input.nextLine();

        String serachStr = "@gmail.com";

        //true  !T   = F

        if (!email.contains(serachStr)) {
            System.out.println("Please enter a gmail address.");
        } else if (email.endsWith(serachStr)) {
            System.out.println("Your email has been saved.");
        } else {
            System.out.println("Please check your spelling.");

        }


    }

}
