package logic;
import java.util.Scanner;
public class Pattern1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int i,j;
		for(i=0;i<r;i++) {
			for(j=0;j<r;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
