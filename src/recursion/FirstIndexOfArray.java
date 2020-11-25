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
        System.out.println("First Index of Array ");
        int fi = firstIndex(arr, 0, data);
        System.out.println(fi);
        System.out.println("Last Index of Array ");
        int li = lastIndex(arr, 0, data);
        System.out.println(li);

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

    public static int lastIndex(int[] arr, int idx, int x){
        if(idx == arr.length){
            return -1;
        }
        int li = lastIndex(arr, idx + 1, x);
        if(li == -1){
            if(arr[idx] == x){
                return idx;
            } else {
                return -1;
            }
        } else {
            return li;
        }
    }

}

/** First & Last Index of Array using recursion
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
 First Index of Array
 3
 Last Index of Array
 4
 */