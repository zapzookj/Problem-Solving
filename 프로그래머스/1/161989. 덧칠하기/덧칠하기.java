import java.util.List;
import java.util.ArrayList;
class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int i = 0;

        while (i < section.length) {
            int startSection = section[i];
            int endSection = startSection + m - 1; 
            answer++; 
            
            while (i < section.length && section[i] <= endSection) {
                i++;
            }
        }

        return answer;
    }
}
