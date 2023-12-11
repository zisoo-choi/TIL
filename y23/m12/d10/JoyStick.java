package y23.m12.d10;

public class JoyStick {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int i = solution.solution("JAAPA");
        System.out.println("결과: "+ i);
    }
}

class Solution {
    public int solution(String name) {
        // 조이스틱 조작 횟수 누적
        int answer = 0;

        // 현재 위치에서 연속된 'A'의 끝 인덱스를 저장하는 변수
        int index;

        // 커서를 왼쪽 끝까지 이동하고 다시 오른쪽 끝까지 이동하는 경우의 최소 이동 횟수를 저장
        int move = name.length()-1;

        // name 의 각 문자에 대해 반복문 실행
        for(int i=0; i<name.length(); i++) {
            // (앞) 'A'~'N' 사이의 경우: 현재 문자에서 'A'로 이동하는 경우의 최소 횟수입니다.
            // (뒤) 'O'~'Z' 사이의 경우: 'Z'에서 현재 문자까지 오른쪽으로 이동하는 경우의 최소 횟수입니다.
            answer += Math.min(name.charAt(i) - 'A', 'Z' - name.charAt(i) + 1);

            index = i+1;
            // 현재 name의 크기는 넘어가지 않고, 다음 글자가 A 라면
            while(index < name.length() && name.charAt(index) == 'A') {
                // A를 건너 뛴다.
                index++;
            }

            // `i * 2 + name.length() - index`
            // 현재 위치에서 'A'가 끝나는 지점까지 가는데 오른쪽으로 이동하고, 다시 왼쪽으로 이동하는 경우의 횟수이다.
            move = Math.min(move, i * 2 + name.length() - index);

            // (name.length() - index) * 2 + i`
            // 'A'가 끝나는 지점에서 왼쪽으로 이동하고, 다시 오른쪽으로 이동하는 경우의 횟수입니다.
            move = Math.min(move, (name.length() - index) * 2 + i);
        }

        System.out.println("move: "+move);
        // 조작한 횟수(answer)와 최소 이동 횟수(move)를 합하여 결과를 반환
        return answer + move;
    }
}