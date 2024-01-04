# 2023.12.26
프로그래머스 > 코딩테스트 연습 > 연습문제 > [이상한 문자 만들기](https://school.programmers.co.kr/learn/courses/30/lessons/12930#)

---
### 📌 Part 1. 문제 해결 절차
_※ 입력에 따른 공백을 출력에서도 보여주기(실패)_<br>
#### 1.
```
class Trial {
    public String trial(String s) {
        String answer = "";

        // 첫 번째 도전
        String[] str = s.split("\\s"); // 공백 기준으로 자르기
        
        for(int i = 0; i < str.length; i++){
            for(int j = 0; j < str[i].length(); j++){
                char c = str[i].charAt(j);
                // 짝수라면 대문자로 바꾸어라
                if(j % 2 == 0){
                    answer += Character.toUpperCase(c);
                    continue;
                }
                answer += c;
            }
            if(i != str.length -1){
                answer += " ";
            }
        }
        return answer;
    }
}
```
1. 공백을 기준으로 문자열을 자른다.<br>
    (예 : happy happy world => str[0]: happy, str[1]: happy, str[2]: world)
2. str 배열의 길이만큼 반복문을 돌린다.
3. str[i]의 문자열을 중첩 반복문을 통해 각각 문자를 뽑는다. <br>
3-1. 추출한 문자의 인덱스가 짝수라면 대문자로 바꾸고 answer에 넣어준다. 이후 continue를 통해 j++ 위치로 이동한다.<br>
3-2. 짝수가 아니라면 answer에 문자를 넣어준다.
4. 만약 현재 i가 str의 마지막 문자열이 아니라면 공백을 추가해준다.
<br>

위와 같이 문제를 해결해보려고 하였으나, <br>
이렇게 되면 공백을 문자열이 끝날 때마다 공백을 추가해주는 식이 된다.<br>
그래서 이건 오답 !<br>
<br>

#### 2.
```
class Trial {
    public String trial(String s) {
        String answer = "";
        
        // 두 번째 도전
        String[] str2 = s.split(""); // 빈 문자열 기준으로 나누기
        
        for(int i = 0; i < str2.length; i++){
            char c = str2[i].charAt(0);
            // 짝수라면 대문자로 바꾸어라
            if(i % 2 == 0){
                answer += Character.toUpperCase(c);
                continue;
            }
            answer += c;
        }
        return answer;
    }
}
```
1.  빈 문자열을 기준으로 문자열을 나눈다.<br>
   (예 : happy world => str[0]: h, str[1]: a, str[2]: p, str[3]: p, str[4]: y, str[5]: '공백', ...)<br>
    이 경우 빈 문자열을 기준으로 자르면 각 문자 사이에 아무런 문자열이 없는 상태로 분리됩니다.<br>
    따라서 결과로 얻어지는 문자열 배열 str2에는 문자열 s의 각 문자가 각각의 배열 요소로 들어가게 됩니다.
2. str2 배열의 길이만큼 반복문을 돌린다.<br>
    2-1. 각각 문자의 인덱스가 짝수라면 대문자로 바꾸고 answer에 더한다. 이후 continue를 통해 i++ 위치로 이동한다.<br>
    2-2. 짝수가 아니라면 answer에 문자를 더해준다.
<br>

위와 같이 문제를 풀었는데, 이건 맞을거라 생각했는데 <br>
공백 두개의 문자열에 대해서 인식을 못하고 있었다.<br>
고로, (예 : tt(**)happy) 라고 한다면, <br>
우리가 원하는 결과값은 (=> Tt(**)HaPpY)가 나와야 한다.<br>
그러나 위의 코드대로 구현하면 (=> Tt(**)hApPy)가 나온다.<br>
해당 결과를 통해 공백 두개의 경우에는 처리가 안되고 있음을 알 수 있었다.
<br>

---
### 📌 Part 2. 다른 사람의 풀이
_※ 다른 사람의 풀이를 보고, 해석하는 시간을 가진다._<br>
```
class Solution {
  public String solution(String s) {
        String answer = "";
        int cnt = 0;
        String[] array = s.split("");

        for(String ss : array) {
            cnt = ss.contains(" ") ? 0 : cnt + 1;
            answer += cnt%2 == 0 ? ss.toLowerCase() : ss.toUpperCase(); 
        }
      return answer;
  }
}
```
1. 빈 문자열을 기준으로 문자열을 나눈다.
2. 나눈 문자에 대한 반복문을 돌린다.<br>
    2-1. 만약 문자열이 공백이라면 cnt에 0을 넣고, 아니라면 cnt+1을 해준다.<br>
    2-2. cnt가 짝수라면 문자를 소문자로 바꾸고, 아니라면 대문자로 바꾼다. 이후 answer에 문자열을 더해준다.<br>
   (예 : tt(**)happy) 라고 한다면, str2[0]:t -> 공백이 아니므로 cnt=1, 1%2는 1이 나오므로(홀수) 대문자로 변환
<br>

다른 사람의 풀이가 이상하게 이해가 안가서 오잉 오잉하면서 계속 쳐다보고 있었다.<br>
왜 이해를 단박에 못했지 싶으나 쨋든 이해했다.<br>
<br>

---
### 🙄 Part 3. 생각
너무 피곤하므로 정리는 내일 오전 중으로 마무리하겠음.<br>
<br>
+) 정리<br>
공백 두개까지 연산을 하는 건지 확인을 했으면 좋았을 텐데,<br>
반례로 aaa(**)만 확인하고서 내 코드에 문제가 없는 줄 알았다.<br>
그래서 너무 이해가 안되서 약간 힘들었는데,<br>
a(**)aa 형태로 미리 해보고 시행착오를 겪은 후에 수정했으면 굿이었을 텐데 아쉽다.<br>
이번 문제를 실패한 원인은 문제 이해를 못해서 그런 것 같다.