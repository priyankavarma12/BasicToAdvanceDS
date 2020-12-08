package collection;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GetCommonElements {

    public static void main(String[] args) {

        Scanner scn = new Scanner( System.in );
        System.out.println("Size of n1");
        int n1 = scn.nextInt();
        System.out.println("Array of a1");
        int [] a1 = new int[n1];
        for(int i=0;i<a1.length;i++){
            a1[i] = scn.nextInt();
        }
        System.out.println("Size of n2");
        int n2 = scn.nextInt();
        System.out.println("Array of a2");
        int [] a2 = new int[n2];
        for(int i=0;i<a2.length;i++){
            a2[i] = scn.nextInt();
        }
        System.out.println("Common Elements ::");
        getFrequency(a1, a2);
        //getCommonElements();

        // System.out.println("Get Union of Elements ::");
        // getUnionElements();
    }

    private static void getFrequency(int [] a1, int[] a2){
        Map<Integer, Integer> fmap = new HashMap<>();
        for(int val : a1){
            if(fmap.containsKey( val )){
                int of = fmap.get( val );
                int nf = of + 1;
                fmap.put( val, nf );
            } else {
                fmap.put( val, 1 );
            }
        }
        //remove the common elements from a2 and print
        for(int val : a2){
            if(fmap.containsKey( val )){
                System.out.println(val);
                fmap.remove( val );
            }
        }
    }

    /** Using Java 8 to get common elements */
     private static void getCommonElements(){
         List<Integer> list1 = Arrays.asList(1,1,2,2,2,3,5);
         List<Integer> list2 = Arrays.asList(1,1,1,2,2,4,5);
         List<Integer> finalList = list1.stream().filter( list2::contains ).distinct().collect( Collectors.toList());
         finalList.stream().forEach(System.out::println);
     }

     /** Using Java 8 to get union of  Elements */
     private static void getUnionElements(){
         List<Integer> list1 = Arrays.asList(1,1,2,2,2,3,5);
         List<Integer> list2 = Arrays.asList(1,1,1,2,2,4,5);
         List<Integer> finalList = Stream.of( list1, list2 ).flatMap( l -> l.stream() ).collect( Collectors.toList());
         System.out.println(finalList);
     }


}

/** Get Common Elements from Arrays
Size of n1
7
Array of a1
1
1
2
2
2
3
5
Size of n2
7
Array of a2
1
1
1
2
2
4
5
Common Elements ::
1
2
5
 */