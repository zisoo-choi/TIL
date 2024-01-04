# 2023.12.28
프로그래머스 > 코딩테스트 연습 > 연습문제 > [삼총사](https://school.programmers.co.kr/learn/courses/30/lessons/131705)

---
### 📌 Part 1. 문제 해결 절차
_※ 원형 큐를 사용한다?(실패)_<br>
<img width="70%" src="https://github.com/zisoo-choi/TIL/assets/87762728/6f1e886d-a729-49df-ab0c-4eda1b6d2ea1"/>
<br>
위의 그림을 보면 문제 해결 절차 조차도 구성하지 못했다.<br>
생각하기론 각 배열의 숫자 위치 전까지 인덱스 i와 i-1까지 반복해서<br>
모든 수를 조합하는 것으로 알고 있었다.<br><br>
그러나 실제 손으로 돌려보니 -2, 0, 2 값이 나오지 않아서<br>
모든 수를 조합하고 있는 것은 아니었다.
<br>

---
### 📌 Part 2. 다른 사람의 풀이
_※ 다른 사람의 풀이를 보고, 해석하는 시간을 가진다._<br>
```
class Solution {
    public int solution(int[] number) {
        int answer = 0;
        
        for(int i = 0; i < number.length; i++) {
            for(int j = i + 1; j < number.length; j++) {
                for(int k = j + 1; k < number.length; k++) {
                    if(number[i] + number[j] + number[k] == 0) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}
```

딱히 절차라고 할 게 없다.<br>
<img width="70%" src="https://github.com/zisoo-choi/TIL/assets/87762728/1e9b9673-6cc6-473d-921a-3b0acf9a8249"/><br>
이런 방식으로 푸는구나를 알았으면 된다고 생각한다.<br>
<br>

---
### 🙄 Part 3. 생각
3개의 조합은 어렵다 .. 모든 조합의 경우를 만들었나 싶었는데<br>
모르겠고, 거의 40분이 되었길래 바로 답을 찾아 보았다.<br>
3개의 반복문이 사용하는 것은 전혀 생각하지 못했다.<br>
요즘 레벌1도 통 못풀고 있는 것 같아서 속상..<br>
알고리즘 문제푸는 게 재밌기도 하고 잘 몰랐던 메소드를 배우고 하는데<br>
막상 문제 해결 절차 연습이 잘 안되고 있는 것 같다.<br>
그래도 풀이를 보면서 이렇게 푸는 거구나 하고 알아간다.<br>