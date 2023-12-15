package y23.m12.d15;
import java.util.*;

public class JadenCaseStr {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String result = solution.solution("3people unFollowed me");
        System.out.println("결과: "+result);
    }
}

class Solution {
    public String solution(String s) {
        // 결과를 저장할 문자열 초기화
        String answer = "";

        // 문자열을 소문자로 변환하고, 각 문자를 하나씩 나눠 배열에 저장
        String[] sp = s.toLowerCase().split("");

        // 대문자로 변환 여부를 나타내는 플래그 초기화
        boolean flag = true;

        // 배열에 저장된 각 문자에 대해 반복
        for(String ss : sp) {
            System.out.println("ss: "+ ss);
            // flag 값에 따라 대문자로 변환하여 결과 문자열에 추가하거나 그대로 추가
            answer += flag ? ss.toUpperCase() : ss;

            // 현재 문자가 공백인 경우 flag를 true로 설정하고, 그렇지 않으면 false로 설정
            flag = ss.equals(" ") ? true : false;
        }

        System.out.println();
        return answer;
    }
}