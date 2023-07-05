package practices.practice01;

public class Q01_Concatenation {

    public static void main(String[] args) {

        //Initialize variable
        int age = 21;
        int weight = 85;


        //Print variables with label
        System.out.println("age = " + age);
        System.out.println("weight = " + weight);


        //Copy the variable's value
        int myAge = age;
        System.out.println(myAge);
        System.out.println("myAge = " + myAge);


        //Declare multiple variables in the same line
        int year = 2022, month = 12, day = 30;
        System.out.println("day = " + day);


        //Update a variable
        year = 2023;
        System.out.println("year = " + year);

        age = 35;
        System.out.println("age = " + age);



        //Declare a variable:x
        int  x;

        //Initialize another variable:y
        int y = 12;

        //Initialize variable z
        int z = 10;

        //Initialize variable x by using z
         x = z;

        //Update the variables
        y = 5;

        //Print the variables
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);


    }




}
