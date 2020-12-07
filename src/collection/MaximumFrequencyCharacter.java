package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MaximumFrequencyCharacter {

    public static void main(String[] args) {

        Scanner scn = new Scanner( System.in );
        String str = scn.next();
        Map<Character, Integer> map = getFrequency( str );
        char mfc = str.charAt( 0 ); // to get the count from key set
        for(Character key : map.keySet()){
            if(map.get( key ) > map.get( mfc )){
                mfc = key; // max freq count
            }
        }
        System.out.println(mfc);

    }

    private static Map<Character, Integer> getFrequency(String str){
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt( i );
            if(map.containsKey( ch )){
                int of = map.get( ch ); // old frequency
                int nf = of + 1; // new frequency
                map.put( ch, nf );
            } else {
                map.put( ch, 1 );
            }
        }
        return map;
    }

}


/**
Input
zmszeqxllzvheqwrofgcuntypejcxovtaqbnqyqlmrwitc
Output
q
 */