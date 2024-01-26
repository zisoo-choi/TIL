
# 2024.01.26

프로그래머스 > 코딩테스트 연습 > 스택/큐 > [프로세스](https://school.programmers.co.kr/learn/courses/30/lessons/42587?language=java)

---
### 📌 Part 1. 문제 해결 절차
_※ 우선순위 큐를 모르고, 그냥 큐로 정렬을 하려고 했지만 실패!_<br>
```
// 실패한 내 코드
class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;

        // 1. 형태 만들기
        Queue<HashMap> queue = new LinkedList<>();
        for(int i = 0; i < priorities.length; i++){
            HashMap<Integer, Integer> map = new HashMap<>();
            map.put(i, priorities[i]);
            queue.add(map);
        }

        // 2. 우선순위 조정
        for(int i = 0; i < priorities.length; i++) {
            HashMap<Integer, Integer> currentMap = queue.peek();

            for (int j = i+1; j < priorities.length; j++) {
                // currentMap에서 값 가져오기 전에 null 체크
                if (currentMap.containsKey(i) && currentMap.get(i) != null) {
                    int x = currentMap.get(i).intValue();
                    if (x < priorities[j]) {
                        queue.poll();
                        HashMap<Integer, Integer> addMap = new HashMap<>();
                        addMap.put(i, x);
                        queue.add(addMap);
                        break;
                    }
                }
            }
        }

        // 3. location의 실행 순서 찾기
        int goNum = 1;
        while(!queue.isEmpty()){
            HashMap<Integer, Integer> numMap = queue.poll();

            if(numMap.containsKey(location)){
                answer = goNum;
                break;
            }
            goNum++;
        }
        return answer;
    }
}
```
위의 코드는 아래 사진과 같은 형태로 풀려고했다.<br>
나름 나만의 전제 조건이 있었다면 다음과 같다.<br>
1. Queue를 이용해서 풀 것
2. location의 값은 해당 값의 순서를 찾는 것이니까 hashMap을 이용할 것

<img width="70%" src="https://github.com/zisoo-choi/TIL/assets/87762728/51405e53-0ea0-4ceb-950d-be3647899948"/><br>
<img width="70%" src="https://github.com/zisoo-choi/TIL/assets/87762728/d1b1cf45-3a2f-4bf6-8ce7-12017197ef12"/><br>
그러나 [1, 2, 3, 4, 5]인 경우 [5, 4, 3, 2, 1]이라는 결과가 나와야했다.<br>
하지만 내 결과는 [5, 1, 2, 3, 4] 이렇게 나왔다.<br>
해당 반례를 보고 내가 생각한 형태로 문제를 푸는 게 아니라는 걸 알게 되었다.<br>
<br>
그래서 우선순위를 찾기보다 내림차순 정렬을 해주면 되겠다. 싶어서<br>
큐를 내림차순으로 Collections.sort()를 쓸 수 있는지 찾았으나,<br>
불가능이라고 해서, 그러면 어떻게 하나 했더니 PriorityQueue() 형태를 쓰면 된다고 했다.<br>
<br>
그러나 내 코드에서 PriorityQueue()를 이용한 방식을 적용하려고 했더니,<br>
이 마저도 잘 적용이 안되어서 그냥 답을 찾아보았다.<br>
<br>

### 🍊 실행대기 큐란? => 스케줄링 큐?
실행될 프로세스가 여러 개 있으면 하나만 실행되고,<br>
나머지는 CPU가 자유로워질 때까지 대기하는 것으로 선입선출의 방식을 따른다.<br>
<br>
큐의 종류에는 작업 큐, 준비 큐, 장치 큐가 있다.<br>
- 작업 큐(Job Queue) : 메모리 할당을 대기 중인 프로세스들로 구성
- 준비 큐(Ready Queue) : CPU 할당을 대기 중인 프로세스들로 구성
- 장치 큐(Device Queue) : 입출력 장치 할당을 대기 중인 프로세스들로 구성

프로세스가 시스템에 들어가면 이들은 잡 큐에 넣어진다.<br>
잡 큐는 시스템에서 모든 프로세스들이 존재하는 곳이다.<br>
메인메모리에 거주하는 프로세스들은 레디 큐라고 불리우는<br>
리스트에서 실행되기를 기다리고 대기를 한다.<br>
큐는 보통 링크드 리스트드로 저장된다.<br>
레디 헤더는 포인터를 포함하는데, 이 포인터는 리스트에서 PCB의 처음과 끝을 가리킨다.<br>
각 PCB는 포인터 필드를 포함하고 있는데, 이는 레디 큐에 있는 다음 PCB를 가리키는 것이다.<br>
[참고 블로그](https://rollercoaster25.tistory.com/60)

---
### 📌 Part 2. 다른 사람의 풀이
_※ 다른 사람의 풀이를 보고, 해석하는 시간을 가진다._<br>
```
import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        int l = location;

        Queue<Integer> que = new LinkedList<Integer>();
        for(int i : priorities){
            que.add(i);
        }

        // 주어진 배열을 정렬한다.
        Arrays.sort(priorities);
        int size = priorities.length-1;

        // 큐가 비어있지 않을 때까지
        while(!que.isEmpty()){
            // 큐에서 하나씩 꺼내서 i에 넣기
            Integer i = que.poll();
            
            if(i == priorities[size - answer]){
                answer++;
                l--;
                if(l <0)
                    break;
            }
            else{
                que.add(i);
                l--;
                if(l<0)
                    l=que.size()-1;
            }
        }
        return answer;
    }
}
```
그림으로 그리면서 이해해보고자 했는데, 아직 나에게는 복잡하게 느껴진다.<br>
정리를 좀 해보자면<br>
1. 큐와 오름차순된 배열과 비교한다.
2. 만약 큐의 첫 번째 값과 배열의 크기 - answer(은 수가 서로 같았을 때 플러스 됨)가 같다면 answer++과 location-- 그리고 location이 0보다 작다면 나가라
3. 같지 않다면 que에 현재 빼버린 큐 값을 뒤에 넣어주고, location-- 그리고 location이 0보다 작다면 location에 que의 전체 크기를 넣어준다. 
<br>

라고 정리는 했지만, 그림을 겨우 그려서야 흐름만 이해했지,<br>
그저 큐 값을 뒤로 보내고 location 값을 마이너스 해준다.<br>
흠 ~ 내가 뭘 몰라서 그런지, 처음에 내가 구상한 <br>
hashMap으로 직관적이게 인덱스 값을 활용하는 게 초보자인 나에게는 편하다. ㅠ
<br>

---
### 🙄 Part 3. 생각
오늘은 너무 오랜시간 문제를 잡고 있었다.<br>
큐룰 써보고야 말겠다는 다짐때문에 문제를 쉽게 포기하지 못했다.<br>
그래서 오늘 이 문제에 대해서 내가 풀고, 구글에서 다른 사람 답 가져와서 이해하고,<br>
그리고 프로그래머스에 있는 답(위에 있는) 핵석하느라.. 거진 3시간을 소요한 것 같다. ㅠ<br>
잘 안풀리지만, 뭔가 풀 수 있을 것 같다는 마음이 들면 포기가 어렵다.<br>
그래도 문제를 풀면서 시간가는 줄도 모르고, 해결 절차에 대해서 계속 생각하면서<br>
절차를 못 만드는 나에게는 약간 짜증은 났지만 해당 문제를 붙잡고 있다고해서 답답하진 않았다.<br>
아무튼 이제 다음부터 2시간이 지나면 그때는 더 빨리 답을 확인하기!<br>
또한 해당 문제를 큐가 아닌 리스트 형태로 풀었으면 금방 끝났을 것 같다.<br>
그래서 큐로 고군분투한 시간이 아깝게 느껴지진 않다. 도전한거니까 !!
<br>