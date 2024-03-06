import java.util.ArrayList;
import java.util.List;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        
        for(int i = 0; i < targets.length; i++) {
            int total = 0;
            boolean Possible = true;
            char[] arr = targets[i].toCharArray();
            for(char target : arr) {
                int minIndex = 10000;
                for(int z = 0; z < keymap.length; z++) {
                    int index = keymap[z].indexOf(target) + 1;
                    if(index > 0) minIndex = Math.min(minIndex, index);
                }
                if(minIndex == 10000) {
                    Possible = false;
                    break;
                } else {
                    total += minIndex;
                }
            }
            if(!Possible) {
                answer[i] = -1;
            } else {
                answer[i] = total;
            }
        }
        
        return answer;
    }
}