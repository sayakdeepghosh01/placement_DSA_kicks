import java.util.Scanner;
public class sum_dig {

	public static void main(String[] args) {
		
		int sum=0,rem;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		while(n>0)
		{
			rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		System.out.println("Sum of digits are "+sum);
	}

}
