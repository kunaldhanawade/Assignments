public class Course {
	public void start()
	{
		System.out.println("course started");
	}
	public void stop()
	{
		System.out.println("course stopped");
	}
}

class DACDBDACourse extends Course {
	public void orientation () {
		System.out.println("orientation");
	}
}

class MSCit extends Course {

}

class Basic extends Course {

}
