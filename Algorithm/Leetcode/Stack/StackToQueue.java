package Leetcode.stack;

import com.sun.tools.javac.code.Attribute;

import java.util.Stack;

import java.nio.file.StandardWatchEventKinds;

/**
 * @author vanguo996
 * 用两个栈实现队列
 */


public class StackToQueue {
    private Stack<Integer> stack;
    private Stack<Integer> helper;

    public StackToQueue() {
        stack = new Stack<>();
        helper = new Stack<>();
    }

    public void push(int x) {

        stack.push(x);

    }

    /**
    * @Description 关于pop和peek，当辅助栈中不为空时，是一定不能倒入的！只有当辅助栈为空时，
    * 才将stack倒入辅助栈
    *
    *
    */

    public int pop() {

        if (stack.isEmpty() && helper.isEmpty()) {
            throw new IndexOutOfBoundsException("error");
        } else if (helper.isEmpty()) {
            while (!stack.isEmpty()) {
                helper.push(stack.pop());
            }

        }
        return helper.pop();
    }

    public int peek() {
        if (stack.isEmpty() && helper.isEmpty()) {
            throw new IndexOutOfBoundsException("error");
        } else if (helper.isEmpty()) {
            while (!stack.isEmpty()){
                helper.push(stack.pop());
            }
        }
        return helper.peek();
    }

    public boolean empty() {
        return stack.isEmpty() && helper.isEmpty();
    }

    public static void main(String[] args) {
        StackToQueue queue = new StackToQueue();

        queue.push(1);
        queue.push(2);
        queue.peek();  // 返回 1
        queue.pop();   // 返回 1
        queue.empty(); // 返回 fals

    }


}
