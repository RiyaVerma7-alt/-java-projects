import java.util.Scanner;
public class MultipicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
        System.out.println("multipication of :"+ num);
        for(int i=1; i<=10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
