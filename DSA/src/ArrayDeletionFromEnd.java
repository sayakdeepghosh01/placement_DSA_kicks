import java.util.Scanner;

public class ArrayDeletionFromEnd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int size=sc.nextInt();
		
		int[] arr=new int[size];
		System.out.println("Enter the elements:");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		//deleting the element
		
		int[] newarr=new int[size-1];
		for(int i=0;i<size-1;i++)
		{
			newarr[i]=arr[i];
		}
		
		System.out.println("The updated array are:");
		for(int i=0;i<size-1;i++)
		{
			System.out.print(newarr[i]+" ");
		}

	}

}
