# 2023.12.15

프로그래머스 > 코딩테스트 연습 > 연습문제 > [JadenCase 문자열 만들기](https://school.programmers.co.kr/learn/courses/30/lessons/12951)

---
### 📌 Part 1. 문제 해결 절차
_※ toUpperCase를 활용해본_<br>
```
1. String 문자열을 공백을 기준으로 각각의 문장으로 자른다.
2. 각각의 문장을 가지고 반복문을 돌린다.
    2-1. 첫번째 문자를 추출하여 대문자로 만든다.
    2-2. 첫번째를 제외한 문자를 모두 소문자로 만든다.
```

이렇게 절차를 하려던 도중에 공백을 기준으로 각각의 문장을 자르지 못했다.<br>
이후, 일단 내가 생각한 절차가 맞는 지 확인해보고자<br>
문장 하나라도 잘라서 반복문을 실행해보려고 했다.<br>
String에서 문자 하나를 추출 할때, char 타입으로 뽑아냈더니<br>
char 타입으로 String에 관한 메소드를 못 쓰는 상황들이 생겼다.<br>
<br>

---
### 📌 Part 2. 다른 사람의 풀이
_※ 레벨 1을 푸는 동안에는 다른 사람의 풀이를 보고, 해석하는 시간을 가진다._<br>
```
class Solution {
  public String solution(String s) {
        String answer = "";
        String[] sp = s.toLowerCase().split("");
        boolean flag = true;

        for(String ss : sp) {
            answer += flag ? ss.toUpperCase() : ss;
            flag = ss.equals(" ") ? true : false;
        }

        return answer;
  }
}
```
1. 문자열을 모두 소문자로 바꾼 뒤, 하나하나 문자열 배열에 넣는다.
2. 배열에 저장된 각각의 문자에 대해<br>
    2-1. flag가 true이면, 문자를 대문자로 변환하여 answer에 더한다. => (첫 문자/ 공백 뒤 문자의 경우)<br>
    2-2. false라면, 문자를 그대로 answer에 더한다. => (앞뒤로 공백이 없는 문자의 경우)<br>
3. 현재 문자가 공백이라면 flag는 false, 아니라면 true를 넣는다.<br>
<br>

깔끔하다 .. bb
<br>

---
### 🙄 Part 3. 생각
뭔가 레벨 1이 쉬워서, 어느정도 문자에 대한 메소드를 익혔다고 생각하고,<br>
레벨 2를 풀어보았는데, 아직 부족함을 느꼈다.<br>
생각을 해볼 때, 절차대로 풀이가 가능해보였는데 결론적으로 안되었다.<br>
문제를 해결하고자 할 때, 좀 차근히 생각해서 최대한 구현에 초점을 두어보면 좋을 것 같다.<br>
<br>
그래도 toUpperCase()나 toLowerCase()가 <br>
모든 문자열을 소문자 혹은 대문자로 바꾼다는 사실은 몰랐는데<br>
이번 사실에 알게 되었다. (모든 문자열이 아닌 몇 개만 바꾸는 줄 알았다.)