package y23.m12.d19;

import java.util.*;

public class DescendingOrder {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String result = solution.solution("Zbcdefg");
        System.out.println("결과: "+result);
    }
}

class Solution {
    public String solution(String s) {
        String answer = "";

        String[] str = s.split("");
        Arrays.sort(str, Collections.reverseOrder());

        for(String a : str)
            answer += a;

        return answer;
    }
}
