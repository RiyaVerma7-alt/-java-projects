import java.util.Scanner;
public class countnumberofDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
        int count = 0;
        int number = Math.abs(num);
        if( number == 0) {
            count = 1;
                }
        else {
            while(number > 0) {
                number = number/10;
                count++;
            }
        }
        System.out.println("number of digits:" + count);
    }
}
