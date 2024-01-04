# 2023.12.25
프로그래머스 > 코딩테스트 연습 > Summer/Winter Coding(~2018) > [예산](https://school.programmers.co.kr/learn/courses/30/lessons/12982#)

---
### 📌 Part 1. 문제 해결 절차
_※ 예산에서 신청한 금액을 빼면서 count 구하기(실패)_<br>
```
import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);

        for(int i = 0; i < d.length; i++){
            int cnt = 1;
            int x = d[i];
            for(int j = i+1; j < d.length; j++){
                if(x < budget){
                    x += d[j];
                    cnt++;
                    if(x >= budget) break;
                }
            }
            if(x == budget){
                answer = cnt;
                break;
            }
        }
        return answer;
    }
}
```
1. 매개변수로 받아오는 d 배열을 오름차순 정렬한다. 
2. 매개변수로 받아오는 d 배열의 크기만큼 반복한다. (i)<br>
    2-1. 정수형 x(연산되는 값이 들어가는 변수)는 d[i]의 값으로 항상 초기화된다. 
3. d 배열의 크기만큼 반복한다. (j) => 중첩 반복문<br>
    3-1. x의 값이 예산보다 작다면 x = x + d[j]를 하고, count를 해라.<br>
    3-2. x의 값이 예산과 같거나 크다면 j 반복문을 나가라.
4. x와 예산이 같다면 i 반복문을 나가라. 
<br>
<img width="70%" src="https://github.com/zisoo-choi/TIL/assets/87762728/1d9808a7-3214-480a-8a70-4d5d54a32288"/><br>
글로 표현이 안되는 것 같아서 사진을 첨부한다.
<br>

위와 같은 방식을 가지고 문제를 풀려고 하였다.<br>
테스트 코드에 있어서는 모두 통과하였고,<br>
추가로 기입한 테스트에 대해서도 통과를 했으나<br>
정답에서는 몇군데 실패를 했다.<br>
그래서 챗지피티에게 답을 물어 해결하였다.<br>

### 📢 27일 추가, 통과 실패한 이유
```
1. 불필요한 조건(ok) : if (x < budget) 조건은 항상 참이므로 불필요하며, 이 조건은 제거해도 동일한 결과를 얻을 수 있습니다.
2. 불필요한 루프(ok) : 불필요한 루프가 있어 성능 저하의 요인이 됩니다. 이미 정렬된 배열을 사용하고 있으므로, 예산을 초과하면 바로 루프를 종료하는 것이 더 효율적입니다.
3. 불필요한 변수(ok) : cnt 변수는 현재 지원 가능한 부서의 개수를 나타내는데, 이 정보는 이미 answer에 저장되므로 불필요한 변수입니다. 이 변수를 없애고 answer를 활용하면 코드가 간결해집니다.
4. 예산을 초과한 경우의 조건 위치(ok) : 현재 코드에서는 예산을 초과한 경우에 break를 수행하고 있지만, 이 조건은 루프의 시작에서 검사하는 것이 더 자연스럽습니다. 이로 인해 불필요한 계산이 발생하지 않습니다.

# 수정된 코드
import java.util.Arrays;
class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d); // 배열을 오름차순으로 정렬

        int x = 0; // 예산 누적 변수

        for (int i = 0; i < d.length; i++) {
            x += d[i];

            // 예산을 초과하면 루프 종료
            if (x > budget) {
                break;
            }

            answer++; // 현재 부서를 지원 가능하면 answer 증가
        }

        return answer;
    }
}
```

---
### 📌 Part 2. 다른 사람의 풀이
_※ 다른 사람의 풀이를 보고, 해석하는 시간을 가진다._<br>
```
import java.util.*;
class Solution {
  public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);

        for (int i = 0; i < d.length; i++) {
            budget -= d[i];
            if (budget < 0) break;
            answer++;
        }
        return answer;
  }
}
```
1. 매개변수로 받아오는 d 배열을 오름차순 정렬한다.
2. 매개변수로 받아오는 d 배열의 크기만큼 반복한다. (i)<br>
   2-1. 예산에서 d[i] 값을 빼서 예산에 다시 저장하고 answer++을 해준다.<br>
   2-2.만약 예산이 0보다 작다면 반복문을 나간다.<br>
<br>

다른 사람의 풀이가 챗지피티의 풀이와 비슷해서 해석하는 것에 어려움은 없었다.<br>
나는 값을 더하기만 생각했는데, 뺄 생각 자체가 나에겐 창의적인 방법같다고 느꼇다.<br>
<br>

---
### 🙄 Part 3. 생각
오늘 문제를 풀면서 테스트 코드는 통과하는데 왜 실패하는 지 이해가 안가서 약간 힘들었다.<br>
아직도 이유를 모르겠어서, 일단 질문글에 남기고 내일쯤 다시 확인해봐야 할 것 같다.<br>
<br>
챗지피티와 다른 사람의 풀이를 보면서 전체적으로 느낀 생각은<br>
나는 문제에 주어진 방식에 사로 잡힌 채, 문제를 푸는가? 싶었다.<br>
문제를 보면 `정확히 1,000원을 지원해야 하며, 1,000원보다 적은 금액을 지원해 줄 수는 없습니다.`<br>
라고 명시되어 있었기에 예산에 맞춰서 문제를 풀어야 하는 줄 알았으나<br>
다른 사람의 풀이나 챗지피티의 풀이를 보면 모든 예산을 다 쓰지 않는다.<br>
그래서 내가 틀에 박힌건지, 구현을 못해서 해명하는 건지 객관적으로 생각해보고자 했다.<br>
<br>
일단 어떤 흐름으로 흘러가는 지 이해는 되었으니,<br>
내가 구현한 코드의 문제점을 찾아서 다시 리뷰하도록 하겠다.