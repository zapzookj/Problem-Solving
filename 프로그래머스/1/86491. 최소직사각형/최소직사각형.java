class Solution {
    public int solution(int[][] sizes) {
        int maxRow = 0;
        int maxCol = 0;
        for(int i = 0; i < sizes.length; i++) {
            int w = Math.max(sizes[i][0], sizes[i][1]);
            maxRow = Math.max(maxRow, w);
            int h = Math.min(sizes[i][0], sizes[i][1]);
            maxCol = Math.max(maxCol, h);
        }
        return maxRow * maxCol;
    }
}
// 가장 큰 가로의 길이, 가장 큰 세로의 길이를 각각 구해서 곱하면 되지만, 문제는 눕혀야 하는 명함이 있다는 것이다.
// 눕혀야 하는 명함이 발생하는 이유는, 가로가 세로보다 큰 명함과 세로가 가로보다 큰 명함이 섞여있기 때문
// 모든 명함이 세로가 가로보다 크도록 통일시킨다면 그러한 경우를 고려할 필요가 없어짐(Math.min, Math.max 메서드 사용)