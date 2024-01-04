# 2023.12.06
프로그래머스 > 코딩테스트 연습 > 해시 > [전화번호 목옥](https://school.programmers.co.kr/learn/courses/30/lessons/42577)

### substring()
java.lang.String 클래스의 substring() 메소드는 문자열의 특정 부분을 잘라내는 데 사용한다.<br>

substring() 메소드는 다음과 같이 2가지 형태로 사용할 수 있다.<br>
- public String substring(int startIndex)
- public String substring(int startIndex, int endIndex)
<br>

startIndex 부터 끝까지의 문자열을 리턴한다.<br>
startIndex 로 음수 값이나, 범위를 벗어나는 값을 입력하면 StringIndexOutOfBoundsException 이 발생한다.<br>
<br>
substring() 메소드에 파라미터를 1개만 전달하면 문자열의 startIndex 부터 끝까지의 문자열을 잘라서 리턴한다.<br>
startIndex(포함)부터 endIndex(불포함)까지의 문자열을 리턴한다.<br>

### 생각
풀 수 있을 줄 알았는데 substring()을 몰랐다 ..<br>
문자열에 있는 문자 하나씩 빼서 해시에 넣어둔 배열의 문자열과 같은게 있다면 false를 리턴.<br>
하면된다고 생각하고 푸는데 어떤 메소드를 써야 되는지 영 모르겠어서 버벅이다가<br>
40분 정도 지나고 답지를 보고 풀었다.<br>
이후 substring()의 마지막 숫자 불포함에 대해서 헷갈려하다가 이해하곤 올린다.<br>

<img width="70%" src="https://github.com/zisoo-choi/TIL/assets/87762728/5521ff2a-870b-4bec-8383-e34c78377e91"/>
