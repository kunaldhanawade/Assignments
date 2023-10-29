public class Demo {
	
	static void disp(int ...num) {
		int sum=0;
		
		for(int i=0; i<num.length; i++)
			sum+=num[i];
		
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i]);
			if(i!=num.length-1)
				System.out.print("+");
		}
		System.out.println(" = "+sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		disp(10);
		disp(10,20);
		disp(10,20,30);
		disp(10,20,30,40);
		disp(10,20,30,40,50);
	}

}
