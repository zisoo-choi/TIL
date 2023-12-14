package y23.m12.d14;

public class HidePhoneNum {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String result = solution.solution("027778888");
        System.out.println("결과: "+ result);
    }
}
class Solution {
    public String solution(String phone_number) {
        String answer = "";

        String frontString = phone_number.substring(phone_number.length()-phone_number.length(), phone_number.length()-4);
        String backString = phone_number.substring(phone_number.length()-4, phone_number.length());

        for(int i = 0; i < frontString.length(); i++){
            answer += "*";
        }
        answer += backString;
        return answer;
    }
}
