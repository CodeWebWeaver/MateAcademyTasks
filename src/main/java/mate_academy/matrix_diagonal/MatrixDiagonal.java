package mate_academy.matrix_diagonal;

public class MatrixDiagonal {
    public int[] getDiagonal(int[][] matrix) {

        int matrixRowSize = matrix[0].length;
        int[] diagonal = new int[matrixRowSize];

        for (int i = 0; i < matrixRowSize; i++) {
            for (int j = 0; j < matrixRowSize; j++) {
                if (j == i) {
                    diagonal[i] = matrix[i][j];
                }
            }
        }
        return diagonal;
    }

    public int[] getCounterDiagonal(int[][] matrix) {
        int matrixRowSize = matrix[0].length;
        int[] diagonal = new int[matrixRowSize];

        for (int i = 0; i < matrixRowSize; i++) {
            diagonal[i] = matrix[i][matrixRowSize - i - 1];
        }
        return diagonal;
    }
}
