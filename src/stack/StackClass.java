package stack;

import java.util.Stack;

public class StackClass {

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        System.out.println(st + "->" + st.peek() + " " + st.size());
        st.push(20);
        System.out.println(st + "->" + st.peek() + " " + st.size());
        st.push(30);
        System.out.println(st + "->" + st.peek() + " " + st.size());
        st.push(40);
        System.out.println(st + "->" + st.peek() + " " + st.size());
        st.pop();
        System.out.println(st + "->" + st.peek() + " " + st.size());
        st.pop();
        System.out.println(st + "->" + st.peek() + " " + st.size());
        st.pop();
        System.out.println(st + "->" + st.peek() + " " + st.size());
        // st.pop(); //Runtime Exception because stack is empty
        // System.out.println(st + "->" + st.peek() + " " + st.size());
    }

}

/** stack basic
 * Output
 [10]->10 1
 [10, 20]->20 2
 [10, 20, 30]->30 3
 [10, 20, 30, 40]->40 4
 [10, 20, 30]->30 3
 [10, 20]->20 2
 [10]->10 1

 */