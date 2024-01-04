# 2023.12.31
프로그래머스 > 코딩테스트 연습 > 2021 카카오 채용연계형 인턴십 > [숫자 문자열과 영단어](https://school.programmers.co.kr/learn/courses/30/lessons/81301/solution_groups?language=java)

---
### 📌 Part 1. 문제 해결 절차
_※ HashMap을 사용한_<br>
```
1. HashMap을 이용해서 Key에 영단어를 넣어주고, Value에 숫자를 넣어준다.
2. HashMap을 반복문을 이용해서 돈다.
    2-1. HashMap의 Key(=영단어)가 매개변수로 받아오는 문자열 s에 부분적으로 속해있는 지 확인한다.
        2-1-1. 속해있다면, s를 alpabet.get(key)해라.
               (=> alpabet.get(key)은 HashMap에서 Key에 대응하는 Value 값이다.)
3. 대응하는 Value 값으로 교체해준 s 문자열을 Integer 타입으로 형변환해주어 answer에 넣어 반환한다.
```
오늘 문제는 HashMap을 잘 이용해서 풀었다.<br>
아쉬운 점은 영단어와 숫자를 일일이 하나씩 넣는 법 말고,<br>
간단하게 구현할 수 있는 방법이 있지 않았을까? 하는 생각이다.<br>
<br>

---
### 📌 Part 2. 다른 사람의 풀이
_※ 다른 사람의 풀이를 보고, 해석하는 시간을 가진다._<br>
```
class Solution {
    public int solution(String s) {
        String[] strArr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for(int i = 0; i < strArr.length; i++) {
            s = s.replaceAll(strArr[i], Integer.toString(i));
        }
        return Integer.parseInt(s);
    }
}
```
배열을 저렇게 이용할 생각은 못했는데, 인덱스를 활용하면 됐구나 싶다.<br>
<br>
### replace 와 replaceAll 차이?
```
String str2 = "abcdefghijk";

System.out.println(str2.replaceAll("[abchij]", "z")); //zzzdefgzzzk
System.out.println(str2.replace("a", "z").replace("b", "z").replace("c", "z").replace("h", "z").replace("i", "z").replace("j", "z")); //zzzdefgzzzk
```

---
### 🙄 Part 3. 생각
오늘 문제는 어렵지 않게 풀 수 있었다.<br>
근래 계속해서 문제 통과를 못해서 속상했는데, <br>
마지막 날에 통과할 수 있어서 좋은 23년으로 마무리 할 수 있을 것 같다.<br>
약간 HashMap 이나 HashSet? List에 대해서 익숙해지고 있는 것 같다.<br>
또한 문자열에 자주 쓰이는 메소드들도 익숙해진다.<br>
<br>
여전히 갈 길은 멀지만, 처음과 비교해보면 점점 성장하고 있다.<br>
무조건적으로 해야하는 일이라고 생각하지 말고, 즐기면서 임해보자 :)
<br>