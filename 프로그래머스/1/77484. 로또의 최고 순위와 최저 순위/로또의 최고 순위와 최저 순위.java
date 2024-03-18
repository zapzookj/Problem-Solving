import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        Arrays.sort(lottos);
        Arrays.sort(win_nums);
        
        int zeroCount = 0; 
        int matchCount = 0; 
        
        for (int lotto : lottos) {
            if (lotto == 0) {
                zeroCount++;
                continue;
            }
            for (int win_num : win_nums) {
                if (lotto == win_num) {
                    matchCount++;
                    break;
                }
            }
        }

        int maxRank = getRank(matchCount + zeroCount); // 최대 순위 (가능한 모든 0이 당첨번호와 일치한다고 가정)
        int minRank = getRank(matchCount); // 최소 순위 (0이 당첨번호와 일치하지 않는다고 가정)

        return new int[]{maxRank, minRank};
    }

    private int getRank(int matchCount) {
        switch (matchCount) {
            case 6: return 1;
            case 5: return 2;
            case 4: return 3;
            case 3: return 4;
            case 2: return 5;
            default: return 6; // 1개 이하로 일치하거나 하나도 일치하지 않는 경우
        }
    }
}