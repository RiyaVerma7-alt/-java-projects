import java.util.Scanner;
public class Main {
     public static void main(String[] args) {
         // MINI PROJECT
         Scanner sc = new Scanner(System.in);
         int MyNumber = (int)(Math.random() * 100);
         int UserNumber = 0;
         do {
             System.out.println("Gusse the Number:");
             UserNumber = sc.nextINT();
             
             if ( UserNumber == MyNumber) {
                 System.out.println(" Woohoo.. CORRECT NUMBER!!");
             }
             else if ( UserNumber > MyNumber) {
                 System.out.println(" Your number is too large");
             }
             else {
                 System.out.println("Your number is too small");
             }
         } 
         while (UserNumber >= 0);
         System.out.println("My Number was: ");
         System.out.println(MyNumber);
       
    }
}