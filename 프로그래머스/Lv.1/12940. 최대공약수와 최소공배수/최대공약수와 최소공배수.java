class Solution {
    public int[] solution(int n, int m) {
        int[] answer = {0, 0};
        int tempN = n;
        int tempM = m;
        int maxGong = 0;
        int minGong = 0;

        while (m != 0) {
            int temp = n;
            n = m;
            m = temp % m;
        }

        maxGong = n;
        minGong = (tempN * tempM) / maxGong;

        answer[0] = maxGong;
        answer[1] = minGong;
        return answer;
    }
}