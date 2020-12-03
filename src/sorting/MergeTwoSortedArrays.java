package sorting;

import java.util.Scanner;

public class MergeTwoSortedArrays {

    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        int n = scanner.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = scanner.nextInt();
        }

        int m = scanner.nextInt();
        int b[] = new int[m];
        for(int i=0;i<m;i++){
            b[i] = scanner.nextInt();
        }

        int [] mergeArray = mergeTwoSortedArrays(a,b);
        print(mergeArray);
    }

    public static void print(int [] arr){
        for(int i=0; i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    private static int[] mergeTwoSortedArrays(int[] a, int[] b) {
        int [] res = new int[a.length + b.length];
        int i=0;
        int j=0;
        int k=0;
        while(i < a.length && j<b.length){
            if(a[i] < b[j]){
                res[k] = a[i];
                i++;
                k++;
            } else {
                res[k] = b[j];
                j++;
                k++;
            }
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



}

/** Merge two sorted arrays with O(n) time complexity
 * Input
n = 4
-2
5
9
11
m = 3
4
6
8
Output
-2
4
5
6
8
9
11
 */