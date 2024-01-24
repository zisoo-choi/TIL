
# 2024.01.24

프로그래머스 > 코딩테스트 연습 > 스택/큐 > [기능개발](https://school.programmers.co.kr/learn/courses/30/lessons/42586)

---
### 📌 Part 1. 문제 해결 절차
_※ Stack ? Queue ? 무얼 사용했어야 했을까?_<br>
```
1. 매개변수로 받아오는 progresses 배열 요소가 100이 되기 위해 얼마나 가야하는 지 스텝 수를 구한다.
    1-1. 100보다 작다면 sppeds의 요소를 progresses에 더하고, 더한 횟수를 세준다.
    1-2. 더한 횟수를 progresese 배열에 덮어 씌운다.
2. 새롭게 만들어진 progresses 배열의 요소가
    2-1. max보다 크다면 progresses 요소를 max에 넣고, j인덱스 증가 후 count(= answerList)를 세준다.
    2-2. max보다 작다면 현재 j인덱스의 count(= answerList)를 더해준다.
3. answerList는 ArrayList로 만든 객체이기 때문에 answer 배열에 해당 크기 만큼 넣어준 후 반환한다.
```
리스트의 인덱스를 사용하는 법에서 헤멘 것 말고는 절차대로 잘 풀었다.<br>
중간중간 꼬이는 부분도 있었지만, 그림으로 풀 때는 잘 풀려서 절차는 잘 확립할 수 있었다.<br>
set을 잊지말자 !<br>
<br>

---
### 📌 Part 2. 다른 사람의 풀이
_※ 다른 사람의 풀이를 보고, 해석하는 시간을 가진다._<br>
```
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        // 작업이 완료되는데 걸리는 날짜를 저장할 배열
        int[] dayOfend = new int[100];
        
        // 작업이 완료되는데 걸리는 날짜를 계산하고 배열에 저장
        int day = -1;
        for(int i=0; i<progresses.length; i++) {
            while(progresses[i] + (day*speeds[i]) < 100) {
                day++;
            }
            dayOfend[day]++;
        }
        
        // 배열에서 0이 아닌 요소들만 추출하여 반환
        return Arrays.stream(dayOfend).filter(i -> i!=0).toArray();
    }
}
```
해석하긴 했는데, 어떤 방식인지 뭔가 잘 모르곘다.<br>
조건에도 100개를 명시했으니까 맞는 것 같은데, 이런 로직을 구성하는 법은 아직 못하겠다.<br>
<br>

---
### 🙄 Part 3. 생각
열심히 디버깅하면서 어떻게 들어갔는지 확인하면서 하고 있다.<br>
아직은 불편하다고 느끼지만, 점점 익숙해질 것이다.<br>
해당 문제가 스택/큐 부분에 있어서<br>
두 자료구조 중 어떤 걸 사용해야 하는지 생각해봤는데도,<br>
자료구조 이용해서 푸는게 아닌 것처럼 느껴져서 그냥 풀 수 있는 대로 풀었다.<br>
이제 스택은 좀 쓸 수 있으니까,<br>
큐 자료구조에 대해서 실습해보려고 했으나 일단 오늘은 그냥 구현했다 :)<br>
<br>