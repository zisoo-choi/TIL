package y24.m01.d04;

public class ProximateEqualsChar {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] result = solution.solution("banana");
        for(int i : result){
            System.out.println("결과: "+i);
        }
    }
}

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        char[] c = new char[s.length()];

        for(int i = 0 ; i < s.length(); i++){
            c[i] = s.charAt(i);
        }

        answer[0] = -1;
        for(int i = 1; i < c.length; i++){
            for(int j = i-1; j >= 0; j--){
                if(c[i] == c[j]){
                    answer[i] = i - j;
                    break;
                } else {
                    answer[i] = -1;
                }
            }
        }
        return answer;
    }
}