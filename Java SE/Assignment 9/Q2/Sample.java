public class Sample {
	private char ch;

	public char getCh() {
		return ch;
	}

	public Sample(char ch) {
		this.ch = ch;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "["+ch+"]";
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Sample ref = (Sample) obj;
		return this.ch == ref.ch;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.getCh();
	}
}
