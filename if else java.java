/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
		System.out.println("enter age");
		int age = sc.nextInt();
		if( age > 18 )
		System.out.println("can vote");
		else
		System.out.println("can't vote");
	}
}