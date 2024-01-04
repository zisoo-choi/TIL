# 2023.04.11

프로그래머스 > 해시 > [폰켓몬](https://school.programmers.co.kr/learn/courses/30/lessons/1845)

###  HashSet 이란?
Set 인터페이스에서 지원하는 구현 클래스이다.<br>
순서대로 입력되지 않고, 일정하게 유지되지 않는 게 특징이다.<br>
HashSet 은 null 요소도 허용하며, 이 클래스의 가장 큰 특징은 중복을 허용하지 않는다는 것이다.<br>

### 중복을 걸러내는 과정
HashSet은 객체를 저장하기 전에 먼저 객체의 hashCode() 메소드를 호출해서 코드를 얻어낸 다음 저장되어 있는 객체들의 해시 코드와 비교한 뒤,
같은 해시코드가 있다면 다시 equals() 메소드로 두 객체를 비교해서 true가 나오면 동일한 객체로 판단하고 중복 저장을 하지 않는다.

문자열을 HashSet에 저장할 경우, 같은 문자열을 갖는 String 객체는 동일한 객체로 간주되고 다른 문자열을 갖는 String 객체는 다른 객체로 간주되는데
그 이유는 String 클래스가 hashCode()와 equals() 메소드를 재정의해서 같은 문자열일 경우 hashCode()의 리턴 값을 같게,
equals()의 리턴 값은 true가 나오도록 했기 때문이다.

### HashSet 변수 선언
HashSet의 변수를 선언하는 방법으로<br>
HashSet<데이터타입> 변수명 = new HashSet<데이터타입>(); 으로 선언해준다.<br>
(예) HashSet<Integer> : Integer형의 HashMap 데이터가 들어간다.

더 자세한 설명은 이 블로그 참고 → [HashSet사용법](https://crazykim2.tistory.com/474)

