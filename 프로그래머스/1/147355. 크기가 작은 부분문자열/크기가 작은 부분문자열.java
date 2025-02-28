import java.math.*;
class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int pLength = p.length();
        BigInteger pNum = new BigInteger(p); 

        for (int i = 0; i <= t.length() - pLength; i++) { 
            String sub = t.substring(i, i + pLength);
            BigInteger subNum = new BigInteger(sub); 

            if (subNum.compareTo(pNum) <= 0) {
                answer++;
            }
        }
        return answer;
    }
}