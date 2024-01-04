# 2023.11.23

프로그래머스 > 스택/큐 > [같은 숫자는 싫어](https://school.programmers.co.kr/learn/courses/30/lessons/12906?language=java)

### Wrapper 클래스
기본형 값을 감싸는 클래스로 8개의 기본형을
객체로 다뤄야할 때 사용하는 클래스이다.<br>
👉 Boolean, Character, Byte, Short, Integer, Long, Float, Double
<br><br>
equals, compareTo, toString 등의 상수 값을 가지고 있다.<br>
<br>
Integer -> int 로 변환하려면 : intValue()<br>
Long -> long 로 변환하려면 : longValue()<br>

```
AraayList<Integer> list = new Arraylist<Integer>();
list.add(new Integer(100));

int i = list.get(0).intValue();
```

- 문자열 -> 기본형 : parseInt, valueOf("")
- 문자열 -> 래퍼 클래스 : valueOf(""), new Integer(""), new Byte("")
- 래퍼 클래스 -> 문자열 : toString()
<br>

### 오토박싱 & 언박싱
프로그래머가 사용하기 쉽게 자동으로 컴파일러가 코드를 추가해주는 것<br>

- int -> Integer : 자동으로 바꿔주는 것은 오토박싱
- Integer -> int : 자동으로 바꿔주는 것을 언박싱
<br>

### 생각
어제 stack 사용법을 처음 알고, 오늘은 배운 내용을 직접 사용해보고 싶어서 비슷한 문제를 골랐다.
그래서 그런지 오늘은 널널하게 풀 수 있었다. 거의 30분? 정도 걸렸던 것 같다.
근데 레퍼런스 타입에서 원시 타입으로 바꾸는 법을 몰라서 그 부분만 검색을 좀 했다.
