package Leetcode.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author vanguo996
 *  4ms
 */


public class ValidParenthesis {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> mappings = new HashMap<>();
        mappings.put(')','(');
        mappings.put('}','{');
        mappings.put(']','[');
        for (Character c : s.toCharArray()){
            if (c == '(' || c == '[' || c == '{')
                stack.push(c);
            else if( stack.size() == 0 ||mappings.get(c) != stack.pop()) return false;
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ValidParenthesis vp = new ValidParenthesis();
        System.out.println(vp.isValid("}"));
    }

}
