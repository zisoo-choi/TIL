package y23.m11.d29;

public class AddNegativePositive {
    public static void main(String[] args) {
        int[] absolutes = {4, 7, 12};
        boolean[] signs = {true, false, true};
        int result = solution(absolutes, signs);

        System.out.println("결과: "+result);
    }

    static public int solution(int[] absolutes, boolean[] signs) {
        int sum = 0;

        for(int i = 0; i < absolutes.length; i++){
            if(signs[i]) {
                sum += absolutes[i];
                continue;
            }
            sum -= absolutes[i];
        }
        return sum;
    }
}
