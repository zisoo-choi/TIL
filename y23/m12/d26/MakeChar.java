package y23.m12.d26;

public class MakeChar {
    public static void main(String[] args) {
//        Trial trial = new Trial();
//        String result = trial.trial("try hello world");
//        System.out.println("Trial 결과: "+result);

        Solution solution = new Solution();
        String result2 = solution.solution("try hello world");
        System.out.println("Solution 결과: "+result2);
    }
}
class Trial {
    public String trial(String s) {
        String answer = "";

        // 첫 번째 도전
        String[] str = s.split("\\s"); // 공백 기준으로 자르기
        for(int i = 0; i < str.length; i++){
            for(int j = 0; j < str[i].length(); j++){
                char c = str[i].charAt(j);
                // 짝수라면 대문자로 바꾸어라
                if(j % 2 == 0){
                    answer += Character.toUpperCase(c);
                    continue;
                }
                answer += c;
            }
            if(i != str.length -1){
                answer += " ";
            }
        }

        // 두 번째 도전
        String[] str2 = s.split(""); // 공백 기준으로 자르기
        for(int i = 0; i < str2.length; i++){
            char c = str2[i].charAt(0);
            // 짝수라면 대문자로 바꾸어라
            if(i % 2 == 0){
                answer += Character.toUpperCase(c);
                continue;
            }
            answer += c;
        }

        return answer;
    }
}

class Solution {
    public String solution(String s) {
        String answer = "";
        int cnt = 0;

        // 문자열을 한 글자씩 순회
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            // 공백인 경우 공백을 결과 문자열에 추가하고 cnt 초기화
            if(ch == ' '){
                answer += " ";
                cnt = 0;
                continue;
            }

            // 짝수 번째 알파벳인 경우 대문자로,
            // 홀수 번째 알파벳인 경우 소문자로 변환 후 결과 문자열에 추가
            if((cnt%2) == 0){
                answer += String.valueOf(Character.toUpperCase(ch));
                cnt++;
            }else{
                answer += String.valueOf(Character.toLowerCase(ch));
                cnt++;
            }
        }
        return answer;
    }
}