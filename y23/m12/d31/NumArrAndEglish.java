package y23.m12.d31;

import java.util.HashMap;

public class NumArrAndEglish {
    public static void main(String[] args) {
       Solution solution = new Solution();
        int result = solution.solution("one4seveneight");
        System.out.println("결과: "+result);
    }
}

class Solution {
    public int solution(String s) {
        int answer = 0;

        HashMap<String, String> alpabet = new HashMap<>();
        alpabet.put("zero", "0");
        alpabet.put("one", "1");
        alpabet.put("two", "2");
        alpabet.put("three", "3");
        alpabet.put("four", "4");
        alpabet.put("five", "5");
        alpabet.put("six", "6");
        alpabet.put("seven", "7");
        alpabet.put("eight", "8");
        alpabet.put("nine", "9");

        for(String key : alpabet.keySet()) {
            if(s.contains(key)){
                s = s.replace(key, alpabet.get(key));
            }
        }

        answer = Integer.parseInt(s);
        return answer;
    }
}