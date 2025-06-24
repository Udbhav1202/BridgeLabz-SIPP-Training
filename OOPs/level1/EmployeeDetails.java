package OOPs.level1;

class Employee{
	int id;
	String name;
	
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public void display() {
		System.out.println("Employee ID: "+ id);
		System.out.println("Employee Name: "+ name);
	}
}

public class EmployeeDetails {
	public static void main(String[] args) {
		Employee Emp1 = new Employee(123, "udbhav");
		Employee Emp2 = new Employee(13, "yoge");
		
		System.out.println("Employees");
		Emp1.display();
		Emp2.display();
		
	}
}
