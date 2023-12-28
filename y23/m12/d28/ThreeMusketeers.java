package y23.m12.d28;

public class ThreeMusketeers {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] number = {-2, 3, 0, 2, -5};
        int result = solution.solution(number);
        System.out.println("결과: "+result);
    }
}

class Solution {
    public int solution(int[] number) {
        int answer = 0;

        for(int i = 0; i < number.length; i++) {
            for(int j = i + 1; j < number.length; j++) {
                for(int k = j + 1; k < number.length; k++) {
                    if(number[i] + number[j] + number[k] == 0) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}