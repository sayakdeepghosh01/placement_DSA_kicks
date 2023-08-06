package DSA;
import java.util.*;
public class Array {

	/*public static void reverse(int arr[],int size) {
		int b[]=new int[size];
		int n=size;
		for(int i=0;i<size;i++) {
			b[n-1]=arr[i];
			n=n-1;
		}
		System.out.println("The reversed array is: ");
		for(int i=0;i<size;i++) {
			System.out.print(b[i]+" ");
		}
		System.out.println();
	}*/
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter the elements: ");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();

		}
		 for (int i = 0; i < size; i++){
	            System.out.print(arr[size-i-1] + " ");
	        }
		//reverse(arr,size);
		
	}

}
