import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
 
        for(int i = score.length; i >= m; i -= m){
            answer += m * score[i - m];
        }
        return answer;
    }
}