import java.util.Scanner;
public class GreatestNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int temp;
		if(a==b)
		{
			System.out.println("a and b are Equal");
		}
		/*else if(a>b)
		{
			System.out.println(a+" is big");
		}
		else
		{
			System.out.println(b+" is big");
		}*/
		/*
		 * or
		temp= a>b? a:b;
		System.out.println("The answer is "+temp);
		*/
		System.out.println("The biggest number is "+Math.max(a, b));
	}

}
