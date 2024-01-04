# 2023.12.08
프로그래머스 > 코딩테스트 연습 > 해시 > [의상](https://school.programmers.co.kr/learn/courses/30/lessons/42578)

### 절차
<img width="70%" src="https://github.com/zisoo-choi/TIL/assets/87762728/8ad4a6d3-5ffd-4761-b6f2-5f217a9ca66a"/>
<br>
HashMap을 이용하여 { 의상의 타입 : 의상의 이름 } 형태를 만들어준다.<br>

#### 1. HashMap에 의상의 타입이 존재한다면<br>
map.get(type) 형태로 타입을 가져와서 set이 참조하게 한다.<br>
```HashSet<String> set = map.get(type);```<br>
```set.add(name);```
을 통해 set에 의상 이름을 넣어준다.<br><br>
map { key(=> 의상타입으로 "머리") : value(=> set을 참조하고 있다.)}<br>
set { "노란모자", "초록모자" }<br>
이런 형태가 된다.<br><br>

#### 2. 존재하지 않는다면<br>
HashSet을 생성한 다음, set에 의상이름을 넣어주고 map에 type과 set을 put한다.<br>
<br>

#### 3. 1과 2의 과정을 다 거치고 나면<br>
map의 값으로 존재하는 set의 의상이름을 하나씩 빼서 조합할 수 있는 경우의 수를 구한다.<br>
```count *= (set.size()+1);```
- count : 경우의 수<br>
- set.size() : 각 타입에 따른 의상이름의 크기<br>
- +1 : 모두 안 입는 경우 (return 전에 -1로 빼줄거임, 곱해야해서 넣어줌)<br><br>

### 생각
어제 본 코드를 해석 후 이해하고, 그런 다음 혼자 이해한 바탕을 가지고 구현해보았다.<br>
```HashSet<String> set = map.get(type);```<br>
해당 부분이 값 할당인지 뭔지 몰라서 알아보니, 참조하고 있는 모습이었다.<br>
이후 어려운 부분은 없었으나 3번의 과정의 식이 바로 생각나지 않아서 조금 시간이 걸렸다.<br>
그리고 이해를 했으나 글로 표현하는 것이 어색하게 느껴졌다.<br>
계속 연습을 해 봐야겠다.
