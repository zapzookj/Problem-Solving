import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i = 0; i < commands.length; i++){
            int num1 = commands[i][0];
            int num2 = commands[i][1];
            int num3 = commands[i][2];
            int[] subArray = new int[num2 - num1 + 1];
            for(int j = num1, z = 0; j<=num2; j++, z++){
                subArray[z] = array[j-1];
            }
            Arrays.sort(subArray);
            answer[i] = subArray[num3 - 1];
        }
        
        return answer;
    }
}