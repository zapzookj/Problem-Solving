import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length]; 
        
        for (int i = 0; i < commands.length; i++) {
            int[] subArray = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
            Arrays.sort(subArray);
            answer[i] = subArray[commands[i][2] - 1];
        }
        
        return answer;
    }
}

// Arrays.copyOfRange(arr, x, y) : 배열을 x부터 y전까지 자르는 메서드