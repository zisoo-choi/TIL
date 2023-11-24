package y23.m11.d24;

import java.util.*;

public class ValidParentheses {
    public static void main(String[] args) {
        boolean a = solution(")()(");
        System.out.println("결과: "+ a);
    }

    static boolean solution(String s) {
        boolean answer = true;

        Stack<Character> stack = new Stack<>();
        char[] chars = new char[s.length()];

        for(int i = 0; i < s.length(); i++){
            stack.push(s.charAt(i));
            chars[i] = stack.peek();
            stack.pop();
        }

        for(int i = 0; i <chars.length; i++){
            char c = chars[0];
            char cc = chars[chars.length -1];
            if(c == '(' && cc == ')') {
                answer = true;
            } else {
                answer = false;
            }
        }

        return answer;
    }
}
