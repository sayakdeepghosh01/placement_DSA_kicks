import java.util.Arrays;
import java.util.Scanner;
public class ReplaceChar {

	public static void main(String[] args) {
		
		String s="Nikita";
		char rep='i';
		char str[]=s.toCharArray();
		if(s.indexOf(rep)==-1) {
			System.out.println("The searched character is not present");
			System.exit(0);
		}
		else {
			
			int count=1;
			for(int i=0;i<str.length;i++) {
				if(str[i]==rep) {
					str[i]=String.valueOf(count).charAt(0);
					
				}
				count++;
			}
		}
		
		System.out.println(Arrays.toString(str));
		
	}

}
