import java.util.*;

class Solution {
    public int solution(int[] elements) {
        int n = elements.length;
        int[] extendedElements = new int[n * 2];
        
        // 원형 수열을 표현하기 위해 배열을 두 번 반복
        for (int i = 0; i < n; i++) {
            extendedElements[i] = extendedElements[i + n] = elements[i];
        }
        
        // 누적 합 계산
        int[] prefixSum = new int[n * 2 + 1];
        for (int i = 1; i <= n * 2; i++) {
            prefixSum[i] = prefixSum[i - 1] + extendedElements[i - 1];
        }
        
        Set<Integer> sums = new HashSet<>();
        
        // 모든 가능한 부분 수열의 합 계산
        for (int len = 1; len <= n; len++) {
            for (int start = 0; start < n; start++) {
                int sum = prefixSum[start + len] - prefixSum[start];
                sums.add(sum);
            }
        }
        
        return sums.size();
    }
}