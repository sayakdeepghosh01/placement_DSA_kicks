import java.util.Scanner;
public class Sum_N {

	public static void main(String[] args) {
		
		// Find the Sum of First N Natural Numbers in Java
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the last number:");
		int num=sc.nextInt();
		//using recursion
		int sum=getSum(num);
		System.out.println("The result is "+sum);
		
		
		
		/*using loop
		 * for(int i=1;i<=num;i++)
		{
			sum=sum+i;
		}
		System.out.println("The result is "+sum);*/
		
		
		// using formula
		//System.out.println("The result is :"+num*(num+1)/2);
		
	}
	static int getSum(int num)
	{
		if(num==0)
		{
			return num;
		}
		else {
			return num+getSum(num-1);
		}
	}

}
