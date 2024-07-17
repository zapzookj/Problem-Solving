import java.util.*;

class Solution {
    public int solution(int[][] targets) {
        // 미사일을 끝점 기준으로 정렬
        Arrays.sort(targets, (a, b) -> Integer.compare(a[1], b[1]));
        
        int count = 0;
        double lastShot = -1;
        
        for (int[] missile : targets) {
            // 현재 미사일의 시작점이 마지막 요격 지점보다 뒤에 있으면
            if (missile[0] > lastShot) {
                // 새로운 요격 미사일 발사
                count++;
                // 요격 지점을 현재 미사일의 끝점 바로 전으로 설정
                lastShot = missile[1] - 0.1;
            }
        }
        
        return count;
    }
}