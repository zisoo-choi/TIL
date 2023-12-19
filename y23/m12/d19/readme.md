
# 2022.12.19

프로그래머스 > 코딩테스트 연습 > 연습문제 > [문자열 내림차순으로 배치하기](https://school.programmers.co.kr/learn/courses/30/lessons/12917#)

---
### 📌 Part 1. 문제 해결 절차
_※ 무슨 생각이 이리 많았는지(실패)_<br>
```
class Solution {
    public String solution(String s) {
        String answer = "";
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            // 스택이 비어있지 않고, 맨 위의 수가 현재 수보다 크다면 추가하기
            if(!stack.isEmpty() && stack.peek() < s.charAt(i)) {
                stack.push(s.charAt(i));
            }
            // 비어 있다면 수 추가하기
            if(stack.isEmpty()){
                stack.push(s.charAt(i));
            }
        }

        while(!stack.isEmpty()){
            answer += stack.pop();
        }

        return answer;
    }
}
```

스택을 이용해서 풀면 되는 줄 알았다.<br>
그래서 실제로 구현해보려고 하니까 안되는 것이었다.<br>
테스트 코드는 통과했는데, 다른 답에서는 실패하기만 했다.<br>
그래서 스택에 한번 꼿히니까 쉬운 방법을 있을텐데 생각이 안났다.<br>
Arrays.sort()를 이용해보려고 했었으나, 매개변수가 자꾸 오류가 나서 어리벙벙했다.<br>
<br>

---
### 📌 Part 2. 다른 사람의 풀이
_※ 다른 사람의 풀이를 보고, 해석하는 시간을 가진다._<br>
```
class Solution {
    public String solution(String s) {
        String answer = "";

        String[] str = s.split("");
        Arrays.sort(str, Collections.reverseOrder());

        for(String a : str)
            answer += a;

        return answer;
    }
}
```
1. 문자열의 문자를 split를 이용해서 자른 값을 배열에 넣는다.
2. 자른 문자를 역순으로 정렬한다. (=> 내림차순)
3. 배열의 문자들을 하나씩 꺼내서 answer에 더한 후 리턴한다.
<br>

굿 .. split을 이용하면 더 간단하게 문자를 자를 수 있구나.<br>
Collections를 이용해서 정렬을 해주어야 했구나<br>
나는 str까지만 넣고, 빨간줄 뜨는 상황만 반복이었는데 ..<br>
한번 계속 실수한 내용에 대해서 사용법을 알고나면 기억에 남으니까<br>
차라리 잘됐다.<br>
<br>

---
### 🙄 Part 3. 생각
쉬운 내용이었는데, 마음이 앞선 것 같다.<br>
하지만 아마 답을 안봤다면 꽤 오랜 시간동안 삽질을 했을 것 같다.<br>
Collections를 이용한 정렬, 잊지말자.<br>