# 2023.12.16

프로그래머스 > 코딩테스트 연습 > 연습문제 > [제일 작은 수 제거하기](https://school.programmers.co.kr/learn/courses/30/lessons/12935#)

---
### 📌 Part 1. 문제 해결 절차
_※ 이중 반복문 대신 j 변수를 이용한 방법_<br>
```
1. 매개변수 배열의 맨 처음 수를 tmp에 넣는다.
2. 만약 배열의 크기가 1이라면 -1를 반환한다.
3. 만약 배열의 크기가 1이상 이라면
    3-1. tmp의 값과 배열의 값을 비교하여 가장 작은 수를 tmp에 넣는다.
    3-2. 배열의 값에서 tmp와 같은 값이 아니라면(=가장 작은 수가 아니라면) answer 배열을 값을 넣는다.
```

하다가 테스트 코드는 맞는데, 답을 내면 실패한다고 떠서 왜일까 고민을 해보았다.<br>
그래서 테스트 코드에 {1, 2, 3, 4} 라는 배열을 하나 추가해서 다시 돌려봤다.<br>
추가한 코드만 통과가 안되었다.<br>
생각해보니 3-2 부분에서 arr 배열의 크기는 4이고, answer 배열의 공간은 3인데<br>
같은 i 번째로 반복문을 돌리면 배열 크기에 문제가 생기므로 당연히 안되는 상황이었다.<br>
그래서 j 변수를 추가해서 값이 다를 경우에만 j++을 해주어 해결했다.<br>
<br>

---
### 📌 Part 2. 다른 사람의 풀이
_※ 다른 사람의 풀이를 보고, 해석하는 시간을 가진다._<br>
```
import java.util.*;

class Solution {
  public int[] solution(int[] arr) {
      if (arr.length <= 1) return new int[]{ -1 };
      int min = Arrays.stream(arr).min().getAsInt();
      return Arrays.stream(arr).filter(i -> i != min).toArray();
  }
}
```
1. 만약 매개변수 배열의 크기가 1보다 작거나 같으면 -1을 반환한다.
2. Arrays.stream(arr)를 사용하여 배열을 스트림으로 변환하고,<br>
   min() 메서드를 사용하여 스트림의 최솟값을 찾는다.<br>
   getAsInt() 메서드를 사용하여 최솟값을 정수 형태로 가져와 변수 min에 저장한다.
3. 배열을 스트림으로 변환하고, filter 메서드를 사용하여 최솟값과 같지 않은 요소만 필터링한다.<br>
   toArray() 메서드를 사용하여 스트림을 다시 배열로 변환한 후 반환한다.
<br>

스트림을 사용해 본적도 없고, 스트림 코드를 해석해볼 생각을 못했는데<br>
이렇게 내가 먼저 코드를 작성하고 간단하게 구현한 코드를 해석해보니<br>
훨씬 더 편리하게 해주는 기능인 것을 알 수 있었다.<br>

<br>
<b>❓ Stream 이란</b><br>

```
자바에서는 파일이나 콘솔의 입출력을 직접 다루지 않고, 스트림이라는 흐름을 통해 다룬다.
스트림이란 실제의 입력이나 출력이 표현된 데이터의 이상화된 흐름을 의미한다.
즉, 스트림은 운영체제에 의해 생성되는 가상의 연결고리를 의미하며, 중간 매개자 역할을 한다.

자바에서는 많은 양의 데이터를 저장하기 위해서 배열이나 컬렉션을 이용한다.
이렇게 저장된 데이터에 접근하기 위해서는 반복문이나 반복자를 사용하여 매번 새로운 코드를 작성해야 한다.
하지만 이렇게 작성된 코드는 길이가 길고, 가독성이 떨어지며 코드의 재사용이 거의 불가능하다.
즉, 데이터베이스의 쿼리와 같이 정형화된 처리 패턴을 가지지 못했기에 데이터마다 다른 방법으로 접근해야했다.
이러한 문제점을 극복하기 위해서 JAVA SE8 부터 스트림(stream) API를 도입했다고 한다.
```
<br>

---
### 🙄 Part 3. 생각
절차를 만들어서 해결하는 방법이 여전히 미숙하다.<br>
그러나 시행착오를 거치면서 생각을 하고, 그 결과 문제를 찾아 혼자 해결할 수 있었다.<br>
역시 혼자의 힘으로 문제를 풀 때는 정말 기분이 좋다.<br>
다른 사람의 풀이를 보고 스트림에 대해서 한번 알아볼 수 있었다.<br>
짧은 시간내로 학습하기에 무리라 생각이 들어서, 왜 생겨났는지에 대해서 찾아봤다.<br>
왜 쓰는지에 대해서 공감을 했다.<br>
데이터에 접근하기 위한 새로운 코드는 가독성이 떨어지고 재사용이 안된다.<br>
더 공부할 기회가 생기면 학습 후 사용해보고 싶다.<br>