package com.mark.stack.No_20_ValidParentheses;

import java.util.Stack;

public class Solution {

    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
        char[] target = s.toCharArray();
        for (int i = 0; i < target.length; i++) {
            if (stack.empty()) {
                stack.push(target[i]);
                continue;
            }
            Character c = stack.peek();
            if (check(c, target[i])) {
                stack.pop();
            } else {
                stack.push(target[i]);
            }
        }
        return stack.empty();
    }

    private boolean check(char c1, char c2) {
        if (c1 == '(' && c2 == ')') {
            return true;
        }
        if (c1 == '{' && c2 == '}') {
            return true;
        }
        if (c1 == '[' && c2 == ']') {
            return true;
        }
        return false;
    }
}
