# 2022.12.26
프로그래머스 > 코딩테스트 연습 > 연습문제 > [이상한 문자 만들기](https://school.programmers.co.kr/learn/courses/30/lessons/12930#)

---
### 📌 Part 1. 문제 해결 절차
_※ 입력에 따른 공백을 출력에서도 보여주기(실패)_<br>
```
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
```
ㅇㅇ<br>
<br>

---
### 📌 Part 2. 다른 사람의 풀이
_※ 다른 사람의 풀이를 보고, 해석하는 시간을 가진다._<br>
```
class Solution {
  public String solution(String s) {

        String answer = "";
        int cnt = 0;
        String[] array = s.split("");

        for(String ss : array) {
            cnt = ss.contains(" ") ? 0 : cnt + 1;
            answer += cnt%2 == 0 ? ss.toLowerCase() : ss.toUpperCase(); 
        }
      return answer;
  }
}
```
1. 
<br>

ㅇㅇㅇ<br>
<br>

---
### 🙄 Part 3. 생각
너무 피곤하므로 정리는 내일 오전 중으로 마무리하겠음.<br>
