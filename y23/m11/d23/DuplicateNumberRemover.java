package y23.m11.d23;
import java.util.*;

public class DuplicateNumberRemover {
    public static void main(String[] args) {
        int[] arr = {1,1,3,3,0,1,1};
        int[] result = solution(arr);
    }

    public static int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < arr.length; i++){
            if(!stack.isEmpty() && stack.peek() == arr[i]) continue;
            else stack.push(arr[i]);
        }

        int[] answer = new int[stack.size()];
        for(int i = stack.size()-1 ; i >= 0; i--){
            answer[i] = stack.pop().intValue();
            System.out.println(i+ "번째 : "+answer[i]);
        }

        return answer;
    }
}
