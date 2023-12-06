package y23.m12.d06;

import java.util.HashSet;

public class PhoneNumberList {
    public static void main(String[] args) {
        String[] phone_book = {"119", "97674223", "1195524421"};
        boolean result = solution(phone_book);
        System.out.println("결과: "+result);
    }

    static public boolean solution(String[] phone_book) {
        boolean answer = true;

        HashSet<String> set = new HashSet<>();
        for (String number : phone_book) {
            set.add(number);
        }

        for(int i = 0; i < phone_book.length; i++){
            for(int j = 1; j < phone_book[i].length(); j++){
                if(set.contains(phone_book[i].substring(0, j))) {
                    return false;
                }
            }
        }
        return answer;
    }
}
