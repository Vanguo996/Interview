package Algorithm4th;

import java.util.Stack;

/**
 * @author vanguo996
 */


class MinStack {
    Stack<Integer> stack;
    Stack<Integer> helper;
    /** initialize your data structure here. */
    public MinStack() {
        stack = new Stack<>();
        helper = new Stack<>();

    }

    public void push(int x) {
        stack.push(x);


    }

    public void pop() {
        stack.pop();


    }

//    public int top() {
//        stack.peek();
//
//    }
//
//    public int getMin() {
//
//    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */