class Solution {
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        boolean zeroFirstRow = false;
        boolean zeroFirstCol = false;

        // Check whether the first row needs to be zeroed
        for (int col = 0; col < cols; col++) {
            if (matrix[0][col] == 0) {
                zeroFirstRow = true;
                break;
            }
        }

        // Check whether the first column needs to be zeroed
        for (int row = 0; row < rows; row++) {
            if (matrix[row][0] == 0) {
                zeroFirstCol = true;
                break;
            }
        }

        // Mark rows and columns that need to be zeroed
        for (int row = 1; row < rows; row++) {
            for (int col = 1; col < cols; col++) {
                if (matrix[row][col] == 0) {
                    matrix[row][0] = 0;
                    matrix[0][col] = 0;
                }
            }
        }

        // Zero marked rows
        for (int row = 1; row < rows; row++) {
            if (matrix[row][0] == 0) {
                for (int col = 1; col < cols; col++) {
                    matrix[row][col] = 0;
                }
            }
        }

        // Zero marked columns
        for (int col = 1; col < cols; col++) {
            if (matrix[0][col] == 0) {
                for (int row = 1; row < rows; row++) {
                    matrix[row][col] = 0;
                }
            }
        }

        // Zero the first row and column if needed
        if (zeroFirstRow) {
            for (int col = 0; col < cols; col++) {
                matrix[0][col] = 0;
            }
        }

        if (zeroFirstCol) {
            for (int row = 0; row < rows; row++) {
                matrix[row][0] = 0;
            }
        }
    }
}
