package y23.m12.d30;

public class CaesarCipher {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String result = solution.solution("a B z", 4);
        System.out.println("결과: "+result);
    }
}

class Solution {
    public String solution(String s, int n) {
        String answer = "";

        for(int i = 0; i < s.length(); i++){
            // s의 요소 하나씩 꺼내기
            char c = s.charAt(i);

            // 만약 대문자라면
            if(Character.isUpperCase(c)){
                // 대문자 'A'의 아스키 값(65)를 빼면 해당 알파벳이 얼마나 떨어져있는 지 알 수 있다.
                char upper = (char) ((c - 'A'+ n) % 26 + 'A');
                // % 26을 해주는 이유 ? 연산 범위를 벗어나면 처음으로 돌아가게 하려고 Z -> A
                answer += upper;
            }
            // 소문자 라면
            else if(Character.isLowerCase(c)){
                char lower = (char) ((c - 'a'+ n) % 26 + 'a');
                answer += lower;
            }
            // 문자가 아니라면
            else {
                answer += c;
            }
        }
        return answer;
    }
}