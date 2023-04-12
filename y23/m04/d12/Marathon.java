import java.util.Arrays;

public class Marathon {
    public static void main(String[] args) {
        // 주어지는 배열 값
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};

        // ★ 처음 한 생각
        // 완주하지 못한 선수의 이름을 return -> 현재 leo 라는 값이 나와야 한다.
        // participant - completion = result

        // ★ 혼자 잘 안되서 Arrays.sort() 를 보고 한 생각
        // 1. 각 배열을 정렬한다.
        // 2. 각 배열을 비교하여 다르면 리턴

        Arrays.sort(participant);
        Arrays.sort(completion);

        for(int i = 0; i < completion.length; i++){
            if(!participant[i].equals(completion[i])){
                System.out.println(participant[i]);
                break;
            }
        }
        System.out.println(participant[participant.length-1]);
    }
}