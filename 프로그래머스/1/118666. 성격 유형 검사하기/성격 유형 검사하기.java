import java.util.HashMap;
import java.util.Map;
class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        Map<Character, Integer> map = new HashMap<>();
        map.put('A', 0);
        map.put('N', 0);
        map.put('C', 0);
        map.put('F', 0);
        map.put('M', 0);
        map.put('J', 0);
        map.put('R', 0);
        map.put('T', 0);
        for(int i = 0; i < survey.length; i++) {
            int num = map.get(survey[i].charAt(1));
            num += choices[i] - 4;
            map.put(survey[i].charAt(1), num);
        }
        char an = map.get('A') >= map.get('N') ? 'A' : 'N';
        char cf = map.get('C') >= map.get('F') ? 'C' : 'F';
        char jm = map.get('J') >= map.get('M') ? 'J' : 'M';
        char rt = map.get('R') >= map.get('T') ? 'R' : 'T';
        answer = "" + rt + cf + jm + an;
        return answer;
    }
}