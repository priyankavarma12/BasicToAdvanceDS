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
        displayArray(arr, 0);
    }

    private static void displayArray(int[] arr, int i) {
        if(i == arr.length){
            return;
        }
        System.out.println(arr[i]);
        displayArray( arr, i+1 );
    }
}


/** Display Array using Recursion
Input
n=5
3
1
0
7
5
Output
3
1
0
7
5

Process finished with exit code 0

 */