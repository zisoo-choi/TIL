package y23.m11.d24;

import java.util.*;

public class ValidParentheses2 {
    public static void main(String[] args) {
        boolean result = solution("(())()");
        System.out.println("결과: " + result);
    }

    static boolean solution(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            if (currentChar == '(') {
                stack.push(currentChar);
            } else {
                if (stack.isEmpty() || !isPair(stack.pop(), currentChar)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    static boolean isPair(char open, char close) {
        return (open == '(' && close == ')');
    }
}
