import java.util.Scanner;
public class Arraysum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number of elements:");
       int num = sc.nextInt();
       int []arr = new int[num];
       int sum = 0;
       System.out.println("Enter" + num + "elements");
       for(int i=0; i<num; i++) {
           arr[i] = sc.nextInt();
           sum = arr[i] + num;
       }
       System.out.println("sum of array elements:" + sum);
    }
}
