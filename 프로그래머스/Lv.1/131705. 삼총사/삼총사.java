class Solution {
    public int solution(int[] number) {
        int answer = 0;
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        for(int i = 0; i < number.length; i++){
            num1 = number[i];
            for(int j = i + 1; j < number.length; j++){
                num2 = number[j];
                for(int z = j + 1; z < number.length; z++){
                    num3 = number[z];
                    if(num1+num2+num3 == 0){
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}