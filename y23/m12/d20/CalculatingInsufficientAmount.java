package y23.m12.d20;

public class CalculatingInsufficientAmount {
    public static void main(String[] args) {
        Solution solution = new Solution();
        long result = solution.solution(3, 20, 4);
        System.out.println("결과: "+result);
    }
}

class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long requiredAmount = 0;
        long calculationAmount = 0;

        for(int i = 0; i < count; i++){
            calculationAmount += price;
            requiredAmount += calculationAmount;
        }
        System.out.println("필요한 금액: "+requiredAmount);

        answer = requiredAmount > money ? requiredAmount - money : 0;

        return answer;
    }
}
