package y23.m12.d18;

public class DotProduct {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a = {-1,0,1};
        int[] b = {1,0,-1};
        int result = solution.solution(a, b);
        System.out.println("결과: "+result);
    }
}

class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        for(int i = 0; i < a.length; i++){
            answer += a[i] * b[i];
        }

        return answer;
    }
}
