package y23.m12.d18;

public class WaterMelon {
    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        String result = solution.solution(4);
        System.out.println("결과: "+result);
    }
}

class Solution2 {
    public String solution(int n) {
        String answer = "";
        String water = "수";
        String melon = "박";

        for(int i = 1; i <= n; i++){
            // 홀수일 때,
            if(i % 2 != 0){
                answer += water;
            }
            // 짝수일 때,
            if(i % 2 == 0){
                answer += melon;
            }
        }

        return answer;
    }
}
