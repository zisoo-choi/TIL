package y24.m01.d26;

import java.util.*;

public class ProcessTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] priorities = {1, 2, 3, 4, 5};
        int location = 2;
        int result = solution.solution(priorities, location);
        System.out.println("결과: "+ result);
    }
}

class Solution {
    public int solution(int[] priorities, int location) {
        // 우선순위 큐 선언(내림 차순)
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        int answer = 0;

        // 요소 추가
        for (int i : priorities) {
            queue.offer(i);
        }

        // 큐가 빌 때까지 반복
        while (!queue.isEmpty()) {
            // 기존 우선순위 배열 순회
            for (int i = 0; i < priorities.length; i++) {
                // 만약 요소의 값이 같다면
                if (queue.peek() == priorities[i]) {
                    queue.poll();
                    answer++;

                    // 요소 값의 인덱스와 location이 같다면
                    if (location == i) {
                        return answer;
                    }
                }
            }
        }

        return answer;
    }
}