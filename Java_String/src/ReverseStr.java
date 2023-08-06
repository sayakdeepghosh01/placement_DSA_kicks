import java.util.Scanner;
import java.lang.StringBuilder;
public class ReverseStr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String that you want to reverse: ");
		String str=sc.nextLine();
		int length=str.length();
		//Approach 1
		char[] arr=str.toCharArray();
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]);
		}
		System.out.println();
		//Approach 2
		for(int i=length-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
		//Approach 3
		StringBuilder sd=new StringBuilder(str);
		System.out.println(sd.reverse());
		
	}

}
