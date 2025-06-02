import java.util.*;

class Solution {
    public int solution(int[] nums) {
        List<Integer> list = new ArrayList<>();
        
        for (int num : nums) {
            list.add(num);
        }
        
        Set<Integer> set = new HashSet<>(list);
        
        int typeNum = set.size();
        int possibleNum = nums.length / 2; 
        
        return Math.min(typeNum, possibleNum);
    }
}