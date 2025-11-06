import java.util.Scanner;
public class diagonalelementsmatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of squre matrix: ");
        int n = sc.nextInt();
       int[][] matrix = new int[n][n];

         System.out.print("Enter the element of matrix: ");
         for (int i = 0; i < n; i++) {
            for(int j = 0; j<n; j++) {
           matrix[i][j] = sc.nextInt();
            }
         }
         System.out.println("\nmatrix:");
         for (int i = 0; i < n; i++) {
            for(int j = 0; j<n; j++) {
         System.out.println(matrix[i][j]);
            }
            System.out.println();
         }
          System.out.println("\n main diagonal");
          for(int i=0; i<n; i++) {
              System.out.println(matrix[i][j]);
          }
            System.out.println("\n secondary diagonal");
            for(int i=0; i<n; i++) {
                System.out.println(matrix[i] [n-1-i]);
            }
            }   }
