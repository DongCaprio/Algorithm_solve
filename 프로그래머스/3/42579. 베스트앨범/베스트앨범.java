import java.util.ArrayList;
import java.util.HashMap;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        ArrayList<Integer> answer = new ArrayList<>();
        //https://hy-ung.tistory.com/102 참고

        // 장르별 숫자 비교
        HashMap<String, Integer> genreCount = new HashMap<>();
        for(int i=0; i< genres.length; i++){
            genreCount.put(genres[i], genreCount.getOrDefault(genres[i], 0) + plays[i]);
        }
        ArrayList<String> genreSortArr = new ArrayList<>();
        for(String key : genreCount.keySet()){
            genreSortArr.add(key);
        }
        genreSortArr.sort((o1, o2) -> genreCount.get(o2) - genreCount.get(o1));

        for(String genre : genreSortArr){
            ArrayList<Movie> movies = new ArrayList<>();
            for(int i=0; i<genres.length; i++){
                if(genre.equals(genres[i])) movies.add(new Movie(i, plays[i]));
            }

            movies.sort((o1, o2) -> o1.play == o2.play ? o1.idx - o2.idx : o2.play - o1.play);

            answer.add(movies.get(0).idx);
            if (movies.size() >= 2) answer.add(movies.get(1).idx);
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    public class Movie{
        int idx;
        int play;

        public Movie(int idx, int play) {
            this.idx = idx;
            this.play = play;
        }
    }
}