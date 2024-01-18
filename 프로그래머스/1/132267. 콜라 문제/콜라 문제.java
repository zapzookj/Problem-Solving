class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int temp = 0;
        
        while(n>=a){
            answer += b*(n/a); 
            temp = n%a; 
            n /= a; 
            n *= b;
            n += temp; 
        }
        return answer;
    }
}