public class MatrixOperations {

    // Method to display matrix
    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double val : row) {
                System.out.printf("%6.2f ", val);
            }
            System.out.println();
        }
    }

    // Method to transpose a 3x3 matrix
    public static double[][] transpose(double[][] matrix) {
        double[][] transposed = new double[3][3];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                transposed[i][j] = matrix[j][i];
        return transposed;
    }

    // Method to find the determinant of a 3x3 matrix
    public static double determinant(double[][] m) {
        return m[0][0] * (m[1][1]*m[2][2] - m[1][2]*m[2][1])
             - m[0][1] * (m[1][0]*m[2][2] - m[1][2]*m[2][0])
             + m[0][2] * (m[1][0]*m[2][1] - m[1][1]*m[2][0]);
    }

    // Method to get cofactor of element (p,q)
    public static double[][] getCofactor(double[][] m, int p, int q) {
        double[][] temp = new double[2][2];
        int i = 0, j = 0;
        for (int row = 0; row < 3; row++) {
            if (row == p) continue;
            j = 0;
            for (int col = 0; col < 3; col++) {
                if (col == q) continue;
                temp[i][j++] = m[row][col];
            }
            i++;
        }
        return temp;
    }

    // Method to calculate 2x2 determinant
    public static double det2x2(double[][] m) {
        return m[0][0] * m[1][1] - m[0][1] * m[1][0];
    }

    // Method to find inverse of 3x3 matrix
    public static double[][] inverse(double[][] matrix) {
        double det = determinant(matrix);
        if (det == 0) {
            System.out.println("Inverse not possible (Det = 0)");
            return null;
        }

        double[][] adj = new double[3][3];

        // Find adjoint using cofactors
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++) {
                double[][] cofactor = getCofactor(matrix, i, j);
                adj[j][i] = Math.pow(-1, i + j) * det2x2(cofactor); // Note the transpose step
            }

        // Divide adjoint by determinant
        double[][] inverse = new double[3][3];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                inverse[i][j] = adj[i][j] / det;

        return inverse;
    }

    public static void main(String[] args) {
        double[][] matrix = {
            {1, 2, 3},
            {0, 1, 4},
            {5, 6, 0}
        };

        System.out.println("Original Matrix:");
        displayMatrix(matrix);

        System.out.println("\nTranspose:");
        displayMatrix(transpose(matrix));

        double det = determinant(matrix);
        System.out.println("\nDeterminant: " + det);

        System.out.println("\nInverse:");
        double[][] inv = inverse(matrix);
        if (inv != null) {
            displayMatrix(inv);
        }
    }
}
