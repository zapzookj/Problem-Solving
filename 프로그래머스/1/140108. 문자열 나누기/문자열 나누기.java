import java.util.ArrayList;
import java.util.List;
class Solution {
    public int solution(String s) {
        int answer = 0;
        char[] arr = s.toCharArray();
        List<Character> tempList = new ArrayList<>();
        int temp = 0;
        int xNum = 0;
        int otherNum = 0;
        char x = arr[0];
        for(int i = 0; i<arr.length; i++){
            tempList.add(arr[i]);
            temp = tempList.size() - 1;
            if(tempList.get(temp) == x){
                xNum++;
            }else{
                otherNum++;
            }
            if(xNum == otherNum){
                    answer++;
                    xNum = 0;
                    otherNum = 0;
                    tempList.clear();
                    if(i < arr.length-1){
                        x = arr[i+1];
                    }
                }else if(i == arr.length-1){
                answer++;
            }
        }
        return answer;
    }
}