import java.util.Arrays;

class Solution {
    public int[] solution(long n) {
        int size = 0;
        int i = 0;
        long origin = n;
        int origin2 = (int)n;
        while(origin > 0){
            origin /= 10;
            size++;
        }
        int[] answer = new int[size];
        while(n > 0){
            answer[i] =  (int) (n % 10);
            n /= 10;
            i++;
        }
        return answer;
    }
}