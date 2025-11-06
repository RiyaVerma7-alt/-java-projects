import java.util.Scanner;
public class ReverseInteager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a inteager");
       int num = sc.nextInt();
       int reverse = 0;
        int n = Math.abs(num); 
        while (n != 0) {
            int digit = n % 10; 
            reverse = reverse * 10 + digit; 
            n = n / 10;                  
        }
         if (num < 0) {
            reverse = -reverse; 
        }
          System.out.println("Reversed number: " + reverse);
    }
}
