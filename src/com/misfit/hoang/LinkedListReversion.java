/**
 * @author Minh-Hoang Nguyen
 * Description:
 * 	h. Reverse a linked list without recursion.
 */
package com.misfit.hoang;

public class LinkedListReversion {
	private NodeList head;

	public LinkedListReversion(NodeList head) {
		this.head = head;
	}

	public void reverse() {
		NodeList current = head;
		head = null;
		while (current != null) {
			NodeList temp = current;
			current = current.next;
			temp.next = head;
			head = temp;
		}
	}

	public static void printList(NodeList head) {
		NodeList temp = head;
		while (temp != null) {
			System.out.print(temp.value + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	public static void main(String[] s) {
		// 1->2->3->4
		NodeList a4 = new NodeList(4, null);
		NodeList a3 = new NodeList(3, a4);
		NodeList a2 = new NodeList(2, a3);
		NodeList a1 = new NodeList(1, a2);

		LinkedListReversion list1 = new LinkedListReversion(a1);
		list1.reverse();
		// 4->3->2->1
		printList(list1.head);
	}
}

class NodeList {
	int value;
	NodeList next;

	public NodeList(int value, NodeList next) {
		this.value = value;
		this.next = next;
	}

	public NodeList next() {
		return next;
	}

	public void setNext(NodeList next) {
		this.next = next;
	}

	public int getValue() {
		return value;
	}
}
