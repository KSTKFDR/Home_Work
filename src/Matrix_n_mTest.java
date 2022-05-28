import org.junit.Test;

import static org.junit.Assert.*;

public class Matrix_n_mTest {

    @Test
    public void getMatrix() {
        Matrix_n_m testGetMatrix = new Matrix_n_m();
        assertArrayEquals(new int[]{1, 1, 1}, testGetMatrix.getMatrix()[0]);
        assertArrayEquals(new int[]{1, 1, 1}, testGetMatrix.getMatrix()[1]);
        assertArrayEquals(new int[]{1, 1, 1}, testGetMatrix.getMatrix()[2]);
    }

    @Test
    public void getSizeN() {
        Matrix_n_m testGetSizeN = new Matrix_n_m();
        assertEquals(4, testGetSizeN.getSizeN());
    }

    @Test
    public void getSizeM() {
        Matrix_n_m testGetSizeM = new Matrix_n_m();
        assertEquals(3, testGetSizeM.getSizeM());
    }

    @Test
    public void getMatrixElement() {
        Matrix_n_m testGetMatrixElement = new Matrix_n_m();
        assertEquals(1, testGetMatrixElement.getMatrixElement(2, 2));
    }

    @Test
    public void setMatrixElement() {
        Matrix_n_m testSetMatrixElement = new Matrix_n_m();
        assertArrayEquals(new int[]{1, 1, 2}, testSetMatrixElement.setMatrixElement(2, 2, 2)[2]);
    }
    @Test
    public void addMatrixElement() {
        Matrix_n_m testAddMatrixElement = new Matrix_n_m();
        assertArrayEquals(new int[][] {{2, 2, 2}, {2, 2, 2}, {2, 2, 2}, {2, 2, 2}}, testAddMatrixElement.getAddMatrix(new int[][] {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}, {1, 1, 1}}));
    }
    @Test
    public void multiplyMatrixElement() {
        Matrix_n_m testMultiplyMatrixElement = new Matrix_n_m();
        assertArrayEquals(new int[][] {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}, {1, 1, 1}}, testMultiplyMatrixElement.getMultiplicationMatrix(new int[][] {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}, {1, 1, 1}}));
    }
}