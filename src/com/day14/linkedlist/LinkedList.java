package com.day14.linkedlist;

public class LinkedList {
	Node head;

	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public Node insert(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
		return newNode;
	}

	public void print() {

		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "-> ");
			temp = temp.next;
		}

	}

}
