package com.example.datastructures.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Visting every element of array at once.
 */
public class Traverse {
    public static void main(String[] args) throws IOException {

        int a[]=new int[50],size;
        BufferedReader scanner = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Enter size of elements");


        size = Integer.parseInt(scanner.readLine());

        if (size>a.length){
            System.out.println("You can not enter size more than "+a.length);
            System.exit(0);
        }
        System.out.println("Enter  elements");

        for (int i=0;i<size;i++){
            a[i] = Integer.parseInt(scanner.readLine());
        }
        System.out.println("OK you have entered "+size+" elements in array");

        System.out.println("And These elements are......");
        for (int i=0;i<size;i++)
        {
            System.out.println("The elemet at "+i+" th postition is "+a[i]);
        }



    }
}
