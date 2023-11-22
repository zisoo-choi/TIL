package y23.m11.d22;
import java.util.Stack;

public class RemovePair {
    public static void main(String[] args) {
        int result = solution("baabaa");
        System.out.println(result);
    }
    public static int solution(String s){
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            if(!stack.isEmpty() && stack.peek() == s.charAt(i)) stack.pop();
            else stack.push(s.charAt(i));
        }
        return stack.isEmpty() ? 1 : 0;
    }
}
