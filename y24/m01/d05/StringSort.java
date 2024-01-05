package y24.m01.d05;

import java.util.*;

public class StringSort {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] strings = {"sun", "bed", "car"};
        String[] result = solution.solution(strings, 1);

        for(String s : result){
            System.out.println("결과: "+s);
        }
    }
}

class Solution {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, (a, b) -> {
            if (a.charAt(n) == b.charAt(n)) {
                return a.compareTo(b); // 인덱스 n의 문자가 같으면 사전순으로 정렬
            } else {
                return Character.compare(a.charAt(n), b.charAt(n));
            }
        });

        return strings;
    }
}