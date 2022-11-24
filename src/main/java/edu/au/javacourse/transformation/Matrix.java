package edu.au.javacourse.transformation;


public class Matrix {
    private double[][] data;
    public Matrix(double[][] data) {
        this.data = data;
    }
    public double getValue(int row, int column) {
        return this.data[row][column];
    }
    private int rowsCount() {
        return data.length;
    }
    private int columnsCount() {
        return data[0].length;
    }
    public Matrix multiply(Matrix other) {
        int rowsInResult = this.rowsCount();
        int columnsInResult = other.columnsCount();
        int lengthToBeEaten = this.columnsCount();
        double[][] protoResult = new double[rowsInResult][columnsInResult];

        for (int i = 0; i < rowsInResult; i++) {
            for (int j = 0; j < columnsInResult; j++) {
                double currentSum = .0;

                for (int k = 0; k < lengthToBeEaten; k++) {
                    currentSum += this.getValue(i, k) * other.getValue(k, j);
                }

                protoResult[i][j] = currentSum;
            }
        }

        return new Matrix(protoResult);
    }
}
