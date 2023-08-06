import java.util.Scanner;
public class Power_num {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		System.out.println("Enter the power:");
		int pow=sc.nextInt();
		int result=1;
		for(int i=1;i<=pow;i++)
		{
			result*=num;
			
		}
		System.out.println("The result is:"+result);
		
	}

}
