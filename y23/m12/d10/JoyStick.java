package y23.m12.d10;

public class JoyStick {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int i = solution.test("JAZ");
//        System.out.println("결과: "+ i);
    }
}

class Solution {
    public int test(String name) {
        int answer = 0;

        char[] alpabet = {
                'A', 'B', 'C', 'D', 'E',
                'F', 'G', 'H', 'I', 'J',
                'K', 'L', 'M', 'N', 'O',
                'P', 'Q', 'R', 'S', 'T',
                'U', 'V', 'W', 'X', 'Y', 'Z'};

        char[] str = new char[name.length()];
        // A로 초기화
        for(int i = 0; i < name.length(); i++){
            str[i] = 'A';
        }

        for(int i = 0; i < name.length(); i++){
            char c = name.charAt(i);
            if(str[i] == c) {
                answer++;
            } else {
                for(int j = 1; j < alpabet.length; j++){
                    int z = 0;
                    if(c == alpabet[j]) {
                        answer += j;
                        break;
                    }
                }
            }
        }

        System.out.println("결과 => "+ answer);
        return answer;
    }
}