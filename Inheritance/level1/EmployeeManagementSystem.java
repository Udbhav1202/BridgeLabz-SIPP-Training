package Inheritance.level1;

class Employee{
	String role;
	int id;
	double salary;
	
	public Employee(String role, int id, double salary){
		this.role = role;
		this.id = id;
		this.salary = salary;
	}
	
	void displayDetails() {
		System.out.println("Role: "+role);
		System.out.println("ID: "+id);
		System.out.println("Salary: "+salary);
	}
}

class Manager extends Employee{
	Manager(String role, int id, double salary){
		super(role, id, salary);
	}
	void teamSize() {
		System.out.println("Size of 10");
	}
	
}

class Developer extends Employee{
	Developer(String role, int id, double salary){
		super(role, id, salary);
	}
	
	void programmingLanguage() {
		System.out.println("Programming language: Java");
	}
}
public class EmployeeManagementSystem {

	public static void main(String[] args) {
		Employee em1 = new Employee("Manager", 2344, 50000.0);
		Manager em2 = new Manager("Manager", 432, 50000.0);
		Developer em3 = new Developer("Developer", 4332, 50000.0);
		em1.displayDetails();
		em1.displayDetails();
		em1.displayDetails();
		
		em2.teamSize();
		em3.programmingLanguage();
	}

}
