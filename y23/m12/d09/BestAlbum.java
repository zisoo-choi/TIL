package y23.m12.d09;

import java.util.*;
import java.util.stream.Collectors;

public class BestAlbum {
    public static void main(String[] args) {
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};
        int[] result = new BestAlbum().solution(genres, plays);
        System.out.println("결과");
        for (int resul : result) {
            System.out.printf(resul + " ");
        }
    }

    public int[] solution(String[] genres, int[] plays) {
        // 1. genre 초기화
        Map<String, List<Music>> genreMap = new HashMap<>();
        for (int i = 0; i < genres.length; i++) {
            String genre = genres[i];
            List<Music> list = genreMap.getOrDefault(genre, new ArrayList<>());
            int play = plays[i];
            list.add(new Music(i, play, genre));
            genreMap.put(genre, list);
        }

        // 2. genre 의 value 값 정렬
        for (List<Music> value : genreMap.values()) {
            Collections.sort(value);
        }

        // 3. genre key 개당 장르 전체의 재생 회수로 정렬
        List<String> sortGenres = genreMap.keySet().stream()
                .sorted((s1, s2) -> {
                    return getGenrePlayTime(genreMap.get(s2)) - getGenrePlayTime(genreMap.get(s1));
                })
                .collect(Collectors.toList());

        // 4. 1 ~ 2개 꺼내 배열에 저장
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < sortGenres.size(); i++) {
            String genre = sortGenres.get(i);
            for (int j = 0; j < Math.min(genreMap.get(genre).size(), 2); j++) {
                answer.add(genreMap.get(genre).get(j).getId());
            }
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    public int getGenrePlayTime(List<Music> musics) {
        return musics.stream().mapToInt(m -> m.getPlayTime()).sum();
    }

}

class Music implements Comparable<Music> {
    private int id;
    private int playTime;
    private String genre;

    public Music(int id, int playTime, String genre) {
        this.id = id;
        this.playTime = playTime;
        this.genre = genre;
    }

    @Override
    public int compareTo(Music music) {
        return music.playTime - playTime;
    }

    public int getId() {
        return id;
    }

    public int getPlayTime() {
        return playTime;
    }

    public String getGenre() {
        return genre;
    }

}
//    static public int[] solution2(String[] genres, int[] plays) {
//        // 최종적으로 반환할 정답 리스트
//        List<Integer> answer = new ArrayList<>();
//
//        // 각 장르별 전체 재생 횟수를 저장하는 맵
//        Map<String, Integer> num = new HashMap<>();
//
//        // 각 장르에 속하는 노래와 재생 횟수를 저장하는 맵
//        Map<String, HashMap<Integer, Integer>> music = new HashMap<>();
//
//        // 입력 데이터를 기반으로 num 과 music 맵 초기화
//        for(int i = 0; i < plays.length; i++) {
//
//            // 새로운 장르인 경우
//            if(!num.containsKey(genres[i])) {
//                HashMap<Integer, Integer> map = new HashMap<>();
//                map.put(i, plays[i]);
//                music.put(genres[i], map);
//                num.put(genres[i], plays[i]);
//            }
//            // map 에 장르가 존재할 경우
//            else {
//                music.get(genres[i]).put(i, plays[i]);
//                num.put(genres[i], num.get(genres[i]) + plays[i]);
//            }
//        }
//
//        List<String> keySet = new ArrayList(num.keySet());
//        Collections.sort(keySet, (s1, s2) -> num.get(s2) - (num.get(s1)));
//
//        for(String key : keySet) {
//            HashMap<Integer, Integer> map = music.get(key);
//            List<Integer> genre_key = new ArrayList(map.keySet());
//
//            Collections.sort(genre_key, (s1, s2) -> map.get(s2) - (map.get(s1)));
//
//            answer.add(genre_key.get(0));
//            if(genre_key.size() > 1)
//                answer.add(genre_key.get(1));
//        }
//
//        return answer.stream().mapToInt(i -> i).toArray();
//    }
//}
