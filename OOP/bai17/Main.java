package Files.OOP.bai17;

public class Main {
    public static void main(String[] args) {
        Matrix m1 = new Matrix();
        int[][] mTemp = new int[][]{
                {3, 4},
                {5, 6}
        };
        Matrix m2 = new Matrix(2, 2, mTemp);
        m1.PrintMatrix();
        m2.PrintMatrix();
        Matrix.sumMatrix(m1, m2).PrintMatrix();
    }
}
