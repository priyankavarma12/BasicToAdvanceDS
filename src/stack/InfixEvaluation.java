package stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class InfixEvaluation {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();
        Stack<Integer> operands = new Stack<>();
        Stack<Character> operators = new Stack<>();
        for(int i=0;i<exp.length();i++){
            char ch = exp.charAt(i);
            if(ch == '('){
                operators.push(ch);
            } else if(Character.isDigit(ch)){
                operands.push(ch - '0');
            } else if(ch == ')'){
                while(operators.peek() != '('){
                    char operator = operators.pop();
                    int v2 = operands.pop();
                    int v1 = operands.pop();
                    int opv =  operation(v1, v2, operator);
                    operands.push( opv);
                }
                operators.pop();
            } else if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                // ch is wanting higher priority operators to solve first
                while(operators.size() > 0 && operators.peek() != '(' && precedence(ch) <= precedence(operators.peek())){
                    char operator = operators.pop();
                    int v2 = operands.pop();
                    int v1 = operands.pop();
                    int opv =  operation(v1, v2, operator);
                    operands.push( opv);
                }
                // ch is pushing itself now
                operators.push(ch);
            }
        }
        while(operators.size() != 0){
            char operator = operators.pop();
            int v2 = operands.pop();
            int v1 = operands.pop();
            int opv = operation(v1, v2, operator);
            operands.push(opv);
        }
        System.out.println(operands.peek());

    }

    private static int precedence(char optor){
        if(optor == '+'){
            return 1;
        } else if(optor == '-'){
            return 1;
        } else if(optor == '*'){
            return 2;
        } else {
            return 2;
        }
    }

    private static int operation(int v1, int v2, char optor){
        if(optor == '+'){
            return v1 + v2;
        } else if(optor == '-'){
            return v1 - v2;
        } else if(optor == '*'){
            return v1 * v2;
        } else {
            return v1 / v2;
        }
    }
}

/** Infix Evaluation
 * Input
 * 2+6*4/8-3
 * Output
 * 2
 *
 */