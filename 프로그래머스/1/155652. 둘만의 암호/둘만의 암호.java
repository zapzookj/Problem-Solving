import java.util.ArrayList;
import java.util.List;
class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        List<Character> alphabetList = new ArrayList<>();
        char[] skipArr = skip.toCharArray();
        char[] sArr = s.toCharArray();
        for(char ch = 'a'; ch <= 'z'; ch++) { 
            if(skip.indexOf(ch) == -1) { 
                alphabetList.add(ch);
            }
        }
        for(int j = 0; j < sArr.length; j++) {
            int count = alphabetList.indexOf(sArr[j]);
            int get = (count+index) % (alphabetList.size());
            answer += alphabetList.get(get);
        }
        
        return answer;
    }
}