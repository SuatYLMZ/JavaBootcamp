package ssg.ssgday03class01;

public class StringManipulations01 {

    public static void main(String[] args) {

          /*
       Question 1) Write a Java code that compares two entered String data.
        */
        String str="JAVA";
        String str2="hava";

        boolean s = str.equals(str2);
        System.out.println(s);  //false

        System.out.println(str.equalsIgnoreCase(str2));//true
        System.out.println(str.equalsIgnoreCase(str2));//flase



    }


 }
