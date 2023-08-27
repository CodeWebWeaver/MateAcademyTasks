package testing;

import java.util.Arrays;

public class SquareMatrixMultiplication {
  public static int[][] multiplySquareMatrices(int[][] a, int[][] b) {
    int matrixLength = a.length;
    int[][] c = new int[matrixLength][matrixLength];
    int sum;
    for (int i = 0; i < matrixLength; i++) {
      for (int j = 0; j < matrixLength; j++) {
        sum = 0;
        for (int k = 0; k < matrixLength; k++) {
          sum += a[i][k] * b[k][j];
        }
        c[i][j] = sum;
      }
    }
    return c;
  }

  public static void main(String[] args) {
    int[][] a = {{1,2},{3,1}};
    int[][] b = {{2,1},{1,3}};
    System.out.println(Arrays.deepToString(multiplySquareMatrices(a, b)));
  }
}
