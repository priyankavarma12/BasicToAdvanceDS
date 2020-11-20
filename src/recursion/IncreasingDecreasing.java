package recursion;

import java.util.Scanner;

public class IncreasingDecreasing {

    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        int n = scanner.nextInt();
        printIncreaseDescrease(n);
    }

    private static void printIncreaseDescrease(int n) {
        if(n==0){
            return;
        }
        System.out.println(n);
        printIncreaseDescrease( n-1 );
        System.out.println(n);
    }


}

/** Print Increasing and Decreasing Number using recursion
Input
4
Output
4
3
2
1
1
2
3
4
 */