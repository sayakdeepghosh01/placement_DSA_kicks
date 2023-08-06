package DSA;

import java.util.Scanner;

public class ArrayBubbleSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		int size=sc.nextInt();
		int[] arr=new int[size] ;
		System.out.println("Enter the elements: ");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		Sortele(arr,size);
		
	}
	public static void Sortele(int arr[],int size) {
		int temp;
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" -> ");
		}
	}
	

}
