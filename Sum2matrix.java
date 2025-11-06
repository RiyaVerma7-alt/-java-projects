import java.util.Scanner;
public class Sum2matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");

        int rows = sc.nextInt();
         System.out.print("Enter the number of cols: ");
        int cols = sc.nextInt();
        int[][] matrix1 = new int[rows][cols];
         int[][] matrix2 = new int[rows][cols];
        int[][] matrix3 = new int[rows][cols];
        System.out.println("Enter the number of elements of matrix1:");
        for (int i = 0; i < rows; i++) {
            for(int j = 0; j<cols; j++) {
                System.out.println("elements ["+i+"] ["+j+"]");
                matrix1[i][j] = sc.nextInt();
            }
        }
       System.out.println("Enter the number of elements of matrix2:");
        for (int i = 0; i < rows; i++) {
            for(int j = 0; j<cols; j++) {
                System.out.println("elements ["+i+"] ["+j+"]");
                matrix2[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < rows; i++) {
            for(int j = 0; j<cols; j++) {
                int Sum[][] = matrix1[i][j]+matrix2[i][j];
            }
        }
        System.out.println("sum of the matrix");
        for (int i = 0; i < rows; i++) {
            for(int j = 0; j<cols; j++) {
        System.out.println(Sum[][]);
            }
            System.out.println();
        }
    }
} 
