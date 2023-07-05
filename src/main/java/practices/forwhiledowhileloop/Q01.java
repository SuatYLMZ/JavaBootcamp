package practices.forwhiledowhileloop;

import java.util.Scanner;

public class Q01 {

    public static void main(String[] args) {

        // ask from user how many number  wants to add .
        // get these numbers and print the sum of these numbers on console
        // 5  4+5+6+7+8==>

        Scanner input = new Scanner(System.in);
        System.out.println("how many number do you want to add ? ");
        int countNumber = input.nextInt();

        int total=0;
        int counter=1;
        int number=0;

        while (counter<=countNumber){
            System.out.println("please Enter a number ?");
            number=input.nextInt();
            total=total+number;
            counter++;
        }
        System.out.println("Enter  " +countNumber + " number the total is "+ total);



    }


}