package recursion;

import java.util.Scanner;

/**Factorial with recursion*/
public class Factorial {

    public static void main(String[] args) {

        Scanner scanner = new Scanner( System.in );
        int n = scanner.nextInt();
        int f = factorial(n);
        System.out.println(f);
    }

    private static int factorial(int n) {
        if(n==1){
            return 1;
        }
        int fnm1 = factorial(n-1);
        int fn = n * fnm1;
        return fn;
    }


}

/**
Input
5
Output
120
 */