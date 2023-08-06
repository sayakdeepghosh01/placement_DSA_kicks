package logic;
import java.util.Scanner;
public class Pattern7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		
		
		int i,j;
		
		for(i=0;i<r;i++) {
		
		//space
		for(j=0;j<r-i-1;j++) {
			System.out.print(" ");
		}
		
		//star
		for(j=0;j<2*i-1;j++) {
			System.out.print("*");
		}
			
		//space
		for(j=0;j<r-i-1;j++) {
			System.out.print(" ");
			}
			
			
		
		System.out.println();
		}
	}

}
