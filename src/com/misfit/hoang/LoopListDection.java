/**
 * @author Minh-Hoang Nguyen
 *         Description: Detect loop in a linked list
 */
package com.misfit.hoang;

public class LoopListDection {

	/**
	 * check a list contains a loop by Floyd algorithm
	 * 
	 * @param head
	 *            is head node of the list
	 * @return true if list has loop and false if list does not contain loop
	 */
	public static boolean hasLoop(Node head) {
		Node tortoise = head;
		Node hare = head.next;

		while (tortoise != hare && hare.next != null) {
			tortoise = tortoise.next;
			hare = hare.next.next;
		}

		if (tortoise != hare) {
			return false;
		}
		return true;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Node A = new Node(1);
		Node B = new Node(2);
		Node C = new Node(3);
		Node D = new Node(4);
		Node E = new Node(5);
		Node F = new Node(6);
		Node G = new Node(7);
		Node H = new Node(8);
		Node I = new Node(9);

		// For List:
		/*
		 * 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8 -> 9 -> 4 -> 5 -> 6 -> 7 -> 8 ->
		 * 9 -> 4 ...
		 */
		A.setNext(B);
		B.setNext(C);
		C.setNext(D);
		D.setNext(E);
		E.setNext(F);
		F.setNext(G);
		G.setNext(H);
		H.setNext(I);
		I.setNext(D);

		System.out.println(hasLoop(A));
	}
}

class Node {
	int value;
	Node next;

	public Node() {

	}

	public Node(int _value) {
		this.value = _value;
	}

	public Node(int _value, Node _next) {
		this.value = _value;
		this.next = _next;
	}

	public void setNext(Node _next) {
		this.next = _next;
	}
}
