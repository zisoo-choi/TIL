
# 2024.01.05

프로그래머스 > 코딩테스트 연습 > 연습문제 > [문자열 내 마음대로 정렬하기](https://school.programmers.co.kr/learn/courses/30/lessons/12915)

---
### 📌 Part 1. 문제 해결 절차
_※ HaahMap으로 생각해서 풀기(실패)_<br>
```
// 내가 처음에 풀었던 방식

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        HashMap<String, String> map = new HashMap<>();

        for(int i = 0; i < strings.length; i++){
            map.put(strings[i].substring(n), strings[i]);
        }

        List<String> list = new ArrayList<>(map.keySet());
        
        // 키 값으로 오름차순 정렬
        Collections.sort(list);

        int j = 0;
        for(String key : list){
            answer[j] = map.get(key);
            j++;
        }

        return answer;
    }
}
```
일단 나는 HashMap을 이용해서 풀고자 하였다.<br>
키 자리에 자른 문자를 넣고, 값 자리에 해당 문자열을 넣으려고 하였다.<br>
여기서 HashMap은 중복을 허용하지 않는 구조이므로,<br>
처음에 인덱스 n에 위치한 값을 넣으려고 하면 중복된 값의 경우에는 들어가질 않았다.<br>
그래서 인덱스 n의 문자 하나가 아닌 n자리와 n+1 자리까지 나오게 하였다.<br>
즉, { abce, abcd }가 있을 경우 { key: ce, Value: abce }, { key: cd, Value: abcd } <br>
이런 식으로 추출해서 정렬을 하여 사용했다.<br>
그러나 해당 방식으로는 테스트 케이스는 통과하였지만, 실제 문제를 해결하진 못했다.<br>
사전순으로 정렬한다는 조건에 위배되었기 때문이라는 생각이 들었다.<br>
아마 예상컨데 { aace, agcd }라는 값이 매개변수로 들어왔으면 통과하지 못했을 것이다.<br>
나는 사전순이 아닌 뒤의 몇 단어만 보고 정렬했기 때문이다.<br>
<br>

---
### 📌 Part 2. 다른 사람의 풀이
_※ 다른 사람의 풀이를 보고, 해석하는 시간을 가진다._<br>
```
import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        ArrayList<String> arr = new ArrayList<>();
        
        // 각 문자열의 인덱스 n의 문자와 원래 문자열을 합쳐 Arraylist에 저장
        for (int i = 0; i < strings.length; i++) {
            arr.add("" + strings[i].charAt(n) + strings[i]);
        }
        
        // ArrayList를 사전순으로 정렬
        Collections.sort(arr);
        
        // 정렬된 ArrayList의 각 요소에서 첫 번째 문자를 제외한 부분을 answer 배열에 저장
        for (int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i).substring(1, arr.get(i).length());
        }
        return answer;
    }
}
```
나같은 초보자도 해석하기 쉬운 방법이다 !<br>
이렇게 하는 방법이 있구나, 역시 생각은 다양하고 좋은 코드인지는 잘 모르겠지만 꽤 창의적인 것 같다.<br>
<br>

---
### 🙄 Part 3. 생각
문제가 풀릴 듯 안 풀려서 아쉬웠다.<br>
챗 지피티보다 역시 사람이 더 창의적이란 것을 다른 사람의 풀이를 보고 느꼈으며 <br>
문제를 좀 쉽게 다가가도 좋을 것 같다.<br>
<br>
오늘 HashMap을 이용한 문풀은 비록 틀린 방식으로 끝났지만,<br>
HashMap이 중복을 허용한 채로 저장이 되었다면 <br>
키 값으로 먼저 정렬을 하고, 이후 값으로 정렬을 했으면 원하는 값이 나오지 않았을까? 싶다.<br>
내가 자료구조를 잘 몰라서 지피티한테 키와 값으로 된 중복을 허용하는 구조를 알려달라고 했더니<br>
`MultiMap 또는 ListMultimap을 사용할 수 있습니다.` 라고 답해주었다.<br>
아예 처음 보는 구조를 알려줘서, 사용해보려고 시도는 했으나 영 이해가 잘 안가서 말았다.<br>
`Guava 라이브러리를 사용하지 않고 자바 표준 라이브러리만 사용하려면, 각 키에 대한 값으로 리스트를 사용하는 방법이 있습니다. 즉, HashMap<String, List<String>>과 같은 형태로 키와 값의 쌍을 저장합니다.`
라는 방식이 존재한다는 것을 알게 된 것으로 만족하기로 했다.
<br>