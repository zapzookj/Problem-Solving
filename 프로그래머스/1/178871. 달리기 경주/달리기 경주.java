import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = new String[players.length];
        Map<String, Integer> rankMap = new HashMap<>();
        List<String> playerList = new ArrayList<>();
        
        for (int i = 1; i <= players.length; i++) {
            rankMap.put(players[i-1], i);
            playerList.add(players[i-1]);
        }
        for (int i = 0; i < callings.length; i++) {
            Integer tempRank = rankMap.get(callings[i]); // 호명된 선수의 원래 등수
            String tempPlayer = playerList.get(tempRank - 2); // 호명된 선수에게 추월당한 선수
            playerList.set(tempRank - 2, callings[i]); // 호명된 선수를 추월당한 선수의 위치로 옮김
            playerList.set(tempRank -1, tempPlayer); // 추월당한 선수를 호명된 선수의 위치로 옮김
            rankMap.put(callings[i], tempRank-1); // rankMap도 변경
            rankMap.put(tempPlayer, tempRank);
        }
        for (int i = 0; i < answer.length; i++) {
            answer[i] = playerList.get(i);
        }
      
        return answer;
    }
}