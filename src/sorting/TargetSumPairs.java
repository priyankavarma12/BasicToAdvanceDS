package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class TargetSumPairs {

    public static void main(String[] args) {

        Scanner scn = new Scanner( System.in );
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = scn.nextInt();
        }
        int target = scn.nextInt();
        targetSumPairs(arr, target);

    }

    private static void targetSumPairs(int[] arr, int target) {
        Arrays.sort( arr );
        int left = 0, right = arr.length - 1;
        while(left < right){
            if(arr[left] + arr[right] < target) {
                left++;
            } else if(arr[left] + arr[right] > target){
                right--;
            } else {
                System.out.println(arr[left] + "," + arr[right]);
                left++;
                right--;
            }
        }
    }
}

/** Target Sum Pairs with O(log(n)) time complexity
12
9
-48
100
43
84
74
86
34
-37
60
-29
44
160
60,100
74,86
 */