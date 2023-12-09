package y23.m12.d09;

public class GymSuit {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 5;
        int[] lost = {2, 4};
        int[] reserve = {1, 3, 5};
        int result = solution.solution(n, lost, reserve);
        System.out.println("결과: "+result);
    }
}

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] arr = new int[n+1];

        // 초기화 (체육복 존재 시 1)
        for(int i = 1; i < n+1; i++){
            arr[i] = 1;
        }

        // 도난 당한 학생
        for(int l : lost){
            arr[l]--;
        }

        // 여벌 체육복이 있는 학생
        for (int r : reserve) {
            arr[r]++;
        }

        // 도난 당한 학생에게 빌려주기
        for (int i = 1; i <= n; i++) {
            // 도난 당한 학생 중에
            if (arr[i] == 0) {
                // 앞 친구가 도난 안 당하고, 여벌 옷까지 2개인 경우
                if(arr[i-1] == 2){
                    arr[i-1]--;
                    arr[i]++;
                }
                // 뒤 친구가 이하 동문 2개인 경우
                if(arr[i+1] == 2) {
                    arr[i+1]--;
                    arr[i]++;
                }
            }
        }

        for(int i = 1; i < n+1; i++){
            if(arr[i] > 0){
                answer++;
            }
        }

        return answer;
    }
}
