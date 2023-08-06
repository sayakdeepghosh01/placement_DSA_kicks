import java.util.Scanner;
public class Armstrong {

	public static void main(String[] args) {
		int n,rem,sum=0,temp;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		temp=n;
		while(n>0)
		{
			rem=n%10;
			sum=(rem*rem*rem)+sum;
			n=n/10;
		}
		if(sum==temp)
		{
			System.out.println("The number is armstrong");
		}
		else
		{
			System.out.println("The number is not armstrong");
		}
	}

}
