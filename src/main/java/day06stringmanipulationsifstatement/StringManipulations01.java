package day06stringmanipulationsifstatement;

public class StringManipulations01 {
    public static void main(String[] args) {

        //Example 1: Type code to find the index of the first occurrence of 'a' in a given String
        //          Alabama ==> my code should print 2 for me

        //indexOf('a') will give you the index of first occurrence of 'a'
        String s="Alabama";
        int idxA= s.indexOf('a');


        //Example2:  Type code to fin the index of the first occurrence of 'java' in a given String
        //  "java is easy to learn, java is common in the market, java is OOP" ==> 2


        String t = "java is easy to learn, java is common in the market, java is OOP";

        //indexOf("java"); will give you the index of first character of the first occurrence of "java"
        int idxJava= t.indexOf("java");
        System.out.println(idxJava);

        t.indexOf("Mary"); //===> -1

        //Note1: If you use "non-existing character or characters" in indexOf() method, it will give you -1
        //Note2: indexOf() method can be used with "char" and "String" data types.


        //Example3: Type code to find the index of the last occurrence of 'm' in a given String
        //          miami ==>  my code should print 3 for me

        String u= "miami";

        //lastIndexOf('m'); will give you the index of the lst occurrence of 'm'
        int idxM= u.lastIndexOf('m');
        System.out.println(idxM);


        //Example4:Type code to find the index of the last occurrence of 'earn' in a given string
        //          Learn Java earn money ==> my code should print 11 for me

        String v= "Learn Java earn money";

        int idxEarn= v.lastIndexOf("earn");
        System.out.println(idxEarn);


        //Note1: If you use "non-existing character or characters" in lastIndexOf() method, it will give you -1
        //Note2: lastIndexOf() method can be used with "char" and "String" data types.



        //Example5: Type code to check if a given character is unique oe not in a given String
        //          miami ==> 'a' ==> a is used once that's why it is unique
        //                ==> 'i' ==> i is used twice, so it is not unique

        String y= "miami";
        char ch='m';
        boolean r1= y.indexOf(ch)==y.lastIndexOf(ch);
        System.out.println("is the character unique?"+r1);

        /*
            Note: When you type code you should be careful about "coding standarts"
                    i)Separate "data" and the "main code"
         */







    }
}
