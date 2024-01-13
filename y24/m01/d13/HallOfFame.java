package y24.m01.d13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HallOfFame {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] score = {10, 100, 20, 150, 1, 100, 200};
        int[] result = solution.solution(3, score);
        // 9 => 10, 30, 40, 3, 0, 20, 4 기댓값은 [10, 10, 10, 3, 0, 0, 0]
        // 5 => 2,3,1 기댓값은 [2, 2, 1]

        for(int i : result){
            System.out.printf(i+" ");
        }
    }
}

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];

        int n = Math.min(k, score.length);
        List<Integer> list = new ArrayList<>();

        // 1. k개의 수를 list에 집어넣기
        for(int i = 0; i < n; i++){
            list.add(score[i]);
            Collections.sort(list);
            answer[i] = list.get(0);
        }

        // 2. 비교하기
        for(int i = n; i < score.length; i++){
            int j = 0;
            while(j < k) {
                if(list.get(j) < score[i]){
                    list.remove(j);
                    System.out.println("삭제 후 list: "+list);
                    list.add(score[i]);
                    System.out.println("새로 추가 후 list: "+list);
                    Collections.sort(list);
                    answer[i] = list.get(0);
                    System.out.println("반환 !: "+list.get(0));
                    break;
                }
                if(list.get(n-1) > score[i]){
                    answer[i] = list.get(0);
                }
                j++;
            }
            System.out.println();
        }

        return answer;
    }
}
