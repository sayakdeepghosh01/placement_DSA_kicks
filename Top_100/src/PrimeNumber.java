import java.util.Scanner;
public class PrimeNumber {

	public static boolean isPrime(int n) {
		if(n<2) {
			return false;
		}
		
			for(int i=2;i<=n/2;i++) {
				if(n%i==0) {
					return false;
				}
			}
		
		return true;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the starting number:");
		int first=sc.nextInt();
		System.out.println("Enter the last number:");
		int last=sc.nextInt();
		System.out.println("The prime numbers are:");
		for(int i=first;i<=last;i++) {
			if(isPrime(i)) {
				System.out.print(i+" ");
			}
		}

	}

}
