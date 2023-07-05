package ssg.ssgday05class01;

public class ForWhileDoWhileLoop {
    public static void main(String[] args) {

        //Question 1) Print numbers 1 to 5 (including 3 and 8) on the same line using


        //for loop
        for (int i = 1; i <6 ; i++) {

            System.out.print(i+" ");

        }

        System.out.println();

        //while loop
        int k=1;
        while (k<6){

            System.out.print(k+" ");
           k++;
        }

        System.out.println();


        //do while

        int j=1;
        do {
            System.out.print(j+" ");
            j++;
        }while(j<6);

    }
}
