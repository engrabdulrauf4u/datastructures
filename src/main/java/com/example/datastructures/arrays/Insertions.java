package com.example.datastructures.arrays;

import java.util.Arrays;

/*

 */
public class Insertions {
    public static void main(String[] args) {
        //Insertion at specific position without loosing data.
        int arr[]
                = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        // element to be inserted
        int valuetoinsert = 50;

        // position at which element
        // is to be inserted
        int pos = 5;

        // print the updated array
        System.out.println("\nArray before " + valuetoinsert
                + " inserting values \n"
                + Arrays.toString(arr));


        arr = insertTospecificPosition(arr,valuetoinsert,pos);

        // print the updated array
        System.out.println("\nArray with " + valuetoinsert
                + " inserted at position "
                + pos + ":\n"
                + Arrays.toString(arr));


    }

    private static int[] insertTospecificPosition(int[] arr, int valuetoinsert, int pos) {
        int newArray[] = new int[arr.length+1];

        for (int i=arr.length-1;i>=pos-1;i--){

            newArray[i+1]=arr[i];
        }
        newArray[pos-1] = valuetoinsert;

        // copy starting elements to new array

        for (int i=0;i<pos-1;i++){

            newArray[i]=arr[i];
        }

        return newArray;
    }
}
