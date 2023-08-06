import java.util.Scanner;
public class ArrayInsertionAtBeginning {
	
 public static void main(String args[])
 {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the size of an array:");
	 int size=sc.nextInt();
	 int[] arr= new int[size+1];
	 System.out.println("Enter array elements:");
	 for(int i=0;i<size;i++)
	 {
		 arr[i]=sc.nextInt();
	 }
	 System.out.println("Enter the element you want to insert:");
	 int element=sc.nextInt();
	 
	 for(int i=size;i>0;i--)
	 {
		 arr[i]=arr[i-1];
	 }
	 arr[0]=element;
	 System.out.println("The updated array are:");
	 for(int i=0;i<=size;i++)
	 {
		 System.out.println(arr[i]+" ");
	 }
 }
}
