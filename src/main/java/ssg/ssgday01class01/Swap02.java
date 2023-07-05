package ssg.ssgday01class01;

public class Swap02 {
     /*
        1- Changing the values ​​of given number1 and number2 variables (SWAP)
        write a program
        Example: number1=10 and number2=20;
        after running the code
        number1=20 and number2=10

         */


    public static void main(String[] args) {

        int number1= 30;
        int number2=20;

        System.out.println("before  Swap number1: " + number1 + ", number2 : "+ number2);
        number1= number1+number2;//sayı1=30
        number2=number1-number2;//sayı2=10
        number1=number1-number2;//sayı1=20
        System.out.println("After Swap number1: " + number1 + ", number2 : "+ number2);
    }
}
