import java.util.Arrays;
import java.util.Scanner;
public class CheckAnagram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		char[] c1=s1.toLowerCase().toCharArray();
		char[] c2=s2.toLowerCase().toCharArray();
		if(c1.length!=c2.length) {
			System.out.println("not Anagram");
			System.exit(0);
		}
		Arrays.sort(c1);
		Arrays.sort(c2);
		for(int i=0;i<c1.length;i++) {
			if(c1[i]!=c2[i]) {
				System.out.println("Not Anagram");
				System.exit(0);
			}
			
		}
		System.out.println("Anagram");
		}

}