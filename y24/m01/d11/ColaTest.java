package y24.m01.d11;

public class ColaTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution(3, 2, 20);
        System.out.println("결과: "+ result);
    }
}

class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;

        int quotient = 0; // 몫
        int remainder = 0; // 나머지
        int addCoke = 0; // 추가로 얻은 콜라

        // 2. addCoke가 a보다 크다면 반복문을 실행해라.
        while (n >= a){
            // 1. 현재 n병을 a로 나눈 값과 나머지 값을 구한다.
            quotient = n / a;
            remainder = n % a;
            addCoke = quotient * b;
            n = addCoke + remainder;
            answer += addCoke;

            System.out.println();
            System.out.println("몫과 나머지 : "+ quotient +", "+ remainder);
            System.out.println("추가 콜라 : "+ addCoke);
            System.out.println("n : "+ n);
        }
        System.out.println();

        return answer;
    }
}