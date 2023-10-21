public class MyClass {

	public static void main(String[] args) {
		for (int i = 3; i <= 30; i = i + 2) {
			boolean flag = true;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					flag = false;
					break;
				}
			}
			if (flag)
				System.out.println(i);
		}
	}
}
