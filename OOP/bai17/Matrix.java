package Files.OOP.bai17;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix {
    public int Column;
    public int Row;
    public int[][] MatrixData;

    public int getColumn() {
        return Column;
    }

    public void setColumn(int column) {
        Column = column;
    }

    public int getRow() {
        return Row;
    }

    public void setRow(int row) {
        Row = row;
    }

    public int[][] getMatrixData() {
        return MatrixData;
    }

    public void setMatrixData(int[][] matrixData) {
        MatrixData = matrixData;
    }

    public void PrintMatrix() {
        System.out.println("Matrix:");
        for (int[] row : MatrixData) {
            System.out.print("|");
            for (int column : row) {
                System.out.printf(" %d ", column);
            }
            System.out.println("|");
        }
    }

    public Matrix(int row, int column, int[][] matrixData) {
        Row = row;
        Column = column;
        MatrixData = matrixData;
    }

    public Matrix() {
        Scanner inputReader = new Scanner(System.in);
        System.out.print("input row number: ");
        Row = inputReader.nextInt();
        inputReader.nextLine();
        System.out.print("input column number: ");
        Column = inputReader.nextInt();
        inputReader.nextLine();
        System.out.println("input matrix: ");
        MatrixData = new int[Row][Column];
        for (int i = 0; i < Row; i++) {
            System.out.println("input row " + (i + 1));
            for (int j = 0; j < Column; j++) {
                System.out.println("input element column " + (j + 1) + ": ");
                MatrixData[i][j] = inputReader.nextInt();
                inputReader.nextLine();
            }
        }
    }

    public Matrix initMatrix(int row, int column) {
        int[][] newData = new int[row][column];
        Matrix newMatrix = new Matrix(row, column, newData);
        return newMatrix;
    }

    public static Matrix sumMatrix(Matrix m1, Matrix m2) {
        Matrix sum = new Matrix(m1.getRow(), m1.getColumn(), m1.getMatrixData());
        for (int i = 0; i < m1.getRow(); i++) {
            for (int j = 0; j < m1.getColumn(); j++) {
                sum.getMatrixData()[i][j] = m1.getMatrixData()[i][j] + m2.getMatrixData()[i][j];
            }
        }
        return sum;
    }


}
