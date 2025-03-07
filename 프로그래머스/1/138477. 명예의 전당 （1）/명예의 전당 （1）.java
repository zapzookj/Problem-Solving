import java.util.*;
class Solution {
    public List solution(int k, int[] score) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        List<Integer> result = new ArrayList<>();
        
        for(int i = 0; i < score.length; i++) {
            pq.offer(score[i]);
            
            if (pq.size() > k) {
                pq.poll();
            }
            result.add(pq.peek());
        }
        
        return result;
    }
}

//Collections.reverse() 메서드를 통해 오름차순으로 나열된 리스트를 뒤집어 내림차순으로 정렬할 수 있다.