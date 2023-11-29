package y23.m11.d29;

public class StatusDot {
    public static void main(String[] args) {
        int[] testCase = {2, 4};
        int result = solution(testCase);
        System.out.println("결과: "+ result);
    }

    static public int solution(int[] dot) {
        int answer = 0;

        int x = dot[0];
        int y = dot[1];

        if((x >= 1) && ( y >= 1)) {
            answer = 1;
        } else if((x < 1) && (y >= 1)) {
            answer = 2;
        } else if ((x < 1) && (y < 1)) {
            answer = 3;
        } else {
            answer = 4;
        }

        return answer;
    }
}
