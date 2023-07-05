package ssg.ssgday07class01;

public class Scope02 {
    public static void main(String[] args) {

        int num=3;
        for (int i = 1; i <4 ; i++) {
            System.out.println(i+num);//i+num

        }

        int x;
        do{
            x=12;
            System.out.println(x);
        }
        while (x>20);// x<20


    }
}