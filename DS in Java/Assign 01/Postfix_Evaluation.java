//evaluate a postfix expression

package assignments;

import java.util.Scanner;

import lecture.MyCharStack;
import lecture.MyIntStack;

public class Postfix_Evaluation {
	
	static boolean isOperator(char op) {
		if (op=='^' || op=='*' || op=='/' || op=='%' || op=='+' || op=='-')
			return true;
		return false;
	}

	static int perform(char op, int op1, int op2) {
		int res;
		switch (op) {
		case '+': 
			return op1+op2;
		case '-': 
			return op1-op2;
		case '*': 
			return op1*op2;
		case '/': 
			return op1/op2;
		case '%': 
			return op1%op2;
		case '^': 
			return op1^op2;
		default:
			return 0;
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter a Postfix Expression: ");
		String str = in.nextLine();
		int len = str.length();
		
		System.out.println("Entered Expression: "+str);

		MyCharStack expr = new MyCharStack();
		expr.createStack(len);

		for (int i = 0; i < len; i++) {
			expr.push(str.charAt(len - i - 1));
		}
		
		MyIntStack temp = new MyIntStack();
		temp.createStack(len);

		while (!expr.is_empty()) {
			if(!isOperator(expr.peek()))
				temp.push(Integer.valueOf(String.valueOf(expr.pop())));
			else {
				char op = expr.pop();
				int op2 = Integer.valueOf(String.valueOf(temp.pop()));
				int op1 = Integer.valueOf(String.valueOf(temp.pop()));
				int res = perform(op, op1, op2);
				temp.push(res);
			}
		}

		System.out.println("\nEvaluated Value: ");
		temp.print_stack();
	}
}
