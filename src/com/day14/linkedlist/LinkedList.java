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

	public void push(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;

	}

	public void insertAfter(Node prevNode, int value) {
		if (prevNode == null) {
			System.out.println("Prev Node should not be null");
			return;
		}
		// 56 ->70
		// 56 -> 30 -> 70
		Node newNode = new Node(value);
		newNode.next = prevNode.next;
		prevNode.next = newNode;

	}

	public int pop() {
		int popData = 0;
		if (head == null) {
			System.out.println("Stack over flow ");
		}
		popData = head.data;
		head = head.next;

		return popData;

	}

	public void popLast() {
		if (head == null) {
			System.out.println("Stack is empty");
		}
		if (head == null) {
			System.out.println(head.data);
			head = null;
		}
		Node temp = head;
		while (temp.next.next != null) {
			temp = temp.next;

		}
		temp.next = null;
		System.out.println("Delete last node::");

	}

	public int search(int val) {
		if (head == null) {
			System.out.println("List is Empty");
			return -1;
		}
		int index = 1;
		Node newNode = head;
		while (newNode != null) {
			if (newNode.data == val) {
				break;
			}
			index++;
			newNode = newNode.next;
		}
		return index;
	}

	public void insertelement(int position, int data) {

		Node node = new Node(data);

		if (position == 1) {
			node.next = head;
			head = node;
		} else {
			Node previous = head;
			int count = 1; // position - 1

			while (count < position - 1) {
				previous = previous.next;
				count++;
			}

			Node temp = previous.next;
			previous.next = node;
			node.next = temp;
		}
	}

	public void deleteANode(int value) {
		if (this.head == null) {
			System.out.println("List is Empty");
			return;
		}
		Node tempNode = head;
		while (tempNode.next.data != value) {
			tempNode = tempNode.next;
		}
		Node previousNode = tempNode;
		Node nextNode = tempNode.next.next;
		previousNode.next = nextNode;
	}

	public void sort() {
		Node initialStart = head, index = null;
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		while (initialStart != null) {
			index = initialStart.next;
			while (index != null) {
				if (initialStart.data > index.data) {
					int temp = initialStart.data;
					initialStart.data = index.data;
					index.data = temp;
				}
				index = index.next;
			}
			initialStart = initialStart.next;
		}
	}
}
