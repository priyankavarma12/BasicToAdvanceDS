package recursion;

import java.util.Scanner;

public class FirstIndexOfArray {

    public static void main(String[] args) {

        Scanner scn = new Scanner( System.in );
        int n = scn.nextInt();

        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = scn.nextInt();
        }

        int data = scn.nextInt();
        int fi = firstIndex(arr, 0, data);
        System.out.println(fi);

    }

    private static int firstIndex(int[] arr, int idx, int data) {
        if( idx == arr.length){
            return -1;
        }
        if( arr[idx] == data){
            return idx;
        } else {
            int fi = firstIndex( arr, idx+1 , data);
            return fi;
        }
    }

}

/**
Input
n=6
15
11
40
4
4
9
4
Output
3
 */