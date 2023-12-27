package y23.m12.d27;

import java.util.ArrayList;
import java.util.List;

public class SmallStrArr {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution("10203", "15");
        System.out.println("결과: "+result);
    }
}

class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        List<String> s = new ArrayList<>();

        for(int i = 0; i < t.length(); i++){
            if(i+p.length() <=  t.length()){
                s.add(t.substring(i, i+p.length()));
            } else break;
        }

        long pp = Long.parseLong(p);
        for(String ss : s){
            long str = Long.parseLong(ss);
            if(str <= pp){
                answer++;
            }
        }
        return answer;
    }
}