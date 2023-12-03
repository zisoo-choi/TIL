package y23.m12.d03;

public class FibonacciNumbers {
    public static void main(String[] args) {
        int result = solution(5);
        System.out.println("결과: "+result);
    }

    static public int solution(int n) {
        int[] arr = new int[n+1];

        for(int i = 0; i <= n; i++){
            if(i == 0){
                arr[i] = 0;
            } else if(i == 1){
                arr[i] = 1;
            } else {
                arr[i] = (arr[i-1] + arr[i-2]) % 1234567;
                System.out.println(arr[i]+" = "+arr[i-1]+" + "+arr[i-2]);
            }
        }

        return arr[n];
    }
}
