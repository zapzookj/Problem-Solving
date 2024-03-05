import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        List<Integer> lostList = new ArrayList<>();
        List<Integer> reserveList = new ArrayList<>();

        for (int num : lost) lostList.add(num);
        for (int num : reserve) reserveList.add(num);
        
        Collections.sort(lostList);
        Collections.sort(reserveList);
        
        lostList.removeIf(lostNum -> reserveList.remove(Integer.valueOf(lostNum)));

        int cut = 0;
        for (Integer lostNum : new ArrayList<>(lostList)) {
            for (int j = 0; j < reserveList.size(); j++) {
                if (Math.abs(reserveList.get(j) - lostNum) == 1) {
                    cut++;
                    reserveList.remove(j);
                    break;
                }
            }
        }

        return n - lostList.size() + cut;
    }
}