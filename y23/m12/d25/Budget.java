package y23.m12.d25;

import java.util.*;

public class Budget {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] d = {1,3,2,5,4};
        int result = solution.solution(d, 9);
        System.out.println("결과: "+result);
    }
}
class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);

        for (int i = 0; i < d.length; i++) {
            if (budget >= d[i]) {
                budget -= d[i];
                answer++;
            } else {
                break;
            }
        }

        return answer;
    }
}