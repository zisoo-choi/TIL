# 2023.04.12

프로그래머스 > 해시 > [완주하지 못한 선수](https://school.programmers.co.kr/learn/courses/30/lessons/42576)

## 배열을 정렬하는 방법
### Arrays.sort( )
자바에서 배열이나 리스트를 정렬하려고 한다면 java.util.Arrays 클래스의 sort() 메서드를 사용하면 정렬 로직을 따로 만들지 않아도
한 번의 메소드 호출로 간편하게 배열이나 리스트를 정렬할 수 있다.<br>
1차원 배열은 sort 에 해당 배열을 인자로 넣어 기본적으로 오름차순 정렬을 할 수 있고,
내림차순 정렬을 하기 위해서는 두 번째 인자로 Collections.reverseOrder()를 사용한다.<br>
<br>
sort 는 배열의 모든 Object 타입을 정렬할 수 있다.<br>
Collections 는 기본적으로 Object 를 상속한 클래스에 대해서 사용이 가능한 인터페이스이므로
String, Integer, Double 등과 같은 Object 타입의 배열은 sort에
Collections.reverseOrder() 로 사용이 가능하고 기본 타입인 int, double, char, float 등은 사용이 불가능하므로
기본타입의 배열을 가지고 Object 를 상속하는 Wrapper 클래스로 박싱해주어야 역순 정렬이 가능하다.<br>
<br>
즉, Arrays 클래스는 배열의 복사, 항목 정렬, 검색과 같은 배열을 조작하는 기능을 가지고 있다.<br>



