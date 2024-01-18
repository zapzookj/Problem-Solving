import java.util.HashMap;
import java.util.Map;
class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int total = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 31);
        map.put(2, 29);
        map.put(3, 31);
        map.put(4, 30);
        map.put(5, 31);
        map.put(6, 30);
        map.put(7, 31);
        map.put(8, 31);
        map.put(9, 30);
        map.put(10, 31);
        map.put(11, 30);
        map.put(12, 31);
        for (int i = a - 1; i > 0; i--) {
            if (map.containsKey(i)) {
                total += map.get(i);
            }
        }

        total += b;
        total--;
        if(total % 7 == 0){
            answer = "FRI";
        }else if(total % 7 == 1){
            answer = "SAT";
        }else if(total % 7 == 2){
            answer = "SUN";
        }else if(total % 7 == 3){
            answer = "MON";
        }else if(total % 7 == 4){
            answer = "TUE";
        }else if(total % 7 == 5){
            answer = "WED";
        }else if(total % 7 == 6){
            answer = "THU";
        }
        
        
        return answer;
    }
}