import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int count = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i : scoville) {
            pq.add(i);
        }
        
        while(pq.size() >= 2 && pq.peek() < K) {
            int minScov1 = pq.poll();
            int minScov2 = pq.poll();
            
            pq.add(minScov1 + minScov2 * 2);
            count++;
        }
        if (pq.peek() != null && pq.peek() >= K) return count;
        return -1;
    }
}