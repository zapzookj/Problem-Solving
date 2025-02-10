import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<int[]> queue = new LinkedList<>();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i=0;i<priorities.length;i++) {
            queue.add(new int[]{priorities[i], i});
            priorityQueue.add(priorities[i]);
        }
        
        int order = 0;
        
        while(!queue.isEmpty()) {
            int[] current = queue.poll();
            
            if(current[0] < priorityQueue.peek()) {
                queue.add(current);
            } else {
                order++;
                priorityQueue.poll();
                
                if (current[1] == location) {
                    return order;
                }
            }
        }
        return -1;
    }
}