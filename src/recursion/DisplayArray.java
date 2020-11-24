package recursion;

import java.util.Scanner;

public class DisplayArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println("Display Array with Recursion");
        displayArray(arr, 0);
        System.out.println("Display Array in Reverse with Recursion");
        displayReverseArray(arr, 0);
    }

    private static void displayArray(int[] arr, int i) {
        if(i == arr.length){
            return;
        }
        System.out.println(arr[i]);
        displayArray( arr, i+1 );
    }

    private static void displayReverseArray(int [] arr, int i){
        if(i == arr.length){
            return;
        }
        displayReverseArray( arr, i+1 );
        System.out.println(arr[i]);
    }
}


/** Display Array using Recursion
Input
 5
 10
 20
 30
 40
 50
 Output
 Display Array with Recursion
 10
 20
 30
 40
 50
 Display Array in Reverse with Recursion
 50
 40
 30
 20
 10

 */