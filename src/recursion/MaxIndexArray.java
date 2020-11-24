package recursion;

import java.util.Scanner;

public class MaxIndexArray {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int [] arr= new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = scn.nextInt();
        }
        int max = maxOfArray(arr, 0);
        System.out.println(max);
    }

    private static int maxOfArray(int[] arr, int index) {
        if(index == arr.length-1 ){
            return arr[index];
        }
        //maxIndexOfSmallerArray = misa
        int misa = maxOfArray( arr, index+1 );
        if(misa > arr[index]){
            return misa;
        } else {
            return arr[index];
        }
    }
}


/** Max of an array using Recursion
 Input
n=6
15
30
40
4
11
9
 Output
40
 */