package logic;
import java.util.Scanner;
public class Pattern6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int i,j;
		for(i=1;i<=r;i++) {
			for(j=1;j<=r-i+1;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
