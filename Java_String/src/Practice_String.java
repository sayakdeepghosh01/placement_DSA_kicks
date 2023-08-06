import java.util.Arrays;
import java.util.Scanner;
public class Practice_String {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		char[] c1=s1.toCharArray();
		int count;
		for(int i=0;i<=c1.length-1;i++) {
			count=1;
			for(int j=i+1;j<c1.length-1;j++) {
				if(c1[i]==c1[j]&&c1[i]!=' ') {
					count++;
					//to avoid the visited character
					c1[j]='0';
				}
			}
			if(count>1&&c1[i]!='0') {
				System.out.println("The duplicate character is "+c1[i]+"=>"+count);
			}
		}
		
		}
}
