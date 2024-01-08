
# 2024.01.08

프로그래머스 > 코딩테스트 연습 > 연습문제 > [푸드 파이트 대회](https://school.programmers.co.kr/learn/courses/30/lessons/134240)

---
### 📌 Part 1. 문제 해결 절차
_※ 절차대로 하나씩_<br>
```
1. 매개변수로 받아오는 food의 각 요소를 2로 나눈 값을 n에 집어넣는다.
2. n의 값 까지 i를 answer에 더한다.
3. 이후 food의 0번 째 요소가 존재한다면 (=물) answer에 더한다.
4. answer.length()-2 길이부터 하나씩 줄여나간 위치의 요소를 answer에 더하고 반환한다.
```
크게 어렵지 않게 0을 기준으로 앞의 요소들은 나누어서 떨어지는 수만큼 넣어주고<br>
다 넣고난 다음에 0번째 요소가 존재하면 0을 넣어주고<br>
마지막으로 처음에 넣은 값들을 뒤에서부터 차근히 넣어주고 리턴하였다.<br>
<br>

---
### 📌 Part 2. 다른 사람의 풀이
_※ 다른 사람의 풀이를 보고, 해석하는 시간을 가진다._<br>
```
class Solution {
    public String solution(int[] food) {
        String answer = "0";

        for (int i = food.length - 1; i > 0; i--) {
            for (int j = 0; j < food[i] / 2; j++) {
                answer = i + answer + i; 
            }
        }
        return answer;
    }
}

----------------------------
< 출력내용 >
전 i: 3
전 answer: 0
후 answer: 303

전 i: 1
전 answer: 303
후 answer: 13031

전 i: 1
전 answer: 13031
후 answer: 1130311

전 i: 1
전 answer: 1130311
후 answer: 111303111
```
위의 내용이 어떻게 전개되는 지 궁금해서 log를 찍어보았더니 바로 이해가 되었다.<br>
전혀 생각도 못해본 방식인데, 정말 간결하게 구현하는 사람들이 많은 것 같다.<br>
<br>

---
### 🙄 Part 3. 생각
슬슬 레벨1을 연달아 잘 풀기 시작했는데, 이번 주까지는 계속 풀어보고<br>
괜찮다 싶으면 레벨2로 올라가 보려고 한다.
<br>