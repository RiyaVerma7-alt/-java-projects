import java.util.Scanner;
import java.util.Arrays;
public class countevenoddinarray {
    public static void main(String[] args ) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements:");
        int num = sc.nextInt();
        int arr[] = new int[num];
        System.out.println("enter " + num + " elements");
                for(int i=0; i<num; i++) {
            arr[i] = sc.nextInt();
        }
        if(num % 2 == 0) {
            System.out.println("elements in even number obsession");
        } else {
              System.out.println("elements in odd number obsession");

        }
    }
}
