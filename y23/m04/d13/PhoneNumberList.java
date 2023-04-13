package y23.m04.d13;

import java.util.*;

public class PhoneNumberList {
    public static void main(String[] args) {
        // 문제에서 주어지는 값
        String[] phone_book = {"12","567","88","123"};
        boolean answer = true;

        HashSet<String> set = new HashSet<>();

        for(String phone : phone_book){
            set.add(phone);
        }

        for(String phone : phone_book){
            for(int i = 0; i < phone.length(); i++){
                if(set.contains(phone.substring(0, i))) {
                    answer = false;
                    System.out.println(answer);
                    // 문제에서는 여기서 리턴된다.
                }
            }
        }
        answer = true;
        System.out.println(answer);
        // 문제에서는 여기서 리턴된다.
    }
}
