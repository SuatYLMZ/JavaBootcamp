package ssg.ssgday01class01;

public class Swap01 {
    public static void main(String[] args) {

          /*
        1- Changing the values of given number1 and number2 variables (SWAP)
        write a program
        Example: number1=10 and number2=20;
        after running the code
        number1=20 and number2=10

         */

        int number1=10;
        int number2=20;

        System.out.println("before swap : "+number1 + "and " + number2);
        number1=number1+number2;//10+20=30

        number2=number1-number2;//10-20=10

        number1=number1-number2;//30-10=20


        int num1=10,num2=20,temp=0;
        System.out.println(num1);
        System.out.println(num2);

        temp=num1;
        num1=num2;
        num2=temp;

        System.out.println(num1);
        System.out.println(num2);

        System.out.println("after  swap : "+number1 + "and " + number2);



    }
}
