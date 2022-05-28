public class Matrix_n_m {
    int[][] matrix = {
            {1, 1, 1},
            {1, 1, 1},
            {1, 1, 1},
            {1, 1, 1},

    };

    int[][] getMatrix() {
        return matrix;
    }

    int getSizeN() {
        return matrix.length;
    }

    int getSizeM() {
        return matrix[0].length;
    }

    int getMatrixElement(int indexN, int indexM) {
        return matrix[indexN][indexM];
    }

    int[][] setMatrixElement(int value, int indexN, int indexM) {
        matrix[indexN][indexM] = value;
        return matrix;
    }

    int[][] getAddMatrix(int[][] secondMatrix) {
        int[][] addResultMatrix = new int[4][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                addResultMatrix[i][j] = matrix[i][j] + secondMatrix[i][j];
            }
        }
        return addResultMatrix;
    }

    int[][] getMultiplicationMatrix(int[][] secondMatrix) {
        int[][] multiplicationResultMatrix = new int[4][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                multiplicationResultMatrix[i][j] = matrix[i][j] * secondMatrix[i][j];
            }
        }
        return multiplicationResultMatrix;
    }
}


