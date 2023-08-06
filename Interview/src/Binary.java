import java.util.Scanner;
public class Binary {

	public static String AddTwoBinary(String a,String b) {
		
		int num1=Integer.parseInt(a,2);
		int num2=Integer.parseInt(b,2);
		int sum=num1+num2;
		String result=Integer.toBinaryString(sum);
		return result;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		String b=sc.nextLine();
		System.out.println(AddTwoBinary(a,b));
	}

}
