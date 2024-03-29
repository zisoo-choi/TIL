# 2023.12.11

프로그래머스 > 코딩테스트 연습 > 탐욕법(Greedy) > [큰 수 만들기](https://school.programmers.co.kr/learn/courses/30/lessons/42883)

### 생각
먼저 풀지 못해서 챗 지피티에게 물어보고 풀었다.<br>

stack을 이용해서 풀었고, <br>
String의 값들을 하나씩 char 형태로 빼서 stack에 넣고,<br>
넣은 값과 현재 내 값을 비교해서 현재 나의 값이 더 크면 <br>
stack.pop()을 하고, 현재 더 큰 값을 stack.push()를 해준다.<br>
그렇게 돌아가다보니 [3, 2, 3, 4]가 되었다.<br>

아래 내용 부분에서 막혔었다.<br>
for-each 반복문에 대해서 헷갈려하는 걸 느꼈다.<br>

- 현재 스택의 내용: [3]
- 현재 스택의 내용: [3, 1]
- 현재 스택의 내용: [3, 2]
- 현재 스택의 내용: [3, 2, 3]
- 현재 스택의 내용: [3, 2, 3, 4]
- 결과: 3234
<br>

이와 같이 스택에 들어가 있는 값을 꺼내오려면<br>
4323 순서로 빼오는 걸로 알고 있는데<br><br>
for 반복문을 통해서 0부터 가져왔다고 생각하면<br>
3234 형태로 뺄 수 있는 것을 너무 오랜 시간동안 붙잡고 있었다.<br>

그리고 문제 해결 절차를 학습하고 싶었는데<br>
문제를 만나면 해결 절차가 떠오르지 않고,<br>
그림으로 풀어보려고 해도 계속해서 안된다.<br>
좀더 난이도를 낮춰서 해결 절차를 성립해 나갈 수 있게 문제를 풀어봐야겠다.<br>