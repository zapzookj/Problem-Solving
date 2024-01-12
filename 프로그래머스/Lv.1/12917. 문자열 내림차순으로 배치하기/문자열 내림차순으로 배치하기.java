import java.util.Arrays;
class Solution {
    public String solution(String s) {
        String answer = "";
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        char temp = '1';
        for(int i = 0; i<arr.length / 2; i++){
            temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
        answer = new String(arr);
        return answer;
    }
}