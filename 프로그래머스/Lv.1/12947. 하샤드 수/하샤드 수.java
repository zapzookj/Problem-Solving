import java.util.Arrays;

class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int temp = x;
        int num = 0;
        
        while(temp>0){
            num += temp % 10;
            temp /= 10;
        }
        if(x % num != 0){answer = false;}
        return answer;
    }
}