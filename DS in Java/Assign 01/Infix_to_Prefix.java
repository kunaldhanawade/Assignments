// convert an infix expression to prefix expression

package assignments;

import java.util.Scanner;

import lecture.MyCharStack;

public class Infix_to_Prefix {

	static boolean isAlNum(char op) {
		if ((op >= 65 && op <= 90) || (op >= 97 && op <= 122) || (op >= 48 && op <= 57))
			return true;
		return false;
	}

	static boolean isOperator(char op) {
		if (op == '^' || op == '*' || op == '/' || op == '%' || op == '+' || op == '-')
			return true;
		return false;
	}

	static int precedence(char ch) {
		switch (ch) {
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
		case '%':
			return 2;
		case '^':
			return 3;
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter an Expression: ");
		String str = in.nextLine();
		int len = str.length();

		MyCharStack stack = new MyCharStack();
		stack.createStack(len);
		
		int flag=0;

		for (int i = 0; i < len; i++) {
			stack.push(str.charAt(i));
		}

		MyCharStack prefix = new MyCharStack();
		prefix.createStack(len);

		MyCharStack temp = new MyCharStack();
		temp.createStack(len);

		for (int i = 0; i < len; i++) {
			char e = stack.pop();

			if (isOperator(e)) {
				while (!temp.is_empty() && precedence(e) < precedence(temp.peek())) {
					prefix.push(temp.pop());
				}
				temp.push(e);
			} 
			
			else if (isAlNum(e))
				prefix.push(e);

			else if (e == ')') {
				flag++;
				temp.push(e);
			}

			else if (e == '(') {
				flag++;
				while (!temp.is_empty() && temp.peek() != ')')
					prefix.push(temp.pop());
				temp.pop();
			}
		}

		while (!temp.is_empty())
			prefix.push(temp.pop());
		
		StringBuilder prefix_str = new StringBuilder();
		for(int i=0; i<len-flag; i++) {
			prefix_str.append(prefix.pop());
		}

		System.out.println("\nPostfix Expression is: "+prefix_str);
	}
}
