class Solution {
    private final int MOD = 1234567;
    public int solution(int n) {
        return fibo(n);
    }
    
    public int fibo(int n) {
        if(n < 2) {
            return n;
        }
        
        int prev = 0;
        int current = 1;
        
        for (int i = 2; i <= n; i++) {
            int next = (prev + current) % MOD;
            prev = current;
            current = next;
        }
        
        return current;
    }
}