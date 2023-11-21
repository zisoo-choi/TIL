package y23.m11.d21;

public class BinaryChange {
            public int[] solution(String s) {
                int count = 0;
                int A = 0;

                while (!s.equals("1")) {
                    int B = 0;  // 1의 개수 초기화
                    for (int i = 0; i < s.length(); i++) {
                        char c = s.charAt(i);
                        if (c == '1') {
                            B++; // 1의 개수 증가
                        } else {
                            A++; // 0의 개수 증가
                        }
                    }
                    count++; // 변환 횟수 증가

                    // 이진 변환
                    s = Integer.toBinaryString(B);
                }

                int[] answer = {count, A};
                return answer;
            }
        }

        /* 내가 짠 실패한 코드
            int count = 0;
            int A = 0;

            int B = 0;

            while(!s.equals("1")){
                for(int i = 0; i < s.length(); i++){
                    char c =  s.charAt(i);
                    if(c == '0') {
                        A++; // 0의 갯수
                    }
                    B++; // 1의 갯수
                }
                count++;

                int m = 0; // 몫
                String n = ""; // 나머지
                if(B != 1){
                    for(int i = 0; i < B; i++){
                        int r = B % 2;
                        n = r + n;
                        B /= 2;

                        //m = B /= 2;
                        //n += (B % 2);

                        if(B == 1){
                            n = B + n;
                            break;
                        }
                    }
                    //B = Integer.parseInt(n);
                    s = n;
                }
            }

            int[] answer = {count, A};
            return answer;
       */