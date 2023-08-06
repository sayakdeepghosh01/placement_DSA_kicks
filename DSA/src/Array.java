import java.util.Scanner;
public class Array {
// how to take user input array element
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter the elements:");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
	}

}
