
# 2024.01.10

프로그래머스 > 코딩테스트 연습 > 2018 KAKAO BLIND RECRUITMENT > [(1차)비밀지도](https://school.programmers.co.kr/learn/courses/30/lessons/17681)

---
### 📌 Part 1. 문제 해결 절차
_※ String을 활용하기_<br>
```
1. n * n의 정사각형 지도를 만든다.
2. 매개변수로 받아오는 arr1과 arr2 배열의 수를 toBinaryString()메소드를 사용하여 이진수로 바꾼다.
    (위의 결과로 아스키코드 0은 48, 1은 49인 상태로 출력되고 있는 상태이다.)
3. arr1과 arr2가 49이면 "#"(=벽) 으로, 아니라면 ""(=공백)으로 지도 배열에 넣는다.
4. 이후 한 줄의 결과를 str에 넣고 answer[i] 배열에 넣어 반환한다.
```
문제를 풀면서 알아본 내용은 toBinaryString() 메소드를 활용한 부분이다.<br>
2진수로 바꾸는 문제를 몇 번 풀다가 실패하고, 해당 메소드를 사용한 기억이 있었는데<br>
무슨 메소드였는지 기억이 안나서 Collections.binary 어떠구인가 하다가<br>
안되길래, 이건 검색해서 찾아내고 아래와 같이 String.format()과 함께 사용했다.<br>
`String.format("%"+n+"s", Integer.toBinaryString(arr1[i])).replace(" ", "0");`<br>
<br>
그 외로 차근차근 문제를 풀어보고자 단계별로 구현했고, 그 결과 어렵지 않게 완성할 수 있었다.<br>
<br>

---
### 📌 Part 2. 다른 사람의 풀이
_※ 다른 사람의 풀이를 보고, 해석하는 시간을 가진다._<br>
```
class Solution {
  public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            result[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
        }

        for (int i = 0; i < n; i++) {
            result[i] = String.format("%" + n + "s", result[i]);
            result[i] = result[i].replaceAll("1", "#");
            result[i] = result[i].replaceAll("0", " ");
        }

        return result;
    }
}
```
우와 정말 깔끔하다.<br>
내가 단계별로 풀었다고 생각했는데, 이걸 보니 약간 복잡한 단계로 풀어낸 것 같다.<br>
요즘은 문제 해결 절차 별로 풀어내고 있으니,<br>
남이 보기에도 가독성 좋은 코드를 보면서 흉내내보도록 도전해야겠다.<br>
<br>

---
### 🙄 Part 3. 생각
연달아 레벨1 문제를 잘 풀어내고 있어서, <br>
문제 해결 절차 능력이 커진건가? 싶은 생각이 든다.<br>
다음주 부터는 레벨2를 풀어보도록 해야겠다.<br>
<br>
알고리즘 문제풀이가 의무적으로 해야하는 일이라는 형식을 띠게 된 것 같아서<br>
앞으로의 방향성에 대해서 어떻게 잡아가야 할 지 고민스러운 지난 날이었는데<br>
문제를 먼저 받아들이고, 그 다음 문제 해결 절차에 대해서 집중하고 구현을 하니<br>
문제가 잘 풀리기 시작했다. (물론, 좋은 코드인지는 모르겠고 구현을 해내고 있다.)<br>
그러다보니 알고리즘 문제풀이가 즐겁다. <br>
뿐만 아니라 스택이나, 해시, 리스트를 용도에 맞게 사용하려는 노력을 할 수 있게 되었다.<br>
앞으로도 이렇게 많이 배워나가야지 !
<br>