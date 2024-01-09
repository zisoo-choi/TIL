
# 2024.01.09

프로그래머스 > 코딩테스트 연습 > 월간 코드 챌린지 시즌1 > [두 개 뽑아서 더하기](https://school.programmers.co.kr/learn/courses/30/lessons/68644)

---
### 📌 Part 1. 문제 해결 절차
_※ 중첩 반복문과 hashset을 활용한_<br>
```
1. 배열의 모든 수를 더하기 위해 중첩 반복문과 hashset을 활용한다.
2. numbers[i] + numbers[j]를 통해 더한 값을 set에 넣는다. (중복 제거)
3. set을 list로 변환한다.
4. collection.sort를 통해 정렬시킨다.
5. answer 배열에 list를 넣어준 후 반환한다.
```
처음 문제를 풀 때에는 list를 쓸 생각이 없었다.<br>
hashset에 넣기만 해도 정렬이 되고 있는 것처럼 보였다.<br>
이것은 테스트 케이스의 경우에만 정렬이 되는 것처럼 보인 것이었다.<br>
다른 반례를 보니, 정렬이 안되고 있는 것이 보였다.<br>
<br>
hashset에도 sort 해주는 기능이 있을 것이라 생각하고 그것을 활용하려고 하였으나<br>
바로 정렬해주는 기능을 내가 활용하지 못하는 것인지, 없는 것 처럼 보였다.<br>
그래서 hashset을 list로 변환하고 그것을 정렬하기로 했다.<br>
여기서 set을 list로 변환하는 기능에 대해서는 검색을 해서 찾았다.<br>
자꾸 했던 기능들을 까먹고 검색하는 게 아쉬웠다.<br>
이후 바로 통과할 수 있었다.<br>
<br>

---
### 📌 Part 2. 다른 사람의 풀이
_※ 다른 사람의 풀이를 보고, 해석하는 시간을 가진다._<br>
```
import java.util.HashSet;
import java.util.Set;

class Solution {
     public int[] solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();

        for(int i=0; i<numbers.length; i++) {
            for(int j=i+1; j<numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }
        // hashset의 값을 스트림으로 변환하고, 정렬한 후, int 배열로 변환하여 반환한다.
        // 이것은 중복을 제거하고 정렬된 배열을 얻기 위한 과정이다.
        return set.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}
```
와 문제를 풀면서 set을 바로 정렬시키는 법을 이렇게 깔끔하게 작성하다니<br>
스트림 .. 아직 알지 못해도 문제는 푼다! 이렇게 생각해왔는데<br>
사용해보는 연습을 해봐야 할 것 같다는 생각이 조금 들었다.<br>
이렇게 문제 풀면서 생긴거라도 눈에 익혀두면 사용하려고 할 때<br>
많이 생소하거나 어렵진 않겠지 싶은 마음이다.<br>
아무튼 멋진 풀이다.<br>
<br>

---
### 🙄 Part 3. 생각
문제 푸는 시간을 바꾸고 풀어보니까, <br>
저녁보다 훨씬 여유를 가지고 제 시간 내에 풀 수 있는 것 같아서 능률이 오르는 기분이 든다.<br>
자료구조 활용하는 법을 점점 익히고 있는 것 같다.<br>
얼른 더 잘 해내서 레벨2 혹은 고득점 알고리즘 풀이도 도전하고 싶다.<br>
<br>