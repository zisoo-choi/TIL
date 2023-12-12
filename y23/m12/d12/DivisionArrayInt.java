package y23.m12.d12;

import java.util.*;

public class DivisionArrayInt {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {3,2,6};
        int[] result = solution.solution(arr, 10);

        for(int r : result) {
            System.out.println("결과 : "+r);
        }
    }
}
class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                list.add(arr[i]);
            }
        }

        // 리스트 정렬
        Collections.sort(list);

        // List가 비어있을 경우 -1 반환
        if(list.isEmpty()){
            return new int[]{-1};
        }

        int[] answer = new int[list.size()];

        // List를 배열로 변환
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}

