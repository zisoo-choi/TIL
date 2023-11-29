package y23.m11.d29;

import java.util.Arrays;

public class ArrayElementLength {
    public static void main(String[] args) {
        String[] arr = {"We", "are", "the", "world!"};
        int[] result = solution(arr);
        System.out.println("결과: "+ Arrays.toString(result));
    }

    static public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];

        for(int i = 0; i < strlist.length; i++) {
            answer[i] = strlist[i].length();
            System.out.println("answer["+i+"] = "+answer[i]);
        }
        return answer;
    }
}
