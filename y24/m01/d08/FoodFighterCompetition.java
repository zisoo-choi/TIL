package y24.m01.d08;

public class FoodFighterCompetition {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] food = {1, 7, 1, 2};
        String result = solution.solution(food);
        System.out.println("결과: "+result);
    }
}

class Solution {
    public String solution(int[] food) {
        String answer = "";

        for(int i = 1; i < food.length; i++){
            int n = food[i] / 2;
            for(int j = 0; j < n; j++){
                answer += i;
            }
        }

        // 0번 음식 = 물이 존재한다면
        if(food[0] != 0){
            answer += 0;
        }

        for(int i = answer.length()-2; i >= 0; i--){
            answer += answer.charAt(i);
        }

        return answer;
    }
}

