package y23.m12.d18;

public class MeasureTest {
    public static void main(String[] args) {
        Solution3 solution = new Solution3();
        int result = solution.solution(13, 17);
        System.out.println("결과: "+result);
    }
}

class Solution3 {
    public int solution(int left, int right) {
        int answer = 0;

        for(int i = left; i <= right; i++){
            int count = 0;
            for(int j = 1; j <= right; j++){
                // 약수 찾기
                if(i % j == 0){
                    count++;
                }
            }
            // count 짝, 홀수 찾기
            if(count % 2 == 0){
                answer += i;
            } else{
                answer -= i;
            }
        }
        return answer;
    }
}
