package com.day14.linkedlist;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to DataStructure Program\n\n"
				+ "Choose your option:\n"
				+ "1. Create a simple LinkedList\n"
				+ "2. Create Linked List by adding 30 and 56 to 70\n"
				+ "3. Create Linked List by apending 30 and 70 to 56\n"
				+ "4. Insert 30 between 56 & 70\n"
				+ "5. Ability to delete the first element\n"
				+ "6. Delete the last element in the LinkedList\n"
				+ "7. Find node with value 30"
				+ "8. Insert 40 after 30"
				+ "9. Delete the Node"
				+ "10. Ascending order");

		int option = sc.nextInt();
		System.out.println();
		switch (option) {

		case 1:

			linkedList.insert(56);
			linkedList.insert(30);
			linkedList.insert(70);

			linkedList.print();
			break;

		case 2:
			linkedList.push(70);
			linkedList.push(30);
			linkedList.push(56);

			linkedList.print();

			break;

		case 3:

			linkedList.insert(56);
			linkedList.insert(30);
			linkedList.insert(70);

			linkedList.print();


			break;

		case 4:

			LinkedList.Node prevNode = linkedList.insert(56);
			linkedList.insert(70);

			linkedList.insertAfter(prevNode,  30);


			break;
			
		case 5:
        	linkedList.insert(56);
        	linkedList.insert(30);
        	linkedList.insert(70);
        	int pop = linkedList.pop();
        	System.out.println(pop);
        	linkedList.print();
        	
        	break;
        	
		case 6: 
			linkedList.insert(56);
			linkedList.insert(30);
			linkedList.insert(70);
			linkedList.popLast();

			linkedList.print();
			break;
		case 7:
			linkedList.insert(56);
        	linkedList.insert(30);
        	linkedList.insert(70);
			int search = linkedList.search(30);
	    	System.out.println("Position of 30::"+search); 
	    	
	    	break;
		case 8:
			linkedList.insert(56);
			linkedList.insert(30);
			linkedList.insert(70);

			linkedList.insertelement(3, 40);

			linkedList.print();
			
		case 9:
			 
		        linkedList.deleteANode(40);
		        linkedList.print();
		        
	   case 10:
		         linkedList.sort();
		         linkedList.print();

	

		}
	}

	}

