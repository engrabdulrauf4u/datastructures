package com.example.datastructures.arrays;

import java.util.Arrays;

/**
 *
 */
public class SortingArrays {


    public static void main(String[] args) {

        int arr[] = {14, 33, 27, 10, 35, 19, 42, 44};

        arr = insertionsort(arr);

        System.out.println("******Array after Insertion sort*********" + Arrays.toString(arr));

        System.out.println("******Merge Sort Algorithm*********");

        int [ ] testScores = {6,9,8,2,4,1};
        int size = testScores.length;

         mergesort(testScores,size);

        System.out.println("******Array after Merge sort*********" + Arrays.toString(testScores));


        int bubblesort[] = {-2, 45, 0, 11, -9};
        bubblesort(bubblesort);

        System.out.println("******Array after Bubble sort*********" + Arrays.toString(bubblesort));


        int selectionsort[] = {29, 72, 98, 13, 87,66,52,51,36};
        selectionsort(selectionsort);
        System.out.println("******Array after Selection sort*********" + Arrays.toString(selectionsort));


        int quickselectionsort[] = {10, 16, 8, 12, 15,6,3,9,5};
        quickselectionsort(quickselectionsort,1,quickselectionsort.length-1);
        System.out.println("******Array after Quick sort*********" + Arrays.toString(quickselectionsort));

    }

    private static void quickselectionsort(int[] quickselectionsort,int low,int high) {
        int i = low;
        int pivot=0;
        int j = high;

        if (high - low < 1) {
            return;
        }
        while(quickselectionsort[i]<quickselectionsort[pivot]){
            i++;
            System.out.println("Value of I is "+i);
        }

       while(quickselectionsort[j]>quickselectionsort[pivot]){
            j--;
            System.out.println("Value of J is "+j);
        }

        if(i<j){
            int temp = quickselectionsort[i];
            quickselectionsort[i] = quickselectionsort[j];
            quickselectionsort[j] =temp;
            low = i;
            high = j;

            quickselectionsort(quickselectionsort,low,high);
        }else if (i>j){
            int temp = quickselectionsort[pivot];
            quickselectionsort[pivot] = quickselectionsort[j];
            quickselectionsort[j] = temp;

            pivot = 0;
            low = 1;
            high =j-1;

            quickselectionsort(quickselectionsort,low,high);
            pivot = j;
            low = j+1;
            high =quickselectionsort.length-1;
            quickselectionsort(quickselectionsort,low,high);
        }



    }

    /**
     * Selection sort is a sorting algorithm that selects the smallest element from an unsorted list
     * in each iteration and places that element at the beginning of the unsorted list
     */
    private static void selectionsort(int[] selectionsort) {
        int size = selectionsort.length;

///{29, 72, 98, 13, 87,66,52,51,36}
        for (int step=0;step<size-1;step++){
            int minIndex = step+1;

            System.out.println("************************ "+minIndex+"******************************");
            for (int j=step;j<size;j++){

                if(selectionsort[step]>selectionsort[j]){

                    minIndex =j+1;
                    System.out.println("The smallest number is "+selectionsort[j]);
                    int temp = selectionsort[j];
                    selectionsort[j] = selectionsort[step];
                    selectionsort[step] = temp;

                }

            }
        }
    }

    /**
     *  Bubble sort is a sorting algorithm that compares two adjacent elements
     *  and swaps them until they are in the intended order.
     * @param bubblesort
     */
    private static void bubblesort(int[] bubblesort) {

        int size = bubblesort.length;

        for(int i=0;i< size;i++){

            // Loop until ith element
            for (int j=0;j<size-i-1;j++){

                if(bubblesort[j]>bubblesort[j+1]){
                    int temp = bubblesort[j];
                    bubblesort[j] = bubblesort[j+1];
                    bubblesort[j+1]=temp;

                }
            }
        }
    }

    /**
     *  Merge sort is defined as a sorting algorithm that works by dividing an array into smaller subarrays,
     *  sorting each subarray, and then merging the sorted subarrays back together to form the final sorted array.
        
     */
    private static void mergesort(int[] arr, int size) {

        System.out.println("Original Array " + Arrays.toString(arr) + "\n");
        if (size<2){
            return;
        }

        int middle = size / 2;  // defining new parameter middle
        int [ ] new_array_1 = new int [middle]; /** defining the new first array after division */
        int [ ] new_array_2 = new int [size - middle]; /** defining the new second array */

        for (int i = 0; i < middle; i++) { /**applying condition for sorting of new array 1 */
            new_array_1 [ i ] = arr [ i ];
        }

        for (int i = middle; i < size ; i++) { /**applying condition for sorting of new array 2 */
            new_array_2 [ i - middle] = arr [ i ];
        }

        mergesort(new_array_1, middle);
        mergesort (new_array_2, size - middle);

        merge(arr, new_array_1, new_array_2, middle, size - middle);

    }

    private static void merge(int[] arr, int[] new_array_1, int[] new_array_2, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {  // conditions for merging

            if (new_array_1[i] <= new_array_2[j]) {
                arr[k++] = new_array_1[i++];
            }
            else {
                arr[k++] = new_array_2[j++];
            }
        }
        while (i < left) {
            arr[k++] = new_array_1[i++];
        }

        while (j < right) {
            arr[k++] = new_array_2[j++];
        }
    }

    /**
     * This is an in-place comparison-based sorting algorithm. Here, a sub-list is maintained which is always sorted.
     * Algorthim
     * Step 1 − If it is the first element, it is already sorted. return 1;
     * Step 2 − Pick next element
     * Step 3 − Compare with all elements in the sorted sub-list
     * Step 4 − Shift all the elements in the sorted sub-list that is greater than the
     * value to be sorted
     * Step 5 − Insert the value
     * Step 6 − Repeat until list is sorted
     */
    private static int[] insertionsort(int[] arr) {


        int size = arr.length;
        for (int i = 0; i < size; i++) {

            int j=i-1;
            int temp = arr[i];

            while (j >= 0 && temp < arr[j]) {
                arr[j+1]=arr[j];
               // arr[j]=arr[i];
                --j;
            }
            arr[j + 1] = temp;

        }
    return arr;
    }
}
