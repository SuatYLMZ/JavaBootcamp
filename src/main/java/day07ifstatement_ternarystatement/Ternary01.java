package day07ifstatement_ternarystatement;

public class Ternary01 {
    public static void main(String[] args) {


        //Example 1: Type code to check if a number is even or not by using ternary
        int num= 8;


        //1.Way: Use if-else
        if (num%2==0){
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }



        //2.Way: Ternary
        String result= num%2==0 ? "Even" : "Odd";
        System.out.println(result);




        //Example 2: Type code to check if a number has 3 digits or not, use ternary

        int n= 143;

       String result2= n>99 && n<1000 ? "It has 3 digits" : "Does not have 3 digits";
        System.out.println(result2);




    }
}
