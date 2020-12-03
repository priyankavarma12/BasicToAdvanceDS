package sorting;

import java.util.Scanner;

public class MergeSort {

    public static int[] mergeSort(int[] arr, int lo, int hi) {
        //write your code here
        if(lo == hi){
            int b[] = new int[1];
            b[0] = arr[lo];
            return b;
        }
        int mid = (lo + hi)/2;
        int fsa[] = mergeSort(arr, lo, mid);
        int ssa[] = mergeSort(arr, mid+1, hi);
        int fms[] = mergeTwoSortedArrays(fsa, ssa);
        return fms;
    }



    private static int[] mergeTwoSortedArrays(int[] a, int[] b) {
        int [] res = new int[a.length + b.length];
        int i=0, j=0, k=0;
        while(i < a.length && j<b.length){
            if(a[i] < b[j]){
                res[k] = a[i];
                i++;
            } else {
                res[k] = b[j];
                j++;
            }
            k++;
        }
        while(i < a.length){
            res[k] = a[i];
            i++;
            k++;
        }
        while(j<b.length){
            res[k] = b[j];
            j++;
            k++;
        }
        return  res;
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int[] sa = mergeSort(arr,0,arr.length - 1);
        System.out.print("Sorted Array -> ");
        print(sa);
    }

}


/** Merge Sort
n = 5
7
-2
4
1
3
 Merging these two arrays
 left array -> 7
 right array -> -2
 Merging these two arrays
 left array -> -2 7
 right array -> 4
 Merging these two arrays
 left array -> 1
 right array -> 3
 Merging these two arrays
 left array -> -2 4 7
 right array -> 1 3
 Sorted Array -> -2 1 3 4 7
 
 Sorted Array -> -2 1 3 4 7
 */