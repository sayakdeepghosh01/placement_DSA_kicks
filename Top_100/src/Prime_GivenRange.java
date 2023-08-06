import java.util.Scanner;
public class Prime_GivenRange {

	public static void main(String[] args) {
		int i,j,first,last,count;
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the first number:");
		first=sc.nextInt();
		System.out.println("ENter the last number:");
		last=sc.nextInt();
		for(i=first;i<=last;i++)
		{
			count=0;
			for(j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
					
				}
			}
			if(count==2)
			{
				System.out.print(i+" ");
			}
		}
	}

}
