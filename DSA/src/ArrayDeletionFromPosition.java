import java.util.Scanner;
public class ArrayDeletionFromPosition {

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
		// Prompt the user to enter the index of the element to be deleted
		System.out.println("Enter the index of the element to be deleted(0-"+(size-1)+"):");
		int index=sc.nextInt();
		
		
		//deleting the element from any position
		
		for(int i=index;i<size-1;i++)
		{
			arr[i]=arr[i+1];
		}
		
		System.out.println("The updated array are:");
		for(int i=0;i<size-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
