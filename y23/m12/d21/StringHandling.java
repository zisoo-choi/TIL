package y23.m12.d21;

import java.util.Collections;

public class StringHandling {
    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean result = solution.solution("1234");
        System.out.println("결과: "+result);
    }
}

class Solution {
    public boolean solution(String s) {
        boolean answer = true;

        if (s.length() == 4 || s.length() == 6) {
            for(int i = 0; i < s.length(); i++){
                if(Integer.valueOf(s.charAt(i)) > Integer.valueOf('9')) {
                    answer = false;
                    break;
                }
            }
        } else{
            answer = false;
        }
        return answer;
    }
}
