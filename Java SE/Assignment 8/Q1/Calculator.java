public class Calculator {
	
	static int caldouble(int num) throws MyArithException {
		
		if(num==0)
			throw new MyArithException("Zero not allowed");

		if(num<0)
			throw new MyArithException("Negative not allowed");
		
		return num*2; 
	}
}

