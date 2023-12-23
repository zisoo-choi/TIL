package y23.m12.d23;

import java.util.*;

public class GreatestCommonDivisorAndCommonMultiple {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] result = solution.solution(2, 5);
        for(int i : result){
            System.out.println("결과: "+i);
        }
    }
}

class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int tmp = 0;
        HashSet<Integer> set = new HashSet<>();

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                if(n % j == 0 && m % j == 0){
                    System.out.println(i+"와 "+ j);
                    set.add(j);
                }
            }
            for(int t : set){
                if(tmp < t){
                    tmp = t;
                }
            }
        }
        System.out.println(set);
        System.out.println("tmp: "+tmp);

        int x = 0;
        int y = 0;

        System.out.println("m: "+m);
        System.out.println("n: "+n);

        System.out.println();
        System.out.println(m+"%"+tmp+": "+m%tmp);
        System.out.println(n+"%"+tmp+": "+n%tmp);

        if(m%tmp == 0 && n%tmp == 0){
            x = m/tmp; //
            y = n/tmp; // 4
        }

        System.out.println();
        System.out.println("x: "+x);
        System.out.println("y: "+y);
        int max = x * y * tmp;
        System.out.println("max: "+max);

        answer[0] = tmp;
        answer[1] = max;
        System.out.println();
        return answer;
    }
}
