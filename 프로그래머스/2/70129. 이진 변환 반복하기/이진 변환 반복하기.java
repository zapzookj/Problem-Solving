import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = {0, 0};
        StringBuilder sb = new StringBuilder();
        while(s.length() > 1) {
            answer[0]++;
            char[] sArr = s.toCharArray();
            for(char sA : sArr) {
                if(sA == '0') {
                    answer[1]++;
                } else {sb.append('1');}
            }
            int c = sb.length();
            s = Integer.toBinaryString(c);
            sb.setLength(0);
        }
        return answer;
    }
}