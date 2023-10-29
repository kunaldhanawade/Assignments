public class Demo {

	public static void main(String[] args) {

		Sample s1 = new Sample('v');
		System.out.println("s1\t"+s1);
		
		Sample s2 = new Sample('v');
		System.out.println("s2\t"+s2);
		
		Sample s3 = new Sample('r');
		System.out.println("s3\t"+s3);
		
		System.out.println("s1 == s2\t"+s1.equals(s2));
		System.out.println("s1 == s3\t"+s1.equals(s3));
		System.out.println("hashCode of s1\t"+s1.hashCode());
		System.out.println("hashCode of s2\t"+s2.hashCode());
		System.out.println("hashCode of s3\t"+s3.hashCode());
	}
}
