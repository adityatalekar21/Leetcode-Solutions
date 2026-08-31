class Solution {
    public int oddCells(int m, int n, int[][] indices) {

        int[][] matrix = new int[m][n];

        // Increase rows and columns
        for (int i = 0; i < indices.length; i++) {

            int row = indices[i][0];
            int column = indices[i][1];

            // Increase the selected row
            for (int j = 0; j < n; j++) {
                matrix[row][j]++;
            }

            // Increase the selected column
            for (int j = 0; j < m; j++) {
                matrix[j][column]++;
            }
        }

        // Count odd values
        int count = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (matrix[i][j] % 2 != 0) {
                    count++;
                }
            }
        }

        return count;
    }
}