
# 2024.01.12

프로그래머스 > 코딩테스트 연습 > 연습문제 > [추억 점수](https://school.programmers.co.kr/learn/courses/30/lessons/176963)

---
### 📌 Part 1. 문제 해결 절차
_※ hashMap 사용하여 문제 풀기_<br>
```
1. map에 key로 name을 넣고, val로 yearning 값을 넣는다. { key: name, val: yearning } 형태
2. photo의 값과 map의 key값이 같은지 확인한다.
3. 같다면, 해당 key의 val 값을 answer에 누적한다.
```
map으로 풀기에 최적화된 문제라는 생각이 들었다.<br>
또한 크게 어렵지 않게 풀었다.<br>
<br>

---
### 📌 Part 2. 다른 사람의 풀이
_※ 다른 사람의 풀이를 보고, 해석하는 시간을 가진다._<br>
```
import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        Map<String, Integer> map = IntStream
                                    // IntStream.range()를 사용하여 배열의 인덱스를 스트림으로 생성하고,
                                    // mapToObj를 이용하여 각 인덱스에 해당하는 이름과 yearning 값을 Map.Entity 형태로 매핑한다.
                                    .range(0, name.length)
                                    
                                    // name과 yearning 배열을 이용하여 Map을 생성한다.
                                    .mapToObj(operand -> Map.entry(name[operand], yearning[operand]))
                                    
                                    // 중복된 항목을 제거하기 위해 Collectors.toSet()을 사용한 후
                                    .collect(Collectors.toSet())
                                    
                                    // 다시 스트림을 변환하여
                                    .stream()
                                    
                                    // Collectors.toMap을 사용하여 맵으로 변환한다.
                                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
                                    
               // Arrays.strame()은 2차원 배열을 스트림으로 변환하고,
        return Arrays.stream(photo)
                        // mapToInt를 사용하여 각 행에 대한 yearning 값을 합산한 후
                        // ( strings는 2차원 문자열 배열인 photo의 각 행을 나타낸다.)
                        .mapToInt(strings -> Arrays.stream(strings)
                        
                        // 각 행의 각 문자열을 해당 문자열에 대한 yearning 값으로 매핑합니다.
                        // 만약 맵에 해당 키가 없으면 기본값으로 0을 사용합니다.
                        .mapToInt(value -> map.getOrDefault(value, 0))
                        
                        // 최종적으로 toArray()를 사용하여 배열로 변환한다.
                        .sum()).toArray();
    }
}
```
스트림을 사용하는 건, 어려운 것 같다.<br>
스트림을 접하기 전에 읽는 법을 익힌다 생각하고 가볍게 보기<br>
<br>

---
### 🙄 Part 3. 생각
어제 바램과 다르게 문제를 풀면서 프린트문으로 또 데이터를 확인했다.<br>
다 끝내고 나니까 생각나서 프린트문을 지우고, 디버깅하면서 데이터를 확인했다.<br>
익숙하지 않아서 그런지 문제를 풀면서 단박에 이해할 수 있을지 약간 의문이다.<br>
내일은 잊지말고, 꼭 디버깅하면서 풀어야지
<br>