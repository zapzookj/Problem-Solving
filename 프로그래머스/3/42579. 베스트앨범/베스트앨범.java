import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        Map<String, Integer> genrePlays = new HashMap<>();
        Map<String, List<int[]>> genreSongs = new HashMap<>();
        
        for (int i = 0; i < genres.length; i++) {
            String genre = genres[i];
            int play = plays[i];
            
            genrePlays.put(genre, genrePlays.getOrDefault(genre, 0) + play);
            
            genreSongs.putIfAbsent(genre, new ArrayList<>());
            genreSongs.get(genre).add(new int[]{play, i});
        }
        
        List<String> sortedGenres = new ArrayList<>(genrePlays.keySet());
        sortedGenres.sort((a, b) -> genrePlays.get(b) - genrePlays.get(a));
        
        List<Integer> result = new ArrayList<>();
        
        for (String genre : sortedGenres) {
            List<int[]> songs = genreSongs.get(genre);
            
            songs.sort((a, b) -> {
                if (b[0] != a[0]) return b[0] - a[0];
                return a[1] - b[1];
            });
            
            for (int i = 0; i< Math.min(2, songs.size()); i++) {
                result.add(songs.get(i)[1]);
            }
        }
        
        return result.stream().mapToInt(i -> i).toArray();
    }
}