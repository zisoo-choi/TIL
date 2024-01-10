package y24.m01.d10;

public class SecretMap{
    public static void main(String[] args) {
        int[] arr1 = {46, 33, 33 ,22, 31, 50};
        int[] arr2 = {27 ,56, 19, 14, 14, 10};
        Solution solution = new Solution();
        String[] result = solution.solution(6, arr1, arr2);
        for(String s : result){
            System.out.printf(s+" ");
        }
    }
}

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        // 1. n * n 지도 만들기
        String[][] map = new String[n][n];

        for(int i = 0; i < n; i++){
            // 2. 배열의 수를 이진법으로 만들기
            String s = String.format("%"+n+"s", Integer.toBinaryString(arr1[i])).replace(" ", "0");
            String ss = String.format("%"+n+"s", Integer.toBinaryString(arr2[i])).replace(" ", "0");
            for(int j = 0; j < n; j ++){
                // 48은 0, 49는 1인 상태이다.
                String x = s.charAt(j) == 49 || ss.charAt(j) == 49 ? "#" : " ";
                map[i][j] = x;
                System.out.printf(map[i][j]+" ");
            }
            System.out.println();
        }

        // 3. 출력값 반환하기
        for(int i = 0; i < n; i++){
            String str = "";
            for(int j = 0; j < n; j++){
                str += map[i][j];
                System.out.println("출력할 값: "+ map[i][j]);
            }
            answer[i] = str;
            System.out.println();
        }
        return answer;
    }
}