package y24.m01.d09;

import java.util.*;

public class SecondPickAdd {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] numbers = {2,1,3,4,1};
        int[] result = solution.solution(numbers);
        for(int i : result){
            System.out.printf(i+" ");
        }
    }
}

class Solution {
    public int[] solution(int[] numbers) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < numbers.length; i++){
            for(int j = i+1; j < numbers.length; j++){
                set.add(numbers[i] + numbers[j]);
            }
        }

        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        int[] answer = new int[list.size()];

        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}