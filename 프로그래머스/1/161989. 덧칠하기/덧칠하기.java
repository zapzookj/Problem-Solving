import java.util.*;
class Solution {
    public int solution(int n, int m, int[] section) {
        int result = 1;
        int roller = section[0];
        
        for (int i = 0; i < section.length; i++) {
            if (roller + m - 1 < section[i]) {
                result++;
                roller = section[i];
            }
        }
        
        return result;
    }
}
