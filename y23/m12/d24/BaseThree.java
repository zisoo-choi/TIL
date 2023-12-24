package y23.m12.d24;

import java.util.*;

public class BaseThree {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution(7);

        System.out.println("결과: "+result);
    }
}

class Solution {
    public int solution(int n) {
        int answer = 0;

        List<Integer> baseThree = new ArrayList<>();

        // 1. 3진수 구하면서 뒤집은 수 넣기 성공
        while (n > 0) {
            baseThree.add(n % 3);
            n /= 3;
        }
        System.out.println("list: "+ baseThree);

        // 2. 뒤집은 3진수를 10진수로 변환하기
        for(int i = 1, j = baseThree.size()-1; j >= 0; i*=3, j--){
            answer += baseThree.get(j) * i;
        }

        return answer;
    }
}