import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		checkprime(num);

	}
	public static void checkprime(int num)
	{
		int i;
		if(num<2)
		{
			System.out.println("The number is not prime");
			System.exit(0);
		}
		
		for(i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				System.out.println("Not prime");
				System.exit(0);
			}
			
		}
		System.out.println("Prime");
		
		
		
	}

}
