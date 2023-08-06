package DSA;

//Linked LIst
public class LL {

	Node head;
	
	class Node{
		String data;
		Node next;
		
		//constructor
		Node(String data){
			this.data=data;
			this.next=null;
		}
	}
	
	//add element in linked list
	//add first
	public void addFirst(String data) {
		Node newNode=new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}
	
	//add last
	public void addLast(String data) {
		Node newNode=new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		//to travel any linked list we need to create a node and assign head value
		Node currNode= head;
		//node will travel till the next of the node become null
		while(currNode.next!=null) {
			currNode=currNode.next;
			
		}
		currNode.next=newNode;
	}
	
	//print List
	public void printList() {
		if(head == null) {
			System.out.println("Linked List is empty");
			return;
		}
		
		Node currNode= head;
		while(currNode!=null) {
			System.out.print(currNode.data+" -> ");
			currNode=currNode.next;
			
		}
		System.out.println("NULL");
		
	}
	
	
	public static void main(String[] args) {
		LL list=new LL();//create object for LL class
		list.addFirst("a");
		list.printList();
		list.addFirst("is");
		list.addFirst("This");
		list.addLast("Apple");
		list.printList();
	}

}
