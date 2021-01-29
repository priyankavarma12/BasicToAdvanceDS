package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class InfixConversions {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();

        Stack<String> post = new Stack<>();
        Stack<String> pre = new Stack<>();
        Stack<Character> ops = new Stack<>();

        for(int i=0;i<exp.length();i++){
            char ch = exp.charAt(i);

            if(ch == '('){
                ops.push(ch);
            } else if((ch >=0 && ch <=9 ) || (ch >='a' && ch<='z') || (ch >='A' && ch <= 'Z')){
                post.push(ch + "");
                pre.push(ch + "");
            } else if(ch==')'){
                while(ops.peek() !='('){
                    char op = ops.pop();
                    String postv2 = post.pop();
                    String postv1 = post.pop();
                    String postv = postv1 + postv2 + op;
                    post.push(postv);

                    String prev2 = pre.pop();
                    String prev1 = pre.pop();
                    String prev = op + prev1 + prev2 ;
                    pre.push(prev);

                }
                ops.pop();
            } else if(ch=='+' || ch=='-' || ch=='*' || ch=='/'){
                while(ops.size()>0 && ops.peek() !='(' && precedence(ch) <= precedence(ops.peek())){
                    char op = ops.pop();
                    String postv2 = post.pop();
                    String postv1 = post.pop();
                    String postv = postv1 + postv2 + op;
                    post.push(postv);

                    String prev2 = pre.pop();
                    String prev1 = pre.pop();
                    String prev = op + prev1 + prev2 ;
                    pre.push(prev);

                }
                ops.push(ch);
            }
        }

        while(ops.size() > 0){
            char op = ops.pop();
            String postv2 = post.pop();
            String postv1 = post.pop();
            String postv = postv1 + postv2 + op;
            post.push(postv);

            String prev2 = pre.pop();
            String prev1 = pre.pop();
            String prev = op + prev1 + prev2 ;
            pre.push(prev);

        }
        System.out.println("Postfix exp :: "+ post.pop());
        System.out.println("Prefix exp :: "+pre.pop());
    }


    private static int precedence(char op){
        if(op == '+' || op =='-'){
            return 1;
        } else if( op == '*' || op == '/'){
            return 2;
        } else {
            return 0;
        }
    }
}


/** Infix conversion to Postfix and prefix expression
 * Input
 * a*(b-c+d)/e
 * Output
 * Postfix exp :: abc-d+*e/
 * Prefix exp :: /*a+-bcde
 */