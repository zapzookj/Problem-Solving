class Solution {
    public String solution(int[] food) {
        String answer = "";
        for(int i = 1; i < food.length; i++){
            if(food[i] > 1){
                for(int j = 0; j<food[i]/2; j++){
                    answer += i;
                }
            }
        }
        StringBuilder reversed = new StringBuilder(answer);
        reversed.reverse();
        answer += 0;
        answer += reversed.toString();
        return answer;
    }
}