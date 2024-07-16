import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] part = s.split(" ");
        TreeSet<Integer> set = new TreeSet<>();
        for(String p : part) {
            Integer num = Integer.parseInt(p);
            set.add(num);
        }
        answer = String.valueOf(set.first()) + " " + String.valueOf(set.last());
        return answer;
    }
}