package com.example.datastructures.arrays;

/**
 * Array is memory of contigous memory location of same data data type
 * Array can be initialized of fixed size
 * Arrays can be of same data types
 * drawback of array is we have to define size at initialization time which is memory consumption.
 */
public class ArrayExample {
    public static void main(String[] args) {

        int array1[] = new int[5];
        for (int i=0;i<array1.length;i++){
            array1[i] = 10;
        }


        for (int i=0;i<array1.length;i++){
            System.out.println(array1[i]);
        }

    }
}
