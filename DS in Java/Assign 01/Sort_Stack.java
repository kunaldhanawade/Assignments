//sort stack using another stack

package assignments;

import java.util.Random;
import java.util.Scanner;

import lecture.MyIntStack;

public class Sort_Stack {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter Size: ");
		int size = in.nextInt();

		MyIntStack stack = new MyIntStack();
		stack.createStack(size);

		MyIntStack min = new MyIntStack();
		min.createStack(size);

		Random r = new Random();

		for (int i = 0; i < size; i++) {
			int no = r.nextInt(10, 99);
			stack.push(no);
		}

		System.out.println("Before Sorting:");
		stack.print_stack();
		
		while(!stack.is_empty()) {
			int temp = stack.pop();
			while(!min.is_empty() && min.peek()<temp)
				stack.push(min.pop());
			min.push(temp);
		}

		System.out.println("After Sorting:");
		min.print_stack();
	}

}
