# 2023.12.27
프로그래머스 > 코딩테스트 연습 > 연습문제 > [크기가 작은 부분 문자열](https://school.programmers.co.kr/learn/courses/30/lessons/147355)

---
### 📌 Part 1. 문제 해결 절차
_※ p의 길이가 18보다 작거나 같다._<br>
```
1. 매개변수로 받아오는 문자열 t의 길이만큼 반복문을 돌린다.
    1-1. i + p의 길이를 더한 수가 t의 길이보다 작거나 같다면
         리스트 s에 문자열 t의 i에서 i+p의 길이까지의 문자열을 넣는다.
    1-2. 아니라면 break로 반복문을 나간다.
2. p 문자열을 Long 타입으로 변환한다.
3. 리스트 s의 요소를 꺼내는 반복문을 돌린다.
    3-1. s의 요소를 꺼내서 Long 타입으로 변환한다.
    3-2. 만약 s의 요소보다 p의 값이 크거나 같다면 answer++을 해준다.
```

문제를 풀면서 크게 어렵지 않았으나, 맨 처음에 오해했던 것은 있었다.<br>
p의 문자열 길이만큼 t의 문자를 자르는 건 줄은 모르고<br>
그냥 세 자리 형태로 비교하는 줄 알았다.<br>
다른 테스트 케이스에 실패하는 것을 보고, 문제를 다시 유심히 읽었다.<br>
이후 깨닫고 바로 수정해서 위와 같은 방식으로 문제를 풀었다.<br>
그 다음으로 문제는 p의 문자열 크기가 int를 벗어난다는 사실에 대해서<br>
long을 어디어디에 처리해주어야 하는 지 몰랐던 문제였다.<br>
그래서 아래 반복문을 통해 각 요소를 비교하는 부분에 해주었고,<br>
이를 변경하므로 통과되었다.<br>
<br>

---
### 📌 Part 2. 다른 사람의 풀이
_※ 다른 사람의 풀이를 보고, 해석하는 시간을 가진다._<br>
```
import java.util.stream.LongStream;

class Solution {
    public int solution(String t, String p) {
        // 1. p가 int 크기를 벗어나기 때문에 long 타입으로 변환해주기
        long targetNumber = Long.parseLong(p);
        
        int targetNumberLength = p.length();
        
        // 2.
        // LongStream은 기본형(long) 값들의 스트림을 생성하는 클래스
        // range 메서드는 시작값(0L)부터 종료값(t.length() - targetNumberLength + 1L)까지의 값을 가지는 스트림을 생성
        return (int) LongStream.range(0L, t.length() - targetNumberLength + 1L)
                // 2-1.
                // mapToObj 메서드는 각 요소에 함수를 적용하여 새로운 객체로 매핑하는 역할
                // => 여기서는 부분 문자열을 추출하는 데 사용
                // 각 숫자를 이용하여 t에서 부분 문자열을 추출
                .mapToObj(i -> t.substring((int) i, (int) i + targetNumberLength))
                
                // 2-2. 각 부분 문자열을 long으로 변환
                .mapToLong(Long::parseLong)
                
                // 2-3. targetNumber보다 작거나 같은 부분 문자열만을 필터링
                // filter 메서드는 주어진 조건을 만족하는 요소만을 선택하여 새로운 스트림을 생성
                .filter(number -> number <= targetNumber)
                
                // 2-4. 최종적으로 필터링된 부분 문자열의 개수를 반환
                .count();
    }
}
```

Q. 반복문이 없는데 어떻게 된건지?<br>
A. 스트림은 내부적으로 반복문을 사용하기에 개발자가 직접 반복문을 작성하지 않아도 된다.
스트림 API는 함수형 프로그래밍의 개념을 기반으로 하며, 데이터를 다루는데 필요한 다양한
연산을 제공한다. 스트림의 내부에서는 반복문이 숨어 있지만,
개발자는 반복문을 명시적으로 작성하지 않아도 됩니다.
대신에, map, filter, count와 같은 메서드를 이용하여
데이터를 처리하는 방식으로 코드를 작성할 수 있습니다.<br>
<br>
Q. 그러면 i나 number를 선언하지도 않았고, 값을 주지도 않았는데 어떻게 사용하는거야?<br>
A. 스트림 API에서 사용되는 변수들인 i와
number는 람다 표현식을 이용한 함수 내에서 파라미터로 사용됩니다.
각 메서드 호출에 사용되는 람다 표현식에서 파라미터를 정의하고,
해당 파라미터는 내부적으로 자동으로 생성됩니다.<br>
<br>
Q. 파라미터로 사용한다는 말이 약간 이해가 안가는데, 스트림API의 내부 로직의 파라미터로 전달된다는거야?<br>
A. 아닙니다.
람다 표현식에서 사용되는 변수들은 외부의 환경에서 가져와 사용됩니다.
이러한 변수들을 람다 표현식 내부에서 사용하는 것을
"캡처(capture)"라고 합니다.<br>
스트림 API에서 사용되는 람다 표현식에서 변수 i와 number는
각 메서드에서 정의된 람다 표현식에서 외부의 변수를 참조합니다.<br>
<br>
### 🚀내부로직 설명
이러한 변수들이 어디에서 왔는지에 대한 구체적인 내부 로직을 설명하겠습니다.<br>
```
LongStream.range(0L, t.length() - targetNumberLength + 1L)
```
이 부분에서 i는 LongStream.range 메서드에서 정의되는 파라미터입니다.<br>
LongStream.range은
시작값(0L)부터 종료값(t.length() - targetNumberLength + 1L)
까지의 값을 생성하는 메서드입니다. i는 여기서 생성된 값입니다.<br>
<br>
```
.mapToObj(i -> t.substring((int) i, (int) i + targetNumberLength))
```
mapToObj 메서드에서의 i는 LongStream.range에서 생성된 값을 받아서
부분 문자열을 추출하는 데 사용됩니다.
이때 i는 외부에서 전달된 값으로 캡처되어 사용됩니다.<br>
<br>
```
.mapToLong(Long::parseLong)
```
mapToLong 메서드에서의 number는 앞서 mapToObj에서 생성된 문자열을
long으로 변환하는 데 사용됩니다.
number도 외부에서 전달된 값으로 캡처되어 사용됩니다.<br>
<br>
```
.filter(number -> number <= targetNumber)
```
filter 메서드에서의 number는 앞서 mapToLong에서 생성된 long 값을
필터링하는 데 사용됩니다.
역시 외부에서 전달된 값으로 캡처되어 사용됩니다.<br>
<br>


---
### 🙄 Part 3. 생각
스트림 너무 어려워서 정말 이해가 안간다.<br>
자바 이론 공부 얼른 속도내서 스트림도 좀 이해를 해봐야겠다.<br>
어려워 ..