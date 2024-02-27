import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        List<Integer> lostList = new ArrayList<>();
        List<Integer> reserveList = new ArrayList<>();

        // 초기화
        for (int num : lost) lostList.add(num);
        for (int num : reserve) reserveList.add(num);
        
        Collections.sort(lostList);
        Collections.sort(reserveList);

        // 여벌의 체육복을 가져온 학생이 도난당한 경우
        lostList.removeIf(lostNum -> reserveList.remove(Integer.valueOf(lostNum)));

        // 도난당한 학생에게 체육복 빌려주기
        int cut = 0;
        for (Integer lostNum : new ArrayList<>(lostList)) {
            for (int j = 0; j < reserveList.size(); j++) {
                if (Math.abs(reserveList.get(j) - lostNum) == 1) {
                    cut++;
                    reserveList.remove(j);
                    break; // 해당 학생에게 체육복을 빌려준 후 루프 종료
                }
            }
        }

        return n - lostList.size() + cut;
    }
}