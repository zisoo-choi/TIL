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
        for (int i = 0; i < strings.length; i++) {
            for (int j = i + 1; j < strings.length; j++) {
                char char1 = strings[i].charAt(n);
                char char2 = strings[j].charAt(n);

                // 두 문자열의 인덱스 n의 문자가 서로 다르면
                // 또는
                // 두 문자열의 인데스 n의 문자가 같으면 두 문자열 전체를 비교하여 정렬한다.
                if (char1 > char2 || (char1 == char2 && strings[i].compareTo(strings[j]) > 0)) {
                    String temp = strings[i];
                    strings[i] = strings[j];
                    strings[j] = temp;
                }
            }
        }
        return strings;
    }
}