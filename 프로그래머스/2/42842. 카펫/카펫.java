class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int block = brown + yellow;
        int row = 0;
        int col = 0;
        
        for (int i = 3; i <= Math.sqrt(block); i++) {
            if (block % i == 0) {
                row = i;
                col = block / i;
                if ((row - 2) * (col - 2) == yellow) {
                answer[0] = col;
                answer[1] = row;
                return answer;
                }
            }
            
        }
        
        return answer;
    }
}