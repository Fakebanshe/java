package ödev4_1;

import java.util.Scanner;

public class kare_matris {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Matris boyutunu girin: ");
        int size = scanner.nextInt();

        int[][] matrix1 = generateRandomMatrix(size, size);
        int[][] matrix2 = generateRandomMatrix(size, size);

        System.out.println("İlk Matris:");
        printMatrix(matrix1);
        System.out.println("İkinci Matris:");
        printMatrix(matrix2);

        int[][] result = multiplyMatrices(matrix1, matrix2);
        System.out.println("Matrislerin Çarpımı:");
        printMatrix(result);
    }

    public static int[][] generateRandomMatrix(int row, int col) {
        int[][] matrix = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = (int) (Math.random() * 10); // Rastgele değerlerle dolduruluyor (0-9 arası)
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int row1 = matrix1.length;
        int col1 = matrix1[0].length;
        int col2 = matrix2[0].length;

        int[][] result = new int[row1][col2];

        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                for (int k = 0; k < col1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return result;
    }
}
