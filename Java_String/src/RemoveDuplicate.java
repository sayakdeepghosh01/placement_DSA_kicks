import java.util.*;
public class RemoveDuplicate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println(printduplicate(str));
	}
	public static String printduplicate(String str)
	{
		char[] charr=str.toCharArray();
		
		
		//1st check string is null or not
		/*if(str==null)
		{
			System.out.println("STring is null");
			return "";
		}
		if(str.isEmpty()) {
			System.out.println("String is empty");
			return "";
		}
		if(str.length()==1) {
			System.out.println("String length is one");
			return "";
		}
		
		HashSet<Character> s=new LinkedHashSet<>(length-1);
		
		//hashset doesnot allow duplicate of elements
		for(char x:charr) {
			s.add(x);
		}
		for(char x:s) {
			System.out.print(x);
		}
		
		return "";*/
		
		HashMap<Character,Integer> exists=new HashMap<>();

		String newstr="";
		for(int i=0;i<charr.length;i++) {
		if(!exists.containsKey(charr[i])) {
			newstr+=charr[i];
			exists.put(charr[i], 1);
		}
		}
		return newstr;	
		
	}

}
