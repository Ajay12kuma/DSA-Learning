package javaLinkListLearning.com.linkList;

public class LinkedList {

	Node head; // head node

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public static LinkedList insertValues(LinkedList list, int data) { // method for inserting values in linked list

		Node new_node = new Node(data); // creating new node

		if (list.head == null) {
			list.head = new_node;
		} else {
			Node last = list.head;
			while (last.next != null) {
				last = last.next;
			}
			last.next = new_node;
		}
		return list;
	}

	// @SuppressWarnings({ "null", "unused" })
	public static LinkedList deleteByKey(LinkedList list, int key) { //// method for deleting values in linked list
																		//// using key

		Node currentNode = list.head, prev = null;

		if (currentNode != null && currentNode.data == key) {
			list.head = currentNode.next;
			System.out.println("Element " + key + " present and we have deleted");
			return list;
		}

		while (currentNode != null && currentNode.data != key) {
			prev = currentNode;
			currentNode = currentNode.next;
		}
		if (currentNode != null) {
			prev.next = currentNode.next;
			System.out.println(key + " key found and deleted");
		}
		if (currentNode == null) {
			System.out.println(" " + key + " is not available ");
		}
		return list;
	}

	// for deleting node based on position.

	public static LinkedList deleteByPosition(LinkedList list, int key) {
		Node new_node = list.head, prev = null;
		if (key == 0 && new_node != null) {
			System.out.println("1st position , and we have deleted the values....");
			list.head = new_node.next;
			return list;

		}
		int counter = 0;

		while (new_node != null) {
			if (counter == key) {
				prev.next = new_node.next;
				System.out.println(key + " key deleted");
			} else {
				prev = new_node;
				new_node = new_node.next;
				counter++;

			}
		}
		if (new_node == null) {
			// Display the message
			System.out.println(key + " position element not found");
		}

		// return the List
		return list;
	}

	public static void printValues(LinkedList list) { // method for printing values in linked list

		Node currentNode = list.head;

		System.out.print("Hear youre linked list starts : ");

		while (currentNode != null) {
			System.out.print(currentNode.data + " ");
			currentNode = currentNode.next;
		}
	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list = insertValues(list, 10);
		list = insertValues(list, 20);
//		list = insertValues(list, 30);
//		list = insertValues(list, 40);
//		list = insertValues(list, 50);

		printValues(list);
		//deleteByKey(list, 10);
		//deleteByKey(list, 1);
		deleteByPosition(list,0);
		printValues(list);
	}
	
	//hey version one changes......

}