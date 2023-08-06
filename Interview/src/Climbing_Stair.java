import java.util.Scanner;
public class Climbing_Stair {

	/*//using brute force(recursion) approach
	public static int climb(int n) {
		if(n<2) 
			return 1;
		
		else
		
			return climb(n-1)+climb(n-2);
		
		
	}*/
	
	//using fibonacci
	public static int climb(int n) {
		if(n==1) {
			return 1;
	}
		int first=1,second=2,third;
		for(int i=3;i<=n;i++) {
			third=first+second;
			first=second;
			second=third;
		}
		System.out.println(second);
	return second;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		climb(n);
		//System.out.println("Result is "+climb(n));

	}

}
