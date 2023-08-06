import java.util.Arrays;
import java.util.Scanner;
public class SortChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String st=s.toLowerCase();
		char temp;
		char[] str=st.toCharArray();
		/*for(int i=0;i<str.length;i++) {
			for(int j=i+1;j<str.length;j++) {
				if(str[i]>str[j]) {
					temp=str[i];
					str[i]=str[j];
					str[j]=temp;
				}
			}
		}
		System.out.println(str);*/
		
		//Approach 2
		Arrays.sort(str);
		System.out.println(str);
	}

}
