package ssg.ssgday04class02;

public class ForLoop04 {

    public static void main(String[] args) {
        /*
          Write code to print integers from 3 to 9 excluding 5

      */


        // 1 st way

        for(int i=3;i<10;i++) {

            if (i != 5) {

                System.out.print(i + " ");
            }
        }
        System.out.println();

        // 2nd way
        for(int i=3;i<10;i++) {

            if (i == 4) {
                continue;
            }else {
                System.out.print(i+" ");
            }
        }


    }
}