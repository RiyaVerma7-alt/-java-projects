import java.util.Scanner;
import java.util.Arrays;
public class ArrayinSanding {
    public static void main(String[] args ) {
        Scanner sc = new Scanner(System.in);
        System.out.println("lenght of elements:");
       // int num = sc.nextInt();
        int arr[] = {2,4,1,8,5};
        
      System.out.println(arr.length);
           Arrays.sort(arr);
           for(int i=0; i<arr.length; i++)
           System.out.println(arr[i]);
          
    }
}
