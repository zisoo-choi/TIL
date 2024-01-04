# 2023.12.29
프로그래머스 > 코딩테스트 연습 > 완전탐색 > [최소직사각형](https://school.programmers.co.kr/learn/courses/30/lessons/86491)

---
### 📌 Part 1. 문제 해결 절차
_※ 무엇을 표현하고 싶은가? (실패)_<br>
```
class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int tmp = 0;
        int tmp2 = 0;

        // 1. 가장 큰 가로, 세로 찾기
        for(int i = 0; i < sizes.length; i++){
            if(sizes[i][0] > tmp){
                tmp = sizes[i][0];
            }
            if(sizes[i][1] > tmp2){
                tmp2 = sizes[i][1];
            }
        }

        // 2. tmp2(=max 세로 수)와 같은 요소의 가로세로 뒤집기
        for(int i = 0; i < sizes.length; i++){
            if(tmp2 == sizes[i][1]){
                sizes[i][1] = sizes[i][0];
                sizes[i][0] = tmp2;
                break;
            }
        }

        // 3. 뒤집고 난 이후, 다시 세로의 큰 값 찾아서 tmp2 널기
        tmp2 = 0; // 초기화
        for(int i = 0; i < sizes.length; i++){
            if(sizes[i][1] > tmp2){
                tmp2 = sizes[i][1];
            }
        }
        answer = tmp * tmp2;
        return answer;
    }
}
```
내가 풀려고 했던 절차는 다음과 같다.<br>
1. 가로의 가장 큰 수를 찾아서 tmp에 저장한다.
2. 세로의 가장 큰 수를 찾아서 tmp2에 저장한다.<br>
    2-1. tmp2의 값을 가진 배열의 요소를 뒤집는다.<br>
        2-1-1. 뒤집었을 때, 가로 수가 tmp보다 크다면 해당 수를 tmp에 넣는다.<br>
        2-1-2. 뒤집었을 때, 가로 수가 tmp보다 작다면 세로 수가 제일 큰 수인지 확인 후 맞다면 tmp2에 넣는다.
<br>

위와 같은 방법으로 하면 테스트 케이스1만 통과할 뿐, 다른 테스트는 통과하지 못한다.<br>
결국은 챗지피티를 이용해서 답을 봤다.
<br>

---
### 📌 Part 2. 다른 사람의 풀이
_※ 다른 사람의 풀이를 보고, 해석하는 시간을 가진다._<br>
```
class Solution {
    public int solution(int[][] sizes) {
        int length = 0, height = 0;
        for (int[] card : sizes) {
            length = Math.max(length, Math.max(card[0], card[1]));
            height = Math.max(height, Math.min(card[0], card[1]));
        }
        int answer = length * height;
        return answer;
    }
}
```

1. 매개변수로 받아오는 배열의 요소 하나씩 뺀다.
2. 가로, 세로를 가진 요소의 max 값과 min 값을 구한다.
3. 각각 구한 값의 max 값을 구한 후, 곱한다.
<br>

이렇게 푸는 거구나, 깔끔하고 바로 알아보기도 쉬운 코드이다.
<br>

---
### 🙄 Part 3. 생각
문제 풀이가 잘 안된다.<br>
문제를 보고, 나름의 방법을 구하려고 하는데 계속 오답만 나온다.<br>
계속 연습하면 나아지겠지 싶다.
<br>