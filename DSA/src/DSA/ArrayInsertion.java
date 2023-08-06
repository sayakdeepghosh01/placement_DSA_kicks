package DSA;
import java.util.Scanner;
public class ArrayInsertion {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of the array:");
		int size=sc.nextInt();
		
		System.out.println("Enter the elements in the array:");
		int[] arr=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the position:");
		int pos=sc.nextInt();
		System.out.println("Enter the Element to be insert:");
		int element=sc.nextInt();
		Insert(arr,size,element,pos);
		
	}
	public static void Insert(int arr[],int size,int element,int pos) {
		int newarr[]=new int[size+1];
		for(int i=0;i<size+1;i++) {
			if (i<pos-1) {
				newarr[i]=arr[i];
				
			}
			else if(i==pos-1){
				newarr[i]=element;
				
			}
			else {
				newarr[i]=arr[i-1];
			}
		}
		System.out.println("The array is :");
		for(int i=0;i<size+1;i++) {
			System.out.print(newarr[i]+" ");
		}
		
	}
	
}