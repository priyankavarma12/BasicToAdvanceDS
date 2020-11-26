package recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class SubsequenceString {

    public static void main(String[] args) {
        Scanner scn = new Scanner( System.in );
        String str = scn.next();
        ArrayList<String> ss = gss(str);
        System.out.println(ss);
    }

    private static ArrayList<String> gss(String str) {
        if(str.length() == 0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add( "" );
            return  bres;
        }
        char ch = str.charAt( 0 ); //a
        String res = str.substring( 1 ); //bc
        ArrayList<String> rres = gss(res); //[--, -c, b-, bc]

        ArrayList<String> mres = new ArrayList<>();
        for(String rstr : rres){
            mres.add( "" + rstr);
        }
        for(String rstr : rres){
            mres.add( ch + rstr);
        }
        return mres;

    }
}

/** Print all subsequence of string using recursion and arraylist
Input
abc
Output
abc
[, c, b, bc, a, ac, ab, abc]
 */