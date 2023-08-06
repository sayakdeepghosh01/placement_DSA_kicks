import java.util.Scanner;
public class RemoveChar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		//Approach 1 using replaceAll("which you do not want to replace([^a-zA-Z0-9]) it is called regex means regular expression","which you want to replace");
		String strr=str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(strr);
	}

}
