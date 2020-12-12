package Leetcode.stack;

import java.util.Stack;

/**
 * @author vanguo996
 */


public class LeetCode155 {


    private final Stack<Integer> stack;
    private final Stack<Integer> stackMin;

    /** initialize your data structure here. */
    public LeetCode155() {
        stack = new Stack<>();
        stackMin = new Stack<>();

    }

    public void push(int x) {
        if(stack.isEmpty()) {
            //这里不能有stack.push，因为会重复压栈。
            stackMin.push(x);
        }
        //另外这里两个if  可以换成else if
        else if(x >= stackMin.peek()){
            stackMin.push(stackMin.peek());
        } else {
            stackMin.push(x);
        }

        stack.push(x);
    }

    public void pop() {
        if(stack.isEmpty()) {
            throw new IndexOutOfBoundsException("error");
        }

        stack.pop();
        stackMin.pop();

    }

    public int top() {

        return stack.peek();

    }

    public int getMin() {
        if(stack.isEmpty()) {
            throw new IndexOutOfBoundsException("stack is empty");
        }

        return stackMin.peek();

    }

    public static void main(String[] args) {
        LeetCode155 leetCode155 = new LeetCode155();

        leetCode155.push(-2);
        leetCode155.push(0);
        leetCode155.push(3);
        leetCode155.getMin();
        leetCode155.pop();
        leetCode155.pop();
        leetCode155.top();
        leetCode155.getMin();

    }


}
