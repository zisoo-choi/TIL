package y24.m02.d01;

public class Carpet {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] result = solution.solution(10, 2);
        for(int i : result){
            System.out.print(i+" ");
        }
    }
}

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];

        int all = brown + yellow; // 총 격자의 수
        int height = 0; // 세로의 길이

        for(int i = 1; i < brown; i++){
            height = all / i;

            // 카펫 안에 패워지는 노란색 격자 수가 yellow와 같아야 한다.
            if((i-2) * (height-2) == yellow){
                answer[0] = i;
                answer[1] = height;
            }
        }
        return answer;
    }
}
