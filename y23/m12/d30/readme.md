# 2022.12.30
프로그래머스 > 코딩테스트 연습 > 연습문제 > [시저 암호](https://school.programmers.co.kr/learn/courses/30/lessons/12926)

---
### 📌 Part 1. 문제 해결 절차
_※ 문자 -> 아스키코드 -> 문자열 (실패)_<br>
```
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
```
챗지피티한테 다른 메소드 질문하다보니, 그냥 문제를 아예 풀어주었다.<br>
기억하고자 할 것은 메소드 쓰임들을 좀 기억해야겠다.<br>
뒤 돌아서면 자꾸 까먹는다.<br>

- Character.isUpperCase() => 대문자 
- Character.isLowerCase() => 소문자 
- Integer.parseInt() => 문자열을 정수로
- Integer.valueOf() => 문자열을 정수로 (NumberFormatException 발생하므로, try ~ catch 사용)
<br>

---
### 📌 Part 2. 다른 사람의 풀이
_※ 다른 사람의 풀이를 보고, 해석하는 시간을 가진다._<br>
```
class Caesar {
    String caesar(String s, int n) {
        String result = "";
        n = n % 26;
        
        for (int i = 0; i < s.length(); i++) {
          char ch = s.charAt(i);
          if (Character.isLowerCase(ch)) {
            ch = (char) ((ch - 'a' + n) % 26 + 'a');
          }
          else if (Character.isUpperCase(ch)) {
            ch = (char) ((ch - 'A' + n) % 26 + 'A');
          }
          result += ch;
        }
        return result;
    }
}
```

다른 사람의 풀이가 챗지피티가 소개한 방법과 같으므로 패스
<br>

---
### 🙄 Part 3. 생각
아스키 코드로 변환하는 방법에 대해서 몰랐다.<br>
내가 생각한 방식은 문자열에서 각 요소를 뺀 문자를 가지고,<br>
문자를 숫자로 바꾼다음 +n 해주고, 숫자를 다시 문자로 바꾼 다음 answer에 더해주려고 했다.<br>
근데 위에서 언급한 NumberFormatException이 발생해서<br>
try ~ catch 문으로 해보는데도 영 원하는 대로 구현이 되지 않았다.<br>
그래서 챗 지피티한테 메소드 몇 개 물어보다가, 삐르게 답을 보고 해석을 했다.<br>
한 일주일 정도 간은 그동안 풀었던 문제를 다시 풀어보며 메소드나 외워서 풀어야 하는 방식?<br>
혹은 이미 정해져 있는 절차를 익히는 시간을 가지는 것도 좋을 것 같다.<br>