package september2024;

public class OneToTwoD_Conversion2022 {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if (m*n != original.length){
            return new int[0][0];
        }
        int res[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                res[i][j] = original[i];
            }
        }
        return res;
    }
}
