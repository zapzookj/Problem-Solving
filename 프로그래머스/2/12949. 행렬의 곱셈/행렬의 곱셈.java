class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int m = arr1.length, n = arr1[0].length, p = arr2[0].length;
    int[][] C = new int[m][p];
    for (int i = 0; i < m; i++)
        for (int j = 0; j < p; j++)
            for (int k = 0; k < n; k++)
                C[i][j] += arr1[i][k] * arr2[k][j];
    return C;
    }
}