# 2022.12.14

프로그래머스 > 코딩테스트 연습 > 연습문제 > [핸드폰 숫자 가리기](https://school.programmers.co.kr/learn/courses/30/lessons/12948)

---
### 📌 Part 1. 문제 해결 절차
_※ substring을 활용해본_<br>
```
1. 받아오는 배열의 앞 문자열 (str.length()-str.length() ~ str.length()-3)을 자르면 뒤의 4자리를 제외한 문자열이 나온다.
2. 받아오는 배열의 뒤 문자열 (str.length()-4 ~ str.length())을 자르면 뒤의 4자리만 나온다.
3. 앞 문자열을 "*"로 대체한다.
4. 앞 문자열과 뒤 문자열을 더해 반환한다.
```

해당 절차애서 오랜만에 substring을 다시 활용해보았다.<br>
<br>

---
### 📌 Part 2. 다른 사람의 풀이
_※ 레벨 1을 푸는 동안에는 다른 사람의 풀이를 보고, 해석하는 시간을 가진다._<br>
```
class Solution {
  public String solution(String phone_number) {
     char[] ch = phone_number.toCharArray();
     for(int i = 0; i < ch.length - 4; i ++){
         ch[i] = '*';
     }
     return String.valueOf(ch);
  }
}
```
1. 받아온 문자열 배열을 모두 문자형으로 바꾼 배열을 생성한다.
2. 배열의 뒤 문자열 4개 전까지 반복문을 돌려서 앞 문자열을 "*"로 바꿔준다.
3. 문자 타입의 변수를 문자열로 변경하여 반환해준다.
<br>

엄청 깥끔한 풀이다.
<br>

---
### 🙄 Part 3. 생각
문제가 어렵지 않았다.<br>