class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        if(a<b){
            for(int i = a;i<=b;i++){
                answer += i;
            }
        }else if(b<a){
            for(int j = b;j<=a;j++){
                answer += j;
            }
        }else{answer = a;}
        return answer;
    }
}