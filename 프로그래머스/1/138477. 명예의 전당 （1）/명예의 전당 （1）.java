import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
class Solution {
    public List solution(int k, int[] score) {
        List<Integer> answer = new ArrayList<>();
        List<Integer> jundang = new ArrayList<>();
        for(int i = 0; i<score.length; i++){
            jundang.add(score[i]);
            Collections.sort(jundang);
            Collections.reverse(jundang);
            if(i<k){
                answer.add(jundang.get(i));
            }else{
                answer.add(jundang.get(k-1));
            }
        }
        return answer;
    }
}