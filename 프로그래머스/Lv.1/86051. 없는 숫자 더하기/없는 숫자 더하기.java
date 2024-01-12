import java.util.ArrayList;
import java.util.List;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        List<Integer> numberList = new ArrayList<>();
        for (int number : numbers) {
            numberList.add(number);
        }
        for(int i = 0;i<10; i++){
            if(!numberList.contains(i)){
                answer += i;
            }
        }
        return answer;
    }
}