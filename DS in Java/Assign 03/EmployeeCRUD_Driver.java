package assignment;

import java.util.Scanner;

public class EmployeeCRUD_Driver {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Employee e;
		EmployeeCRUD_Driver obj = new EmployeeCRUD_Driver();
		EmployeeLinkedList list = new EmployeeLinkedList();
		list.createList();

		int ch;

		do {
			System.out.println("\nChoose among the following Options:");
			System.out.println("\t0. Exit");
			System.out.println("\t1. Register Employee");
			System.out.println("\t2. Search Employee by id");
			System.out.println("\t3. Delete Employee by id");
			System.out.println("\t4. Update Employee Details");
			System.out.println("\t5. Show All Employees");
			System.out.println("Enter your choice: ");
			ch = in.nextInt();

			switch (ch) {
			case 0:
				System.out.println("Bye...");
				break;

			case 1:
				System.out.println("Enter Employee Name: ");
				String name = in.next();
				System.out.println("Select Employee Gender (t1. M\t2. F\t3. NB): ");
				int g = in.nextInt();
				System.out.println("Enter Employee Salary: ");
				double salary = in.nextDouble();

				Gender gender;
				if (g == 1)
					gender = Gender.M;
				else if (g == 2)
					gender = Gender.F;
				else
					gender = Gender.NB;

				e = new Employee(name, gender, salary);
				list.insert_right(e);
				break;

			case 2:
				System.out.println("Enter Employee ID: ");
				int id = in.nextInt();

				e = list.search(id);
				if (e == null)
					System.out.println("Employee not Found");
				else {
					System.out.println("Employee details are: ");
					System.out.println(e);
				}
				break;

			case 3:
				System.out.println("Enter Employee ID: ");
				id = in.nextInt();

				e = list.deleteKey(id);
				if (e == null)
					System.out.println("Employee not Found");
				else {
					System.out.println("Employee Deleted: ");
					System.out.println(e);
				}
				break;

			case 4:
				System.out.println("Enter Employee ID: ");
				id = in.nextInt();

				System.out.println("\nChoose among the following Options:");
				System.out.println("\t0. Exit");
				System.out.println("\t1. Update Name");
				System.out.println("\t2. Update Gender");
				System.out.println("\t3. Update Salary");
				System.out.println("Enter your choice: ");
				int c = in.nextInt();

				e = list.search(id);

				switch (c) {
				case 0:
					System.out.println("Updates Cancelled...");
					break;

				case 1:
					System.out.println("Enter Employee Name to update: ");
					name = in.next();
					e.setName(name);
					break;

				case 2:
					System.out.println("Enter Employee Gender to update (t1. M\t2. F\t3. NB): ");
					g = in.nextInt();
					if (g == 1)
						gender = Gender.M;
					else if (g == 2)
						gender = Gender.F;
					else
						gender = Gender.NB;
					e.setGender(gender);
					break;

				case 3:
					System.out.println("Enter Employee Salary to update: ");
					salary = in.nextDouble();
					e.setSalary(salary);
					break;

				default:
					break;
				}

				System.out.println("Employee Details are:");
				System.out.println("\t" + e);
				break;

			case 5:
				list.print_list();
				break;

			default:
				System.out.println("Invalid Choice");
				break;
			}

		} while (ch != 0);
	}

}
