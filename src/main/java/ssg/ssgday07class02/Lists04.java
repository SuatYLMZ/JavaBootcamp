package ssg.ssgday07class02;

import java.util.ArrayList;
import java.util.List;

public class Lists04 {
    public static void main(String[] args) {
        // delete the desired element (how many) from a given array and leave the rest
        // create a method that prints it as a new list

        int arr[]={3,4,2,3,5,7,3,8,5,2,4};
        int unwantedElement=3;

        createUnwantedElement(arr,unwantedElement);
    }

    public static void createUnwantedElement(int[] arr, int unwantedElements) {
        List<Integer> newList=new ArrayList<>();

        for (Integer w:arr){
            if (w!=unwantedElements){
                newList.add(w);

            }
        }
        System.out.println(newList);//[4, 2, 5, 7, 8, 5, 2, 4]


        // for (int i = 0; i <arr.length ; i++) {
        //     if (arr[i] != istenmeyenEleman){
        //         yeniList.add(arr[i]);
        //     }

        // }



    }
}