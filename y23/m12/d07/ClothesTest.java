package y23.m12.d07;

import java.util.HashMap;
import java.util.HashSet;

public class ClothesTest {
    public static void main(String[] args) {
        String[][] clothes3 = {
                {"yellow_hat", "headgear"},
                {"blue_sunglasses", "eyewear"},
                {"smoky_makeup", "face"}};

        int result = solution(clothes3);
        System.out.println("결과: "+result);
    }

    static public int solution(String[][] clothes) {
        HashMap<String, HashSet<String>> map = new HashMap<>();
        int count = 1; // 초기값을 1로 설정

        for (int i = 0; i < clothes.length; i++) {
            String type = clothes[i][1];
            String name = clothes[i][0];

            // 해당 종류의 의상이 이미 존재하는지 확인
            if (map.containsKey(type)) {
                HashSet<String> set = map.get(type);
                set.add(name);
            } else {
                // 해당 종류의 의상이 처음 추가되는 경우 HashSet을 생성하여 추가
                HashSet<String> set = new HashSet<>();
                set.add(name);
                map.put(type, set);
            }
        }

        // 각 종류별 의상의 개수를 이용하여 경우의 수 계산
        for (HashSet<String> set : map.values()) {
            count *= (set.size() + 1); // 해당 종류의 의상을 선택하지 않는 경우까지 고려 (+1)
        }

        return count - 1; // 모든 종류에서 아무 의상도 선택하지 않는 경우를 제외
    }
}
