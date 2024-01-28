package src;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class MatrixTxt {
    public static void main(String[] args) {
        System.out.println("Type in a number for rows and columns");
        Scanner scanner = new Scanner(System.in);
        int rows= scanner.nextInt();
        int column = rows;
        int[][] matrix1 = generateRandomMatrix(rows, column);
        int[][] matrix2 = generateRandomMatrix(rows, column);
        int[][] matrix3 = multiplyMatrix(matrix1,matrix2,rows,column);
        writeMatrixToFile(matrix1, "matrix1.txt");
        writeMatrixToFile(matrix2, "matrix2.txt");
        writeMatrixToFile(matrix3, "matrix3.txt");
    }
    public static int[][] generateRandomMatrix(int rows, int column) {
            int[][] matrix = new int[rows][column];
            Random random = new Random();
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < column; j++) {
                    matrix[i][j] = random.nextInt(10) + 1;
                }
            }
            
            return matrix;
        }
    public static void writeMatrixToFile(int[][] matrix, String filename) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix[i].length; j++) {
                        writer.write(matrix[i][j] + " ");
                    }
                    writer.newLine(); 
                }
                System.out.println("Matrix written to " + filename);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    
    public static int[][] multiplyMatrix(int[][] matrix1, int[][] matrix2, int rows, int column) {
        int matrix3[][]=new int[rows][column];      
            for(int i=0;i<rows;i++){    
                for(int j=0;j<column;j++){    
                matrix3[i][j]=0;      
                    for(int k=0;k<rows;k++)      
                    {      
                    matrix3[i][j] += matrix1[i][k] * matrix2[k][j];      
                    }
                }
            }
    return matrix3;
    }
}
