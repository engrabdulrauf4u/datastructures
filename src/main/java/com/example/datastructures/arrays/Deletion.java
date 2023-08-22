package com.example.datastructures.arrays;

import java.util.Arrays;

/*

 */
public class Deletion {
    public static void main(String[] args) {

        int arr[]={ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        // delete at kth position
        int k=4;

        arr = deletefromarray(arr,k);


        System.out.println("\nArray After deletion at  " + k
                + " th position \n"
                + Arrays.toString(arr));
    }

    private static int[] deletefromarray(int[] arr, int k) {
        int n = arr.length;

        for (int i=k-1;i<n-1;i++)
        {
            arr[i] = arr[i+1];
            n = n - 1;
        }

        return arr;
    }
}
