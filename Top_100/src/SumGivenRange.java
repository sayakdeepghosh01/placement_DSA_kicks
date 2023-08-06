import java.util.Scanner;
public class SumGivenRange {

	public static void main(String[] args) {
		// Find the Sum of the Numbers in a Given Range in Java
		Scanner sc=new Scanner(System.in);
		int first,last;
		//int sum=0;
		System.out.println("Enter the First number:");
		first=sc.nextInt();
		System.out.println("Enter the last number: ");
		last=sc.nextInt();
		int sum=getSum(first,last);
		System.out.println(sum);
		
		/*
		System.out.println("Enter the First number:");
		first=sc.nextInt();
		System.out.println("Enter the last number: ");
		last=sc.nextInt();
		for(int i=first;i<=last;i++)
		{
			sum=sum+i;
		}
		System.out.println("The result is:"+sum);*/
	}
	//using Recursion
	static int getSum(int first,int last)
	{
		if(first>last)
		{
			return 0;
		}
		else {
			return first+getSum(first+1,last);
		}
	}

}
