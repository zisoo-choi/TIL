package y23.m11.d30;

public class NumericalExpressions {
    public static void main(String[] args) {
        int result = solution(15);
        System.out.println("결과: "+result);
    }

    static public int solution(int n) {
        int answer = 0;
        int count = 0;

        for(int i = 1; i <= n; i++) {
            answer = 0;
            for(int j = i; j <= n; j++) {
                answer += j;
                if(answer > n){
                    break;
                }
                if(answer == n) {
                    count++;
                    break;
                }
            }
        }
        answer = count;
        return answer;
    }
}
