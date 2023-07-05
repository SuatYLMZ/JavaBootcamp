package practices.forwhiledowhileloop;

import java.util.Scanner;

public class Q02 {

    public static void main(String[] args) {

        // ask the user to enter as many numbers as they want
        // if the sum of the numbers entered by the user exceeds 500
        // now you have entered enough numbers, the total is....
        /*

        Scanner input = new Scanner(System.in);

        int number=0;
        int total=0;

        do {

            System.out.println("Please Enter a Number ");
            number=input.nextInt();
            total+=number;

        } while (total<=500);

        System.out.println("you have entered enough numbers  "+total);

   */


        // 2nd way
        Scanner s = new Scanner(System.in);

        int sum = 0;

        while (sum<500) {
            System.out.println("Enter as many numbers as you want");
            sum += s.nextInt();
        }
        System.out.println("You have enterded enough numbers");
        System.out.println("sum of the numbers is = "+sum);

    }
}