package stack;

import java.util.Scanner;
import java.util.Stack;

public class DuplicateBrackets {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Stack<Character> st = new Stack<>();
        for(int i=0;i<input.length();i++){
            char ch = input.charAt(i);
            if(ch == ')'){
                if(st.peek() == '('){
                    System.out.println(true);
                    return;
                } else {
                    while(st.peek() != '('){
                        st.pop();
                    } st.pop();
                }
            } else {
                st.push(ch);
            }
        }
        System.out.println(false);
    }
}

/** Duplicate brackets
 * You are required to print true if you detect extra brackets and false otherwise
 * Input
 * (a+b)+((c+d))
 * Output
 * true
 * False scenario
 * ((a+b)+(c+d))
 * false
 */