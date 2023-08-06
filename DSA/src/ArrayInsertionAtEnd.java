import java.util.Scanner;
public class ArrayInsertionAtEnd {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int size=sc.nextInt();
		
		int[] arr=new int[size+1];
		System.out.println("Enter the elements:");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the element to be inserted at the end");
		int value=sc.nextInt();
		
		arr[size]=value;
		
		System.out.println("The updated array are:");
		for(int i=0;i<=size;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
