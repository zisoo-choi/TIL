# 2022.12.10
프로그래머스 > 코딩테스트 연습 > 탐욕법(Greedy) > [조이스틱](https://school.programmers.co.kr/learn/courses/30/lessons/42860?language=java)

### 생각
[참고한 블로그](https://yummy0102.tistory.com/359)<br>
너무 어렵다. 이해가 잘 안가서 내일 다시 봐야할 것 같다.
```
class Solution {
    public int solution(String name) {
        // 조이스틱 조작 횟수 누적
        int answer = 0;

        // 현재 위치에서 연속된 'A'의 끝 인덱스를 저장하는 변수
        int index;

        // 커서를 왼쪽 끝까지 이동하고 다시 오른쪽 끝까지 이동하는 경우의 최소 이동 횟수를 저장
        int move = name.length()-1;

        // name 의 각 문자에 대해 반복문 실행
        for(int i=0; i<name.length(); i++) {
            // (앞) 'A'~'N' 사이의 경우: 현재 문자에서 'A'로 이동하는 경우의 최소 횟수입니다.
            // (뒤) 'O'~'Z' 사이의 경우: 'Z'에서 현재 문자까지 오른쪽으로 이동하는 경우의 최소 횟수입니다.
            answer += Math.min(name.charAt(i) - 'A', 'Z' - name.charAt(i) + 1);

            index = i+1;
            // 현재 name의 크기는 넘어가지 않고, 다음 글자가 A 라면
            while(index < name.length() && name.charAt(index) == 'A') {
                // A를 건너 뛴다.
                index++;
            }

            // `i * 2 + name.length() - index`
            // 현재 위치에서 'A'가 끝나는 지점까지 가는데 오른쪽으로 이동하고, 다시 왼쪽으로 이동하는 경우의 횟수이다.
            move = Math.min(move, i * 2 + name.length() - index);

            // (name.length() - index) * 2 + i`
            // 'A'가 끝나는 지점에서 왼쪽으로 이동하고, 다시 오른쪽으로 이동하는 경우의 횟수입니다.
            move = Math.min(move, (name.length() - index) * 2 + i);
        }

        // 조작한 횟수(answer)와 최소 이동 횟수(move)를 합하여 결과를 반환
        return answer + move;
    }
}
```
일단 주석을 달고, 직접 그려가면서 해보고 있는데<br>
예시를 JEROEN 라고 했을 때, move = 5 가 나와야 하는 이유를 모르겠다.<br>
JAAX라고 하면 J(9), X(3) 그리고 J에서 X로 커서를 옮길 때(1) => 13 까지 알겠는데<br>
JEROEN라 하면 J(9), E(4), R(9), O(12), E(4), N(13) = > 51 이 나와야 하는데 move가 5가 되어, 56이 답이 된다.<br>
왜 move가 생기는 걸까?