package y23.m12.d04;

import java.util.HashSet;

public class WordChainGame {
    public static void main(String[] args) {
        String[] word = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
        int[] result = solution(3, word);

        if (result[0] == 0) {
            System.out.println("끝말잇기에서 탈락자가 없습니다.");
        } else {
            System.out.println(result[0] + "번 사람이 " + result[1] + "차례에 탈락하였습니다.");
        }
    }

    static public int[] solution(int n, String[] words) {
        // 결과를 저장할 배열 초기화
        int[] answer = {0, 0};

        // 사용된 단어를 체크하기 위한 HashSet
        HashSet<String> usedWords = new HashSet<>();

        // 첫 번째 단어는 이미 사용했다고 가정하고 HashSet 에 추가
        usedWords.add(words[0]);

        // 두 번째 단어부터 반복
        for (int i = 1; i < words.length; i++) {
            // 이미 사용한 단어인지 또는 끝말잇기 규칙에 맞지 않는지 확인
                                             // words[i].charAt(0) : 현 글자의 첫 번재 글자
                                                                  // words[i - 1].charAt(words[i - 1].length() - 1) : 앞 글자의 마지막 글자
            if (usedWords.contains(words[i]) || words[i].charAt(0) != words[i - 1].charAt(words[i - 1].length() - 1)) {
                // 탈락자 정보 저장 | [0]: 탈락자, [1]: 라운드
                answer[0] = (i % n) + 1;  // 번호는 1부터 시작하므로 +1
                answer[1] = (i / n) + 1;  // 차례는 1부터 시작하므로 +1
                // 문제의 조건에 따라 첫 번째 오류가 발생한 경우 바로 반복문 종료
                break;
            }

            // HashSet 에 현재 단어 추가
            usedWords.add(words[i]);
        }

        return answer;
    }
}