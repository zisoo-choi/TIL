package y23.m11.d29;

public class ReverseString {
    public static void main(String[] args) {
        String result = solution("jaron");
        System.out.println("결과: "+result);
    }

    static public String solution(String my_string) {
        String answer = "";
        char[] reverse = new char[my_string.length()];

        for(int i = 0, j = my_string.length()-1; i < my_string.length(); i++, j--) {
            reverse[j] = my_string.charAt(i);
        }

        answer = String.valueOf(reverse);
        return answer;
    }

}
