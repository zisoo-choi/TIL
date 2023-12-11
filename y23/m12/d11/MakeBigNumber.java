package y23.m12.d11;
import java.util.Stack;

public class MakeBigNumber {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = solution.solution("1231234", 3);
        System.out.println("결과: "+s);
    }
}

class Solution {
    public String solution(String number, int k) {
        StringBuilder answer = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        int len = number.length();

        for (int i = 0; i < len; i++) {
            char currentDigit = number.charAt(i);

            // 스택이 비어있지 않고, 현재 숫자가 스택의 top보다 크면 pop
            while (!stack.isEmpty() && stack.peek() < currentDigit && k > 0) {
                stack.pop();
                k--;
            }

            // 현재 숫자를 스택에 push
            stack.push(currentDigit);
        }

        // 남은 제거 횟수(k)만큼 스택에서 pop
        while (k > 0) {
            stack.pop();
            k--;
        }

        // 스택의 내용을 정답 문자열로 변환
        for (int i = 0; i < stack.size(); i++) {
            char digit = stack.get(i); // 스택에서 i번째 요소를 가져옴

            // 스택의 내용이 그대로 추가된다.
            answer.append(digit);
            System.out.println(i + "번째: " + digit);
        }

        return answer.toString();
    }
}