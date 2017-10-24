package com.cheeras;

public class SinglyLinkedList {
	Node head;

	static class Node {
		private int data;
		Node next;

		Node() {
		}

		public Node(int data) {
			this.data = data;
		}
	}

	public static void main(String args[]) {
		SinglyLinkedList list = new SinglyLinkedList();
		Node node1 = new Node(600);
		list.head = node1;
		Node node2 = new Node(100);
		Node node3 = new Node(100);
		Node node4 = new Node(400);
		Node node5 = new Node(300);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		System.out.println("Original Singly linked list");
		//Printing linked list
		printLinkedList(list.head);
		//reversing linked list
		reversingList(list.head);
		//remove redundant linked list
		removeRedundantElements(list.head);
	}

	private static void removeRedundantElements(Node head2) {
		 Node ptr1 = null, ptr2 = null;
	        ptr1 = head2;
	        while (ptr1 != null && ptr1.next != null) {
	            ptr2 = ptr1;
	            while (ptr2.next != null) {
	                if (ptr1.data == ptr2.next.data)
	                    ptr2.next = ptr2.next.next;
	                else //tricky
	                    ptr2 = ptr2.next;
	            }
	            ptr1 = ptr1.next;
	        }
	        System.out.println("removing redudant elements");
	        printLinkedList(head2);		
	}

	private static void reversingList(Node head2) {
		Node pre=null;
		Node cur=head2;
		Node succ=null;
		while(cur!=null){
			succ=cur.next;
			cur.next=pre;
			pre=cur;
			cur=succ;
		}
		System.out.println("After reversing....");
		printLinkedList(pre);
	}

	private static void printLinkedList(Node head2) {
		while(head2!=null){
			System.out.print(head2.data+" ");
			head2=head2.next;
		}
		System.out.println();
	}
}
