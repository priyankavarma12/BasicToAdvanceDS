package sorting;

import java.util.Scanner;

public class PartitionArray {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int pivot = scn.nextInt();
        partition(arr,pivot);
        print(arr);
    }

    private static void partition(int[] arr, int pivot) {
        int i = 0, j = 0;
        while( i < arr.length){
            if(arr[i] > pivot){
                i++;
            } else {
                swap(arr, i, j);
                i++;
                j++;
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        System.out.println("Swapping "+ arr[i] + " and "+ arr[j]);
        int temp = arr[i];
        arr[i]  = arr[j];
        arr[j] = temp;
    }

    private static void print(int[] arr) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}

/**
5
7
-2
4
1
3
3
Swapping -2 and 7
Swapping 1 and 7
Swapping 3 and 4
-2 1 3 7 4


 */