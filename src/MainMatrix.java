public class MainMatrix {
    public static void main(String[] args) {
        Matrix_n_m matrix = new Matrix_n_m();
        matrix.getMatrix();
        matrix.getSizeN();
        matrix.getSizeM();
        matrix.getMatrixElement(2, 2);
        matrix.setMatrixElement(2, 2, 2);
        matrix.getAddMatrix(new int[][]{{1, 1, 1}, {1, 1, 1}, {1, 1, 1}, {1, 1, 1}});
        matrix.getMultiplicationMatrix(new int[][]{{1, 1, 1}, {1, 1, 1}, {1, 1, 1}, {1, 1, 1}});
    }
}
