import java.util.Scanner;
 public class Multipicaion2darray {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number of rows of matrix1");
         int rows1 = sc.nextInt();
         System.out.println("Enter the number of cols of matrix1");
         int cols1 = sc.nextInt();
         System.out.println("Enter the number of rows of matrix2");
         int rows2 = sc.nextInt();
         System.out.println("Enter the number of cols of matrix2");
         int cols2 = sc.nextInt();
         if(cols1 != rows1) {
             System.out.println("matrix multipication is not posible - column of matrix1 must equal roes of matrix2");
             return;
         }
         int matrix1[][] = new int[rows1][cols1];
          int matrix2[][] = new int[rows2][cols2];
         int mulipication[][] = new int[rows1][cols2];
         System.out.println("Elements of matrix1");
         for(int i=0; i<rows1; i++) {
             for(int j=0; j<cols1; j++) {
                 System.out.println("elements " + i + " " + j + " ");
                 matrix1[i][j] = sc.nextInt();
             }
         }
          System.out.println("Elements of matrix2");
         for(int i=0; i<rows2; i++) {
             for(int j=0; j<cols2; j++) {
                 System.out.println("elements " + i + " " + j + " ");
                 matrix2[i][j] = sc.nextInt();
             }
         }
         for(int i=0; i<rows1; i++) {
             for(int j=0; j<cols2; j++) {
                 multipication[i][j] = 0;
                 for(int k=0; k<cols1; k++) {
               multipication[i][j] = matrix2[i][k] * matrix2[k][j];

                 }
             }
         }
         System.out.println("multipication of matrixs");
         for(int i=0; i<rows1; i++) {
             for(int j=0; j<cols2; j++) {
                 System.out.println(multipication[i][j] + " ");
             }
             System.out.println("\n");
         }
     }
 }
