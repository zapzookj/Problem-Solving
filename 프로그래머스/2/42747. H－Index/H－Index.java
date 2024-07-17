import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        int n = citations.length;
        for (int h = n; h > 0; h--) {
            if (citations[n - h] >= h) {
                return h;
            }
        }
        return answer;
    }
}