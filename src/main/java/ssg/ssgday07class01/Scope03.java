package ssg.ssgday07class01;

public class Scope03 {

    public static void main(String[] args) {


        {
            int x=15;
            System.out.println(x);
            {
                System.out.println(x);//
            }
        }

        boolean z= true;
        System.out.println(z);//x



    }
}