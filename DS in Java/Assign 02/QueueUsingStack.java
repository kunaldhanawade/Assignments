// Implement Queue using 2 Stacks

package assignments;

import java.util.Scanner;

public class QueueUsingStack {
	MyIntStack s1 = new MyIntStack();
	MyIntStack s2 = new MyIntStack();

	void createQueue(int size) {
		s1.createStack(size);
		s2.createStack(size);
	}

	void enqueue(int e) {
		s1.push(e);
	}

	int dequeue() {
		while (!s1.is_empty())
			s2.push(s1.pop());

		int temp = s2.pop();

		while (!s2.is_empty())
			s1.push(s2.pop());

		return temp;
	}

	boolean is_full() {
		return s1.is_full();
	}

	boolean is_empty() {
		return s1.is_empty();
	}

	void print_queue() {
		while (!s1.is_empty())
			s2.push(s1.pop());
		
		System.out.print("Queue is: ");
		while (!s2.is_empty()) {
			int temp = s2.pop();
			System.out.print(temp+" -- ");
			s1.push(temp);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter the Size of the Queue: ");
		int size = in.nextInt();

		QueueUsingStack obj = new QueueUsingStack();
		obj.createQueue(size);

		int ch = 0;

		do {
			System.out.println("\nChoose among the following options:");
			System.out.println("\t0. Exit\n\t1. Enqueue\n\t2. Dequeue\n\t3. Print");
			System.out.print("\nEnter Choice: ");
			ch = in.nextInt();

			switch (ch) {
			case 0:
				System.out.println("Bye...");
				break;

			case 1:
				if (!obj.is_full()) {
					System.out.print("Enter element: ");
					int e = in.nextInt();
					obj.enqueue(e);
					System.out.println("Enqueue: " + e);
				} else {
					System.out.println("Queue is Full...");
				}
				break;

			case 2:
				if (!obj.is_empty()) {
					int temp = obj.dequeue();
					System.out.println("Dequeue: " + temp);
				} else {
					System.out.println("Queue is Empty...");
				}
				break;

			case 3:
				if (!obj.is_empty()) {
					obj.print_queue();
				} else {
					System.out.println("Queue is Empty...");
				}
				break;

			default:
				System.out.println("Invalid Choice...");
			}

		} while (ch != 0);
	}

}
