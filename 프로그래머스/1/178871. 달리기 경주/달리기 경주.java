import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = new String[players.length];
        List<String> playerList = new ArrayList<>();
        Map<String, Integer> playerIndexMap = new HashMap<>();

        for (int i = 0; i < players.length; i++) {
            playerList.add(players[i]);
            playerIndexMap.put(players[i], i);
        }

        for (String calling : callings) {
            int index = playerIndexMap.get(calling);
            if (index > 0) { // 첫 번째 요소가 아닌 경우에만 수행
                String temp = playerList.get(index - 1);
                playerList.set(index - 1, calling);
                playerList.set(index, temp);
            
                // 맵 업데이트
                playerIndexMap.put(calling, index - 1);
                playerIndexMap.put(temp, index);
            }
        }

        for (int i = 0; i < playerList.size(); i++) {
            answer[i] = playerList.get(i);
        }
        return answer;
    }
}