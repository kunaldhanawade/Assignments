// reverse a string using stack

package assignments;

import java.util.Scanner;

import lecture.MyCharStack;

public class Reverse_Stack {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a String: ");
		String str = in.next();
		int len = str.length();
		
		MyCharStack stack = new MyCharStack();
		stack.createStack(len);
		
		for(int i=0; i<len; i++) {
			stack.push(str.charAt(i));
		}
		
		StringBuilder rev_str = new StringBuilder();
		
		for(int i=0; i<len; i++) {
			rev_str.append(stack.pop());
		}
		
		System.out.println("\nReversed String is: "+rev_str);
	}

}
