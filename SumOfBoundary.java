public class SumOfBoundary {

  public static void main(String[] args) {
    int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 6, 5, 7 } };
    int numRows = matrix.length;
    int numCols = matrix[0].length;
    int sumOfBoundary = 0;

    for (int i = 0; i < numRows; i++) {
      for (int j = 0; j < numCols; j++) {
        if (i == 0 || j == 0 || i == numRows - 1 || j == numCols - 1) {
          sumOfBoundary += matrix[i][j];
        }
      }
    }

    System.out.println(sumOfBoundary);
  }
}
