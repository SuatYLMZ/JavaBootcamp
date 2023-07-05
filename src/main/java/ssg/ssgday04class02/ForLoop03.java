package ssg.ssgday04class02;

public class ForLoop03 {
    public static void main(String[] args) {

         /*
     q 3) Print odd and even numbers up to (inclusive) 100 with two separate loops.  1-99
 */

        for (int i = 0; i <101 ; i++) {

            if (i%2==0){
                System.out.print(i+ " ");//even
            }else {
                System.out.println(i+ " ");//odd
            }
        }

        System.out.println("\n");

        for (int i = 0; i <=100 ; i++) {
            if (i%2==1){
                System.out.print(i+ " ");
            }
        }

    }
}