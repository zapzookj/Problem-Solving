import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length-1];
        if(answer.length == 0){return new int[]{-1};}
        int min = 9999999;
        int min_num = 0;
        int count = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] < min){
                min = arr[i];
                min_num = i;
            }
        }
        for(int i = 0;i<arr.length;i++){
            if(i == min_num){continue;}
            answer[count] = arr[i];
            count++;
        }
        return answer;
    }
}