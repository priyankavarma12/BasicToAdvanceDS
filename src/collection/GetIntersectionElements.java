package collection;

import java.util.HashMap;
import java.util.Scanner;

public class GetIntersectionElements {

    public static void main(String[] args) {

        Scanner scn = new Scanner( System.in );
        System.out.println("Size of array n1 ");
        int n1 = scn.nextInt();
        System.out.println("Array1 ");
        int[] a1 = new int[n1];
        for (int i = 0; i < a1.length; i++) {
            a1[i] = scn.nextInt();
        }
        System.out.println("Size of array n1 ");
        int n2 = scn.nextInt();
        System.out.println("Array2 ");
        int[] a2 = new int[n2];
        for (int i = 0; i < a2.length; i++) {
            a2[i] = scn.nextInt();
        }

        System.out.println("Get Intersection Of Elements");
        getIntersectionElements( a1, a2 );

    }

    private static void getIntersectionElements(int[] a1, int[] a2) {
        HashMap<Integer, Integer> fmap = new HashMap<>();
        for (int val : a1) {
            if (fmap.containsKey( val )) {
                int of = fmap.get( val );
                int nf = of + 1;
                fmap.put( val, nf );
            } else {
                fmap.put( val, 1 );
            }
        }

        for (int val : a2) {
            if (fmap.containsKey( val ) && fmap.get( val ) > 0) {
                System.out.println( val );
                int of = fmap.get( val );
                int nf = of - 1;
                fmap.put( val, nf );
            }
        }
    }
}

/**
if a1 -> 1 1 2 2 2 3 5
and a2 -> 1 1 1 2 2 4 5
intersection is -> 1 1 2 2 5

Note -> Don't assume the arrays to be sorted.
Input
 Size of array n1
 7
 Array1
 1
 1
 2
 2
 2
 3
 5
 Size of array n1
 7
 Array2
 1
 1
 1
 2
 2
 4
 5
 Output
 Get Intersection Of Elements
 1
 1
 2
 2
 5
 */
