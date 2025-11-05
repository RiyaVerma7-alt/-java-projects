import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	  Scanner Sc = new Scanner (System.in);
	  int number = 0;
	  do{ System.out.println("Input a number:");
	       number = Sc.nextInt();
	      System.out.print("your number:");
	      System.out.println(number);
	  } while(number>= 0);
	  {
	      System.out.println("The end");
	  }
}
}