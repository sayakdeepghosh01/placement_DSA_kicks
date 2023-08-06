import java.util.Scanner;
public class Pos_Neg {

	public static void main(String[] args) {
		// Check if a Given Number is Positive or Negative in Java
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check:");
		int a=sc.nextInt();
		if(a<0)
		{
			System.out.println("Negative");
		}
		else
		{
			System.out.println("Positive");
		}
	}

}
