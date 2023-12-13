package y23.m12.d13;

import java.util.*;

public class AddNoNumber {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,6,7,8,0};
        Solution solution = new Solution();
        int result = solution.solution(numbers);
        System.out.println("결과: "+result);
    }
}
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;

        List<Integer> list = new ArrayList<>();
        List<Integer> num = new ArrayList<>();

        for(int i = 1; i <= 9; i++){
            num.add(i);
        }

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i]!=0){
                list.add(numbers[i]);
            }
        }

        // num - list
        num.removeAll(list);

        for(int i : num) {
            answer += i;
        }

        return answer;
    }
}
