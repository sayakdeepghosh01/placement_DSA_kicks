package DSA;
import java.util.Scanner;
public class Practice {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int size=sc.nextInt();
		System.out.println("Enter the array elements:");
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("ENter the position:");
		int pos=sc.nextInt();
		System.out.println("Enter the element to be inserted:");
		int element=sc.nextInt();
		insert(arr,size,pos,element);

	}
	public static void insert(int arr[],int size,int pos,int element) {
		int newarr[]=new int[size+1];
		for(int i=0;i<size+1;i++) {
			if(i<pos-1) {
				newarr[i]=arr[i];
			}
			else if(i==pos-1) {
				newarr[i]=element;
			}
			else {
				newarr[i]=arr[i-1];
				
			}
		}
		System.out.println("The updated array is:");
		for(int i=0;i<size+1;i++) {
			System.out.print(newarr[i]+" ");
		}
	}

}
