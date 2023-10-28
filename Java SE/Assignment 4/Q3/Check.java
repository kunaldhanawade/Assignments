class Check {
	private String name = "Kunal";
	int age = 21;
	protected boolean legend=true;
	public char initial = name.charAt(0);
	
	public void disp() {
		System.out.println("in check public disp");
	}

	public String getName() {
		return name;
	}
}
