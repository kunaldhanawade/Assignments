package assignments;

public class MyIntStack {
	int stack[], MaxSize, tos;

	public void createStack(int size) {
		stack = new int[size];
		MaxSize = size;
		tos = -1;
	}

	public void push(int e) {
		tos++;
		stack[tos] = e;

		// or
		// stack[++tos] = e;
	}

	public boolean is_full() {
		if (tos == MaxSize - 1)
			return true;
		else
			return false;
	}

	public int pop() {
		int temp = stack[tos];
		tos--;
		return temp;

		// or
		// return stack[tos--];
	}

	public boolean is_empty() {
		if (tos == -1)
			return true;
		else
			return false;
	}

	public int peek() {
		return stack[tos];

		// or
		// return stack[tos--];
	}

	public void print_stack() {
		for (int i = tos; i >= 0; i--)
			System.out.println(stack[i]);
	}
}
