package y24.m01.d12;

import java.util.HashMap;

public class MemoryScore {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};
        String[][] photo = {
                {"may", "kein", "kain", "radi"},
                {"may", "kein", "brin", "deny"},
                {"kon", "kain", "may", "coni"}};
        int[] result = solution.solution(name, yearning, photo);

        for(int i : result){
            System.out.printf(i+" ");
        }
    }
}

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];

        // 1. hashMap 을 이용해서 { key: name, val: yearning } 으로 배치해주기
        HashMap<String,Integer> map = new HashMap<>();

        for(int i = 0; i < name.length; i++){
            map.put(name[i], yearning[i]);
        }

        // 2. key 에 맞는 값을 찾아서 점수 누적하기
        for(int i = 0; i < photo.length; i++){
            for(int j = 0; j < photo[i].length; j++){
                if(map.keySet().contains(photo[i][j])){
                    answer[i] += map.get(photo[i][j]).intValue();
                }
            }
        }

        return answer;
    }
}