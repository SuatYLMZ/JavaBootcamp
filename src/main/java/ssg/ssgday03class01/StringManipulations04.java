package ssg.ssgday03class01;

public class StringManipulations04 {

    public static void main(String[] args) {

         /* question 4) Create 3 String variables for the names of the people. 3 names excluding spaces
        Print the sum of the number of characters without Space.
        */

//        String name1="ahmet furkan";
//        String name2="ömer faruk";
//        String name3="ayse nur";

//        System.out.println(name1.length());//12
//        System.out.println(name2.length());//10
//        System.out.println(name3.length());//8 == 12+10+8=30 all character --> withoutSpace 27

//
//        int a1=name1.replaceAll("\\s","").length();
//        int a2=name2.replaceAll("\\s","").length();
//        int a3=name3.replaceAll("\\s","").length();

        //  System.out.println("total character for name1 name2 and name3 is :" +(a1+a2+a3));


        ///
        String name1 = "Kerem Caglar";
        String name2 = "Ayca Guler";
        String name3 = "Hasan Savas";
        int numOfChar = name1.replace(" ", "").length();
        int numOfChar2 = name2.replace(" ", "").length();
        int numOfChar3 = name3.replace(" ", "").length();
        System.out.println("Total = " + (numOfChar+numOfChar2+numOfChar3));

        ///
        System.out.println(name1.concat(name2).concat(name3).replaceAll("\\s", "").length());



    }

}
