package com.example.datastructures.arrays;

public class Searching {
    public static void main(String[] args) {

        int arr[]={ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        int elementtofound = 10;

        //Searches the element 4 in array

        int indexlocation =0;

        indexlocation = searchelement(arr,elementtofound);

        if(indexlocation!=0){
            System.out.println("The element "+elementtofound+ " found at "+indexlocation+" location ");
        }else{
            System.out.println("The element not found ....");
        }

    }

    private static int searchelement(int[] arr, int elementtofound) {

        int position=0;

        for (int i=0;i<arr.length;i++){
            if (arr[i]==elementtofound){
                position = i+1;
            }
        }
        return position;
    }
}
