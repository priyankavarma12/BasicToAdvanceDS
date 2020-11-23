package recursion;

import java.util.Scanner;

public class PowerLinear {

    public static void main(String[] args) {

        Scanner scanner = new Scanner( System.in );
        int x = scanner.nextInt();
        int n = scanner.nextInt();
        int xn = power(x,n);
        System.out.println(xn);
    }

    private static int power(int x, int n) {
        if(n==0){
            return 1;
        }
        int xnm1 = power(x,n-1);
        int xn = x * xnm1;
        return xn;
    }


}

/**
Input
2
3
Output
32
 */