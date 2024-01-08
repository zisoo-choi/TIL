
# 2024.01.08

프로그래머스 > 코딩테스트 연습 > 정렬 > [K번째수](https://school.programmers.co.kr/learn/courses/30/lessons/42748)

---
### 📌 Part 1. 문제 해결 절차
_※ List에 값 넣고 Collections sort 이용하기_<br>
```
1. 매개변수로 받아오는 배열의 값을 list로 옮겨담는다.
2. 조건이 담겨 있는 commands 배열의 [i][0]번째 자리는 start 변수에 할당하고, => 문제에서 주어지는 배열 시작 값
3. 조건이 담겨 있는 commands 배열의 [i][1]번째 자리는 finish 변수에 할당하고,  => 문제에서 주어지는 배열 끝 값
4. 조건이 담겨 있는 commands 배열의 [i][2]번째 자리는 k 변수에 할당한다.  => 문제에서 찾고자하는 위치 값
5. list에 담긴 값을 start-1 ~ finish까지 추출해서 subList 에 넣는다.
6. subList를 정렬한다.
7. 정렬된 값 하나하나를 꺼내서 answer에 넣고 반환한다.
```
리스트를 너무 사용한 풀이같다.<br>
<br>

---
### 📌 Part 2. 다른 사람의 풀이
_※ 다른 사람의 풀이를 보고, 해석하는 시간을 가진다._<br>
```
import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        // Arrays.copyOfRange() : 자바에서 배열의 일부분을 복사하여 새로운 배열을 생성하는 데 사용된다.
        // public static int[] copyOfRange(int[] original, int from, int to)
        // 1. original : 복사하고자 하는 원본 배열
        // 2. from : 복사를 시작할 인덱스 (포함)
        // 3. to : 복사를 끝낼 인덱스 (제외)
        for(int i=0; i<commands.length; i++){
            int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2]-1];
        }
        return answer;
    }
}
```
배열의 일부분을 자르는 메소드가 list의 메소드만 있는 줄 알아서, 배열의 값을 list로 옮기는 작업을 추가했다. <br>
그래서 list를 남발하는 코드가 된 것 같았는데 copyOfRange() 메소드를 사용하면 배열의 값을 편리하게 쓸 수 있구나 싶다.<br>
<br>

---
### 🙄 Part 3. 생각
당시 문제를 너무 늦은 시간에 풀게 되어서 reademe를 작성하지 못하고 잤다.<br>
다음 날도 일정이 있어서 정리하지 못하고 드디어 한다.
<br>