package assignment;

enum Gender {
	M, F, NB
}

public class Employee {

	static int counter = 112470;

	private int id;
	private String name;
	private Gender gender;
	private double salary;

	public Employee(String name, Gender gender, double salary) {
		this.id = counter++;
		this.name = name;
		this.gender = gender;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[ Id: " + id + " Name: " + name + " Gender: " + gender + " Salary: " + salary + " ]";
	}
}
