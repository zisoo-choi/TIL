package y23.m12.d02;

import java.util.Arrays;

public class MakeMinimumValue {
    public static void main(String[] args) {
        int[] A = {4, 1, 2};
        int[] B = {5, 4, 4};
        int result = solution(A, B);
        System.out.println("결과: "+result);
    }

    static public int solution(int []A, int []B)
    {
        Arrays.sort(A);
        Arrays.sort(B);

        int sum = 0;
        for(int i = 0; i < A.length; i++){
            sum += A[i] * B[A.length-i-1];
        }

        return sum;
    }
}
