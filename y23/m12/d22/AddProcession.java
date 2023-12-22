package y23.m12.d22;

public class AddProcession {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] arr1 = {{1,2},{2,3}};
        int[][] arr2 = {{3,4},{5,6}};
        int[][] result = solution.solution(arr1, arr2);

        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr2.length; j++){
                System.out.println("result["+i+"]["+j+"]: "+result[i][j]);
            }
        }
    }
}

class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];

        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr2[0].length; j++){
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;
    }
}