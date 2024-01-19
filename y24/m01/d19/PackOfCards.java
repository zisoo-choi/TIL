package y24.m01.d19;

import java.util.Stack;

public class PackOfCards {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] cards1 = {"i", "water", "drink"};
        String[] cards2 = {"want", "to"};
        String[] goal = {"i", "want", "to", "drink", "water"};
        String result = solution.solution(cards1, cards2, goal);
        System.out.println("결과: " + result);
    }
}

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";

        Stack<String> stack1 = new Stack<>();
        Stack<String> stack2 = new Stack<>();

        for(int i = cards1.length-1; i >= 0; i--){
            stack1.push(cards1[i]);
        }

        for(int j = cards2.length-1; j >=0; j--){
            stack2.push(cards2[j]);
        }

        for(int i = 0; i < goal.length; i++){
            if(!stack1.isEmpty() && goal[i].equals(stack1.peek())){
                stack1.pop();
                continue;
            }
            if(!stack2.isEmpty() && goal[i].equals(stack2.peek())){
                stack2.pop();
                continue;
            }
            else {
                answer = "No";
                break;
            }
        }

        return answer;
    }
}
