package y23.m04.d11;

import java.util.ArrayList;
import java.util.HashSet;

public class PocketMonster {
    public static void main(String[] args) {
        // 문제에서 주어지는 값
        int[] nums = {3,1,2,3,3,2,2,4};

        // 주어지는 값의 나눈 2 개를 가질 수 있는 조건
        int getPocketMonMaxNum = (nums.length / 2);

        // 배열의 수를 받아올 리스트
        ArrayList<Integer> defaultValue = new ArrayList<>();

        // 배열의 값을 리스트로 추가해주는 반복문
        for(int i = 0; i < nums.length; i++){
            defaultValue.add(nums[i]);
        }

        // 받아온 값의 리스트를 HashSet 에 넣어준다.
        // -> 중복된 수 제거, 오름차순 정렬이 된다.
        HashSet<Integer> HashSetNum = new HashSet<>(defaultValue);

        System.out.println(defaultValue); // 기존 값 출력
        System.out.println(HashSetNum);   // HashSet 적용 후 값 출력

        // 중복된 수 제거와 오름차순이 된 HashSet 의 사이즈가
        // 포켓몬 최대 수보다 크거나 같다면 포켓몬 수를 리턴해라
        if(HashSetNum.size() >= getPocketMonMaxNum){
            System.out.println("\n포켓몬을 가질 수 있는 최대 수는 "+getPocketMonMaxNum+"개 입니다.");
        }

        // 중복된 수 제거와 오름차순이 된 HashSet 의 사이즈가
        // 포켓몬 최대 수보다 작다면 HashSet 의 사이즈를 리턴해라
        if(HashSetNum.size() < getPocketMonMaxNum){
            System.out.println("\n포켓몬을 가질 수 있는 최대 수는 "+HashSetNum.size()+"개 입니다.");
        }
    }
}

