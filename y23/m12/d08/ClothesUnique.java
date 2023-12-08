package y23.m12.d08;

import java.util.HashMap;
import java.util.HashSet;

public class ClothesUnique {
    public static void main(String[] args) {
        String[][] clothes = {
                {"yellow_hat", "headgear"},
                {"blue_sunglasses", "eyewear"},
                {"green_turban", "headgear"}};
        String[][] clothes2 = {
                {"crow_mask", "face"},
                {"blue_sunglasses", "face"},
                {"smoky_makeup", "face"}};
        String[][] clothes3 = {
                {"yellow_hat", "headgear"},
                {"blue_sunglasses", "eyewear"},
                {"smoky_makeup", "face"}};

        int result = solution(clothes3);
        System.out.println("결과: "+result);
    }

    static public int solution(String[][] clothes) {
        HashMap<String, HashSet<String>> map = new HashMap<>();
        int count = 1;

        for(int i = 0; i < clothes.length; i++){
            String type = clothes[i][1];
            String name = clothes[i][0];

            if(map.containsKey(type)){ // 만약 이미 추가가 된 타입이라면
                HashSet<String> set = map.get(type);
                set.add(name); // 의상의 이름을 넣어준다. (타입은 같으나 다른 물건)
            } else { // 존재하지 않는 타입이라면
                HashSet<String> set = new HashSet<>();
                set.add(name);
                map.put(type, set);
            }
        }

        for(HashSet<String> set : map.values()){
            count *= (set.size()+1);
        }

        return count-1;
   }
}
