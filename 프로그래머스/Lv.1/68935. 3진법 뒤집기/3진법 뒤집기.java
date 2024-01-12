import java.util.ArrayList;
import java.util.List;
class Solution {
    public int solution(int n) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        for(int i = 3; n>0; n /= i){
            list.add(n%i);
        }
        for(int i = 0; i<list.size(); i++){
            answer += list.get(list.size()-i-1) * Math.pow(3, i);
        }
        return answer;
    }
}