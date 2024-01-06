package y24.m01.d06;

import java.util.*;

public class NumberK {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] result = solution.solution(array, commands);

        for(int i : result){
            System.out.println("결과: "+i);
        }
    }
}

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        List<Integer> list = new ArrayList<>();
        for(int i : array){
            list.add(i);
        }

        for(int i = 0; i < commands.length; i++){
            int start = commands[i][0];
            int finish = commands[i][1];
            int k = commands[i][2];

            List<Integer> subList = new ArrayList<>(list.subList(start-1, finish));
            Collections.sort(subList);
            answer[i] = subList.get(k-1);
        }

        return answer;
    }
}