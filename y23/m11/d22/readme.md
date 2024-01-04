# 2023.11.22

프로그래머스 > 2017 팁스타운 > [짝지어 제거하기](https://school.programmers.co.kr/learn/courses/30/lessons/12973)

### 스택이란?
후입선출 구조로, 가장 나중에 들어온 데이터가 가장 먼저 빠져나가는 구조로 되어있다.
프로그래밍에서 데이터가 입력된 순서대로 처리되는 것이 아닌, 가장 나중에 들어온 데이터를 먼저 처리할 때 사용한다.

### 스택의 선언

```
import java.util.Stack; // 불러오기

Stack<Integer> stackInt = new Stack<>(); // 선언
Stack<String> stackStr = new Stack<>();
Stack<Boolean> stackBool = new Stack<>();
```

### 스택의 값 추가 및 제거
스택은 add() 메서드 또는 push() 메서드를 통해 값을 하나 씩 추가할 수 있다.
추가된 값을 빼내기 위해서는 pop() 메서드를 사용하여 하나 씩 뺄 수 있다.
스택의 모든 내용을 제거하기 위해서는 clear() 메서드를 사용하여 제거할 수 있다.
pop() 메서드를 사용하면, 스택의 값이 제거됨과 동시에 해당 값을 반환한다.
하지만 clear() 메서드는 반환 값이 없다.

### peek()
스택의 마지막 요소를 반환하며, 스택에는 변화를 주지 않는다.
즉, 스택에 가장 먼저 사용될 요소를 반환한다.
만약 스택이 비어있을 경우 peek() 메서드 호출 시 NoSuchElementException 예외가 발생한다.

```
import java.util.Stack;

Stack<Integer> stackInt = new Stack<>();

stackInt.push(1);
stackInt.push(2);
stackInt.push(3);

System.out.println(stackInt.peek());

// 출력
// 3
```

### 정답 풀이
```
import java.util.Stack;

class Solution{
    public int solution(String s){
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0; i < s.length(); i++){
            if(!stack.isEmpty() && stack.peek() == s.charAt(i)) stack.pop();
            else stack.push(s.charAt(i));
        }
        return stack.isEmpty() ? 1 : 0;
    }
}
```
<br>

### 생각
한 시간 내로 풀지 못했다.<br>
나름 문제 자체를 이해하기는 쉬웠으나,
버블 정렬? 이중 반복문? 하면서 엉뚱한 내용에 대해서 생각을 하고 있었다.<br>
일단 stack을 java로 사용해 본 적이 없었기에 정말 아예 생각도 못해본 풀이 개념이었다.<br>
이번 계기로 stack을 써보았으니 다음번에 비슷한 문제가 나오면 사용해봐야겠다.<br>
push, pop, peek .. 대체로 아는 개념이여서 풀이를 보고서는 금방 이해했다.
