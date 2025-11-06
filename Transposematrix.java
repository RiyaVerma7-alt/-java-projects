import java.util.Scanner;
public class Transposematrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
         System.out.print("Enter the number of cols: ");
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];
         int[][] transpose = new int[rows][cols];
        System.out.println("Enter elements of matrix:");
        for (int i = 0; i < rows; i++) {
            for(int j = 0; j<cols; j++) {
                System.out.println("elements ["+i+"] ["+j+"]");
                matrix[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < rows; i++) {
            for(int j = 0; j<cols; j++) {
                transpose[i][j] = matrix[i][j];
            }
        }
       
        System.out.println("\n orignal matrix");
        for (int i = 0; i < rows; i++) {
            for(int j = 0; j<cols; j++) {
        System.out.println(matrix[i][j]);
            }
            System.out.println();
        }
         System.out.println("\n transpose matrix");
        for (int i = 0; i < rows; i++) {
            for(int j = 0; j<cols; j++) {
        System.out.println(transpose[i][j]);
            }
            System.out.println();
        }
    }
}
