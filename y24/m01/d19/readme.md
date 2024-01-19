
# 2024.01.19

프로그래머스 > 코딩테스트 연습 > 연습문제 > [카드 뭉치](https://school.programmers.co.kr/learn/courses/30/lessons/159994)

---
### 📌 Part 1. 문제 해결 절차
_※ Stack 사용하여 문제 풀기_<br>
```
1. cards1, cards2의 요소를 각각 Stack에 거꾸로 넣어준다.
2. goal 배열의 수 만큼 돌리면서 goal의 요소 문자열을 하나씩 비교한다.
    2-1. 만약 stack1이 비어있지 않고, stack1.peek()가 goal의 값과 같다면 stack1을 pop() 해줘라
    2-2. 만약 stack2이 비어있지 않고, stack2.peek()가 goal의 값과 같다면 stack2을 pop() 해줘라
    2-3. 위의 두 조건 다 아니라면, (=연속되는 문자열이 각 Stack에 존재하지 않는다) answer에 No를 넣고 반환해라
```
문제를 풀면서 어려운 것은 없었으나, == 과 equals()를 오랜만에 헷갈렸던 점 말고는 대체적으로 무난했다.<br>
문자열 비교는 == 가 아니다. 제발 기억 좀 하자!!<br>
<br>

---
### 📌 Part 2. 다른 사람의 풀이
_※ 다른 사람의 풀이를 보고, 해석하는 시간을 가진다._<br>
```
import java.io.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int cardIdx1 = 0;
        int cardIdx2 = 0;

        for(int i=0; i<goal.length; i++){
            String target = goal[i];

            // cardIdx1보다 cards1의 길이가 더 길고, goal의 문자열이 cards1의 값과 같다면
            if(cardIdx1 < cards1.length && target.equals(cards1[cardIdx1]))
                cardIdx1 ++;
            // cardIdx2보다 cards2의 길이가 더 길고, goal의 문자열이 cards2의 값과 같다면
            else if (cardIdx2 < cards2.length && target.equals(cards2[cardIdx2]))
                cardIdx2++;
            else
                return "No";
        }
        return "Yes";
    }
}
```
각 cards의 인덱스가 될 변수를 만들어서 문자열이 똑같다면 증가하고 아니라면 넘어가는 형태 ..<br>
내 반복문과 조건문이 여러번 나오는 코드보다 효율적인 코드로 보인다.<br>
<br>

---
### 🙄 Part 3. 생각
문제를 풀면서 디버깅을 하면서 값을 확인했다 !<br>
그동안 일이 있어서 til을 하지 못해서 당분간은 다시 레벨1을 풀어야겠다.<br>
stack말고 queue도 슬슬 익혀보고 싶다.<br>
현재 List랑 Stack, hashSet과 hashMap은 어느정도 쓰니까 <br>
이제 다른 자료구조를 써보려고 노력해야지<br>
<br>