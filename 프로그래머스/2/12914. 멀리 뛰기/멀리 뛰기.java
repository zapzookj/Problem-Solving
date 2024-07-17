class Solution {
    public long solution(int n) {
        long answer = 0;
        if(n < 1) {
            return 0;
        }else if(n < 2) {
            return 1;
        }
        int prev = 0;
        int current = 1;
        for(int i = 0; i < n; i++) {
            int next = (prev + current) % 1234567; // 2
            prev = current; // 1
            current = next; // 1
        }
        return current;
    }
}