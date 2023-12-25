package assignment;

import java.util.Scanner;

public class EmployeeLinkedList {
	Node root;

	void createList() {
		root = null;
	}

	void insert_right(Employee e) {
		Node n = new Node(e);
		if (root == null)
			root = n;
		else {
			Node t = root;
			while (t.next != null)
				t = t.next;
			t.next = n;
		}
		System.out.println("Inserted on Right: " + e);
	}

	Employee deleteKey(int key) {
		if (root == null)
			return null;
		else {
			Node t = root;
			Node t2 = root;
			while (t != null && key != t.data.getId()) {
				t2 = t;
				t = t.next;
			}
			if (t == null)
				return null;
			else {
				if (t == root)
					root = root.next;
				else if (t.next == null)
					t2.next = null;
				else
					t2.next = t.next;
			}
			return t.data;
		}
	}

	Employee search(int key) {
		if (root == null)
			return null;
		else {
			Node t = root;
			while (t != null && key != t.data.getId())
				t = t.next;
			if (t == null)
				return null;
			else
				return t.data;
		}
	}

	void print_list() {
		if (root == null)
			System.out.println("No Employees Found");
		else {
			System.out.println("Employees are: ");
			Node t = root;
			while (t != null) {
				System.out.println("\t" + t.data);
				t = t.next;
			}
		}
	}
}
