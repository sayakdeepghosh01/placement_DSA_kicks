package logic;
import java.util.Scanner;
public class Pattern2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int i,j;
		for(i=1;i<=r;i++) {
			for(j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
