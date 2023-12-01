package y23.m12.d01;

public class NextMaximum {
    public static void main(String[] args) {
        int result = solution(15);
        System.out.println("결과: "+result);
    }

    static public int solution(int n) {
        int answer = 0;

        // 1. n을 2진수로 변환
        String s = Integer.toBinaryString(n);
        System.out.println("이진수 변환 코드: "+s);

        // 2. 1인 비트의 수를 카운팅
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '1'){
                count++;
            }
        }

        // 3. n+1의 숫자를 2진수로 변환 +
        // 변환된 2진수의 숫자 '1'의 개수가 같을 때까지 반복
        for(int i = n+1; i < 1000000; i++){
            String ss = Integer.toBinaryString(i);
            int count2 = 0;

            for(int j = 0; j < ss.length(); j++){
                if(ss.charAt(j) == '1'){
                    count2++;
                }
            }
            if(count2 == count){
                answer = i;
                break;
            }
        }

        return answer;
    }
}
