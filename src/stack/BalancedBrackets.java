package stack;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        Stack<Character> st = new Stack<>();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
            } else if(ch == ')'){
                boolean val = handleClosing(st, '(');
                if(val == false){
                    System.out.println(val);
                    return;
                }
            } else if(ch == ']'){
                boolean val = handleClosing(st, '[');
                if(val == false){
                    System.out.println(val);
                    return;
                }
            } else if(ch == '}'){
                boolean val = handleClosing(st, '{');
                if(val == false){
                    System.out.println(val);
                    return;
                }
            }
        }
        if(st.size()==0){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    private static boolean handleClosing(Stack<Character> st, char correspondingOpChar ){
        if(st.size() == 0){
            return false;
        } else if(st.peek() != correspondingOpChar){
            return false;
        } else{
            st.pop();
            return true;
        }
    }
}


/**
 * Balanced Brackets
 * You are required to check if the expression is balanced i.e. closing brackets and opening brackets match up well
 * Input
 * [(a + b) + {(c + d) * (e / f)}]
 * Output
 * true
 *
 * E.g.
 * [(a + b) + {(c + d) * (e / f)}] -> true
 * [(a + b) + {(c + d) * (e / f)]} -> false
 * [(a + b) + {(c + d) * (e / f)} -> false
 * ([(a + b) + {(c + d) * (e / f)}] -> false
 */