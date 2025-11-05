import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    // conditional steatment
	    Scanner sc = new Scanner(System.in);
		//pen = 10, note book = 40
		int cash = sc.nextInt();
		if(cash < 10)
		{ System.out.println("can't buy anything");
		  System.out.println("get more cash");
	}
	else if (cash > 10 && cash < 50){
	    System.out.println(" buy one thing");
	    
	}
	else {
	    System.out.println("can buy both things");
	}
}
}