import java.util.Scanner;
class MaxorMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements");
        int num = sc.nextInt();
        int arr[] = new int[num];
        System.out.println("enter" + num + "elements");
        for(int i=0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        for(int i=0; i < num; i++) {
            if(arr[i] > max) 
            max = arr[i];
            if (arr[i] < min)
            min = arr[i];
        }
        System.out.println("maximum elements:" + max);
         System.out.println("maximum elements:" + min);
    }
}
