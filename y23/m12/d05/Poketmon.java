package y23.m12.d05;

import java.util.HashSet;

public class Poketmon {
    public static void main(String[] args) {
        int[] nums = {3,3,3,2,2,2};
        int result = solution(nums);
        System.out.println("결과 : "+result);
    }

    static public int solution(int[] nums) {
        int havePocketMon = nums.length / 2;
        HashSet<Integer> hashSet = new HashSet<Integer>();

        for(int i = 0; i < nums.length; i++){
            hashSet.add(nums[i]);
        }

//        return hashSet.size() >= havePocketMon ? havePocketMon : hashSet.size();
        return Math.min(havePocketMon, hashSet.size());
    }
}
