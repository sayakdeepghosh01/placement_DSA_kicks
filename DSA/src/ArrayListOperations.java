import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class ArrayListOperations {

	public static void main(String[] args) {
		/*
		 * time complexity
		 * insert:O(n)
		 * search:O(1)
		 * The size of an array is fixed and cannot be changed once it is initialized, while an
		 * An Arraylist can grow or shrink dynamically as element are added or removed 
		 * Arrays can only store elements of the same data type, while an ArrayList can store elements of any type, including objects.
		 * Accessing elements in an array is faster than accessing elements in an ArrayList because arrays are implemented as 
		 * a contiguous block of memory, while an ArrayList is implemented as a dynamic array of objects, which requires 
		 * more memory allocation and deallocation. 
		 * in array we can store primitive data type and objects but in arraylist we can store only objects(always stored in heap)*/ 
		//Integer class| Float class| String class
		ArrayList<Integer> list=new ArrayList<>();
		//or we can write
		//ArrayList<Integer> list1=new ArrayList<Integer>();
		ArrayList<Boolean> bool=new ArrayList<>();
		ArrayList<String> st=new ArrayList<String>();
		
		//add elements
		list.add(9);
		list.add(5);
		list.add(2);
		list.add(4);
		list.add(7);
		list.add(6);
		System.out.println(list);
		
		//get elements
		System.out.println(list.get(1));
		System.out.println(list.get(3));
		
		//add element in any position(list.add(index,element))
		list.add(1, 88);
		System.out.println(list);
		
		//set element-remove element existing and add new element to that index
		list.set(1, 12);
		System.out.println(list);
		
		//remove element 
		list.remove(4);
		System.out.println(list);
		
		//sort element
		Collections.sort(list);
		System.out.println("The sorted array list are:"+list);
		Collections.reverse(list);
		System.out.println("The sorted array list are:"+list);
		
		//list size method
		System.out.println("Size of a list is "+list.size());
		
		//loops
		for(int i=0;i<list.size();i++)
		{
			System.out.print(list.get(i)+" ");
		}
	}

}