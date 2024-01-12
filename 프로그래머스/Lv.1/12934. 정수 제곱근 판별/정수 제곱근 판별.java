class Solution {
    public long solution(long n) {
        long answer = -1;
        long nRoot = (long) Math.sqrt(n);
        if(nRoot*nRoot == n){
            answer = (nRoot + 1) * (nRoot + 1);
        }
        
        return answer;
    }
}