import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] result = new int[2];
        int max = 0;
        int min = 0;
        
        Set<Integer> set = new HashSet<>();
        for (int num : win_nums) {
            set.add(num);
        }
        
        for(int lot : lottos) {
            if (set.contains(lot)) {
                max++;
                min++;
            } else if (lot == 0) {
                max++;
            }
        }
        
        switch (max) {
            case 0:
                result[0] = 6;
                break;
            case 1:
                result[0] = 6;
                break;
            case 2:
                result[0] = 5;
                break;
            case 3:
                result[0] = 4;
                break;
            case 4:
                result[0] = 3;
                break;
            case 5:
                result[0] = 2;
                break;
            case 6:
                result[0] = 1;
                break;
        }
        
        switch (min) {
            case 0:
                result[1] = 6;
                break;
            case 1:
                result[1] = 6;
                break;
            case 2:
                result[1] = 5;
                break;
            case 3:
                result[1] = 4;
                break;
            case 4:
                result[1] = 3;
                break;
            case 5:
                result[1] = 2;
                break;
            case 6:
                result[1] = 1;
                break;
        }
        
        return result;
    }
}