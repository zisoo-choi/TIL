package y23.m12.d17;

public class MeddleNum {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String result = solution.solution("qwer");
        System.out.println("결과: "+result);
    }
}

class Solution {
    public String solution(String s) {
        String answer = "";

        int meddle = s.length() / 2;
        System.out.println("meddle: "+ meddle);

        // 문자열이 홀수라면
        if(s.length()%2 != 0){
            char c = s.charAt(meddle);
            answer = String.valueOf(c);
        }

        // 문자열이 짝수라면
        if(s.length()%2 == 0){
            int meddle_mate = meddle -1;
            System.out.println("meddle_mate: "+meddle_mate);

            char cc = s.charAt(meddle_mate);
            char c = s.charAt(meddle);
            answer = String.valueOf(cc);
            answer += String.valueOf(c);
        }

        return answer;
    }
}
