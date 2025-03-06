import java.util.*;
class Solution {
    public Set<Integer> solution(int[] numbers) {
        Set<Integer> result = new TreeSet<>();
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                result.add(numbers[i] + numbers[j]);
            }
        }
        
        return result;
    }
}
// 리스트도 배열과 마찬가지로 sort 메서드를 사용할 수 있다. Collections.sort()