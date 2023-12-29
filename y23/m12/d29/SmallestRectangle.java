package y23.m12.d29;

public class SmallestRectangle {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        int result = solution.solution(sizes);
        System.out.println("결과: "+result);
    }
}

class Solution {
    public int solution(int[][] sizes) {
        int maxWidth = 0;
        int maxHeight = 0;

        for (int i = 0; i < sizes.length; i++) {
            int width = sizes[i][0];
            int height = sizes[i][1];

            // 각 명함의 가로 길이와 세로 길이를 비교하여 최대 가로 길이와 세로 길이를 갱신
            maxWidth = Math.max(maxWidth, Math.max(width, height));
            maxHeight = Math.max(maxHeight, Math.min(width, height));
        }

        // 가장 큰 가로 길이와 세로 길이를 곱하여 지갑의 크기를 계산
        int answer = maxWidth * maxHeight;
        return answer;
    }
}