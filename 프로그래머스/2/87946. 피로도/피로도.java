class Solution {
    static boolean[] visited;
    static int max = 0;
    
    public int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];
        explore(k, dungeons, 0);
        return max;
    }
    
    private static void explore(int k, int[][] dungeons, int count) {
        max = Math.max(max, count);
        
        for (int i = 0; i < dungeons.length; i++) {
            if (!visited[i] && k >= dungeons[i][0]) {
                visited[i] = true;
                explore(k - dungeons[i][1], dungeons, count + 1);
                visited[i] = false;
            }
        }
    }
}