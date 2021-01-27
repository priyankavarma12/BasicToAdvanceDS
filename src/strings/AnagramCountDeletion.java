package strings;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramCountDeletion {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter string1 : ");
        String s1 = scn.nextLine();
        System.out.println("Enter string2 : ");
        String s2 = scn.nextLine();
        System.out.println("Deleting count of characters to make anagram : ");
        int res = makeAnagram(s1, s2);
        System.out.println(res);
    }

    private static int makeAnagram(String s1, String s2) {
        int[]  freq = new int[26];
        s1.chars().forEach((c) -> {
            freq[c - 97]++;
        });
        s2.chars().forEach((c) -> {
            freq[c - 97]--;
        });
        return Arrays.stream(freq).map(Math :: abs).sum();
    }
}

/**
Enter string1 :
cde
Enter string2 :
abc
Deleting count of characters to make anagram :
4
 Explanation
 Delete the following characters from the strings make them anagrams:

 Remove d and e from cde to get c.
 Remove a and b from abc to get c.
 It takes  deletions to make both strings anagrams.
 */