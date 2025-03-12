import java.util.*;
class Solution {
    public int solution(int n, int m, int[] section) {
        int result = 0;
        
        while (section.length > 0) {
            int cover = section[0] + m - 1;
            section = Arrays.stream(section)
                .filter(num -> num > cover)
                .toArray();
            result++;
        }
        
        return result;
    }
}
