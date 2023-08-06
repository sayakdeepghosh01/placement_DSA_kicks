import java.util.Arrays;

public class str_demo {

	public static void main(String[] args) {
		String a="Nikita Modi";
		String b="modi nikita";
		a=a.toLowerCase();
		b=b.toLowerCase();
		char c1[]=a.toCharArray();
		char c2[]=b.toCharArray();
		if(c1.length!=c2.length)
		{
			System.out.println("They are not anagram");
			System.exit(0);
		}
		Arrays.sort(c1);
		Arrays.sort(c2);
		for(int i=0;i<c2.length;i++)
		{
			if(c1[i]!=c2[i]) {
				System.out.println("They are not anagram");
				System.exit(0);
			}
			
		
		}
		System.out.println("They are anagram");
		

	}

}
