package y24.m01.d24;

import java.util.*;

public class FeatureDevelopment {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};
        int[] result = solution.solution(progresses, speeds);

        for(int i : result){
            System.out.printf(i+" ");
        }
    }
}

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int finish = 100;

        // 1. 얼마나 소요 되는 지 확인
        for(int i = 0; i < progresses.length; i++){
            int count = 0;
            while(progresses[i] < finish) {
                progresses[i] += speeds[i];
                count++;
            }
            progresses[i] = count;
        }

        // 2. 소요되는 숫자가 크기 전까지 돌면서 카운트
        int max = 0;
        ArrayList<Integer> answerList = new ArrayList<>();
        for(int i = 0, j = -1; i < progresses.length; i++){
            // 크다면 index 만 증가하기
            if(progresses[i] > max){
                max = progresses[i];
                j++;
                answerList.add(1);
            }
            // 작다면 count 만 증가하기
            else {
                answerList.set(j, answerList.get(j) +1);
            }
        }

        int[] answer = new int[answerList.size()];
        for(int i = 0; i < answerList.size(); i++){
            answer[i] = answerList.get(i);
        }

        return answer;
    }
}