import java.util.*;
class Solution {
    public List solution(int k, int[] score) {
        List<Integer> jundang = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        
        for(int i = 0; i < score.length; i++) {
            jundang.add(score[i]);
            jundang.sort(Comparator.reverseOrder());
            if (i < k) {
                result.add(jundang.get(i));
            } else {
                result.add(jundang.get(k-1));
            }
        }
        
        return result;
    }
}

//Collections.reverse() 메서드를 통해 오름차순으로 나열된 리스트를 뒤집어 내림차순으로 정렬할 수 있다.