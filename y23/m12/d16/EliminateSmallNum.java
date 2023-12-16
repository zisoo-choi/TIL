package y23.m12.d16;

public class EliminateSmallNum {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {1, 2, 3, 4};
        int[] result = solution.solution(arr);
        for(int i : result){
            System.out.printf(i+" ");
        }
    }
}

class Solution {
    public int[] solution(int[] arr) {
        int tmp = 0;
        tmp = arr[0];

        if(arr.length != 1){
            int[] answer = new int[arr.length-1];
            for(int i = 1; i < arr.length; i++){
                if(tmp > arr[i]){
                    tmp = arr[i];
                }
            }

            for(int i = 0, j = 0; i < arr.length; i++){
                if(arr[i] != tmp){
                    answer[j] = arr[i];
                    j++;
                }
            }

            return answer;
        }
        return new int[]{-1};
    }
}
