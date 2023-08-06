import java.util.*;
public class HashMapping {

	public static void main(String[] args) {
		//it is unordered
		HashMap<String, Integer> map=new HashMap<>();
		
		
		//insertion
		map.put("India",120);
		map.put("US",30);
		
		System.out.println(map);
		map.put("US", 50);
		map.put("Berlin", 12);
		map.put("Tokyo", 15);
		System.out.println(map);
		
		//search 
		if(map.containsKey("US")) {
			System.out.println("Key is present in the map");
			
		}
		else {
			System.out.println("Not present");
		}
		System.out.println(map.containsKey("India"));
		//get the key
		System.out.println(map.get("US"));//key exist
		System.out.println(map.get("USA"));//the key does not exist

		//traverse the hashmap
		//normal way is by array
		/*int arr[]= {12,89,34,22};
		for(int i=0;i<4;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int value:arr) {
			System.out.print(value+" ");
		}*/
		//traversing in hashmap is different
		for(Map.Entry<String, Integer> e: map.entrySet()) {
			System.out.print(e.getKey()+" "+e.getValue()+" ");
			
		}
		System.out.println();
		//another way of traversing
		Set<String> keys=map.keySet();
		for(String key:keys) {
			System.out.println(key+" "+map.get(key));
		}
		
		//remove element
		map.remove("Berlin");
		System.out.println(map);
	}

}
