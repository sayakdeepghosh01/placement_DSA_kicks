import java.util.Scanner;
public class Odd_Even {

	public static void main(String[] args) {
		// Check Whether a number is Even or Odd using Java 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number to check:");		
		int num=sc.nextInt();
		String ans=(num % 2==0) ? "Even" : "Odd";
		System.out.println("the result is = "+ans);
		/*if(num%2==0)
		{
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}*/
	}

}
