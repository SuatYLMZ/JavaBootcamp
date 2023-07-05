package ssg.ssgday03class01;

import java.util.Scanner;

public class StringManipulations03 {

        // get the user's name-surname information
        // let's make all the letters to  *

    public static void main(String[] args) {

        Scanner input=  new Scanner(System.in);

        System.out.println("Please Enter Your name and surname");

        String nameSurname=input.nextLine();// fatih acar

        System.out.println(nameSurname.replaceAll("\\S","*"));//

        String result = nameSurname.replaceAll("[^0-9]", "*");
        System.out.println(result);


    }
}