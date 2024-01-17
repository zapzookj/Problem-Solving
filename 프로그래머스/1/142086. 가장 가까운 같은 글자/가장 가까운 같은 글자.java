import java.util.ArrayList;
import java.util.List;
class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        char[] arr = s.toCharArray();
        List<Character> list = new ArrayList<>();
        for(int i = 0; i<arr.length; i++){
            if(!list.contains(arr[i])){
                answer[i] = -1;
            }else{
                for(int j = i-1; j>=0; j--){
                    if(arr[j] == arr[i]){
                        answer[i] = i - j;
                        break;
                    }
                }
            }
            list.add(arr[i]);
        }
        return answer;
    }
}