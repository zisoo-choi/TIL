# 2022.12.23
프로그래머스 > 코딩테스트 연습 > 연습문제 > [직사각형 별찍기](https://school.programmers.co.kr/learn/courses/30/lessons/12969)<br>
프로그래머스 > 코딩테스트 연습 > 연습문제 > [최대공약수와 최대공배수](https://school.programmers.co.kr/learn/courses/30/lessons/12940)

---
### 📌 Part 1. 문제 해결 절차
_※ 최대공약수와 최대공배수_<br>
```
1. n과 m에 해당하는 공배수를 구하여 set에 넣는다. (중복을 피하기 위해 HashSet사용)
2. set에 들어간 숫자 중에서 가장 큰 수를 구한다. (=> 최대공약수)
3. 최대공약수로 n과 m을 나누고, 최대공약수 * n의 나눈 값 * m의 나눈 값으로 최대공배수를 구한다.
4. answer[0]에 최대공약수를 넣고, answer[1]에 최대공배수를 넣는다.
```

문제를 풀면서 최대공약수와 최대공배수가 기억이 안나서 시간이 걸렸다.<br>
찾아보면서 초등학생이 배우는 내용이라 약간 당황했지만<br>
코드로 어떻게 풀어야 할지, 그림으로 그리면서 이해를 해봤다.<br>
시간이 좀 걸린 이유는 부끄럽게도 단순히 저 수학적 원리에 대해서 이해를 못했을 뿐이다.<br>
그래서 이번 코드에는 log를 찍어서 계속해서 값을 확인하면서 구현했다.<br>
<br>

---
### 📌 Part 2. 다른 사람의 풀이
_※ 다른 사람의 풀이를 보고, 해석하는 시간을 가진다._<br>
```
class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        for (int i = 1; i < n + m; i++) {
            if (n % i == 0 && m % i == 0) {
                answer[0] = i;
                answer[1] = n * m / answer[0];
            }
        }
        return answer;
    }
}
```
1. n+m까지 반복문을 돌린다.
2. n과 m을 나누는 i가 있다면<br>
    2-1. answer[0]에 i를 넣어라. (=> 최대 공약수)<br>
    2-2. answer[1]에는 n * m / answer[0]를 넣어라. (=> 최대 공배수)
3. n+m까지 반복문을 돌리면서 n과 m 모두를 나눌 수 있는 i로 n*m을 나눌 것이다.
<br>

나는 문제를 풀면서 비효율적이게 의미없는 반복문이 돌고 있다.<br>
그것을 야매로나마 해결하고자 HashSet 을 사용했는데<br>
다른 사람의 풀이는 쓸데없는 코드없이 짧고 간결하게 잘 표현한 것 같다.<br>
그리고 n+m을 보면서 내가 수학적 원리 이해를 완벽하게 했던 건 아니구나 싶었다.<br>
<br>

---
### 🙄 Part 3. 생각
오늘은 빨리 답을 보지 않고, 약간 고집을 부렸다.<br>
그래서 약간 늦었지만, 그래도 수학적 원리를 이해를 못한거지,<br>
내가 코드 구현을 아예 못하는 건 아니라서 약간 고집을 부렸다.<br>
일단 답을 다 풀고나서 내가 이해한 게 맞았나 싶었는데<br>
다른 사람의 풀이를 보고, 저렇게 구해서 답을 얻어야 하는 거구나 하고<br>
최대공약수와 최대공배수에 대해서 이해를 한 것 같다.<br>
그래도 역시 내가 그린 그림이 더 이해가 잘 간다.<br>

<img width="70%" src="https://github.com/zisoo-choi/zisoo-choi/assets/87762728/cf887bf9-5849-44c3-94f3-827b23195a53"/>