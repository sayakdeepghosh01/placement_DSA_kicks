import java.util.Scanner;
public class RemoveWhiteSpace {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String strr=str.replace(" ", "");
		System.out.println(strr);
		String strrr=str.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(strrr);
	}

}
