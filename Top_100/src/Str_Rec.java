
public class Str_Rec {

	public static void main(String[] args) {
		printstring(10);

	}
	public static void printstring(int n)
	{
		if(n>0)
		{
			System.out.println(n+"Good Morning Nikita");
			printstring(n-1);
		}
	}

}
