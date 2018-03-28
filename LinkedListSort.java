package com.code.linkedlist;


public class LinkedListSort
{
	public static void main(String[] args) {
		LinkedListFunctions llf = new LinkedListFunctions();
		Node head=null;
		
/*	//	for (int i = 0; i < 5; i++)
			head = llf.InsertAtEnd(head, 0);
			head = llf.InsertAtEnd(head, 2);
			head = llf.InsertAtEnd(head, 1);
			head = llf.InsertAtEnd(head, 0); */
			head = llf.InsertAtEnd(head, 1);
		llf.printList(head);
		GFG g=new GFG();
		g.linksort(head);
		llf.printList(head);
	}
}



/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GfG's Online Judge.*/

/*
  Sort the list of 0's,1's and 2's
  The input list will have at least one element  
  Node is defined as  */
class Node {
	int value;
	Node next;

	Node(int value) {
		this.value = value;
		this.next = null;
	}
}

class GFG {
	void linksort(Node head) {
		int length = 0;
		// Corner cases : if list is empty or list has a single element , then
		// do nothing
		if (head == null)
			return;

		if (head.next == null)
			return;

		// finding the length of the list
		length = findLengthList(head);

		// sorting algo : bubble sort technique
		boolean swap = false;
		for (int k = 0; k < length; k++) { // repeat the iterations on the list
			Node temp = head; // initialise with head every time
			 swap = false;
			for (int i = 0; i < (length - k - 1); i++) {// last element at end
														// of each iteration is
														// already smallest
				if (temp.value > temp.next.value) {
					swapNodeData(temp, temp.next);
					swap = true;
				}
				temp = temp.next;
			}
			if (!swap) // break out of the loop if there was no swap in the
						// iteration
				break;
		}
	}

	void swapNodeData(Node a, Node b) {
		a.value ^= b.value;
		b.value ^= a.value;
		a.value ^= b.value;
	}

	int findLengthList(Node head) {
		Node tmp = head;
		int count = 0;
		while (tmp != null) {
			count++;
			tmp = tmp.next;
		}
		return count;
	}
}
