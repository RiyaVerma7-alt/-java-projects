import java.util.Scanner;
public class Linearsarch {
    public static void main(String[] args ) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements:");
        int num = sc.nextInt();
        int arr[] = new int[num];
        System.out.println("enter " + num + " elements");
        for(int i=0; i<num; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the element to search");
        int search = sc.nextInt();
        boolean found = false;
        int position = -1;
        for(int i=0; i<num; i++) {
            if(arr[i] == search) {
                found = true;
                position = i;
                break;
            }
        }
        if(found) {
            System.out.println("element found at index:" + position);
            }
        else {
            System.out.println("elements not found in the array");
        }
    }
}
