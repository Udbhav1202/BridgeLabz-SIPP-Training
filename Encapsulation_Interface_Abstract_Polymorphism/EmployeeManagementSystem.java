package Encapsulation_Interface_Abstract_Polymorphism;

abstract class Employee{
	int employeeId;
	String name;
	private double baseSalary;
	
	Employee(int employeeId, String name, double baseSalary){
		this.employeeId = employeeId;
		this.name = name;
		this.baseSalary = baseSalary;
	}
	
	public abstract void calculateSalary();
	
	public void displayDetails() {
		System.out.println("Employee ID: "+employeeId);
		System.out.println("Employee Name: "+name);
		System.out.println("Employee BaseSalary: "+baseSalary);
	}
	
	public double getBaseSalary() {
		return baseSalary;
	}
	
	public void setBaseSalary(double baseSalary) {
	    this.baseSalary = baseSalary;
	}
}

class FullTimeEmployee extends Employee {
	int totalHours;
	
	FullTimeEmployee(int employeeId, String name, double baseSalary, int totalHours){
		super(employeeId, name, baseSalary);
		this.totalHours = totalHours;
	}
	
	@Override
    public void calculateSalary() {
        double salaryPerHour = 20.0; 
        double totalSalary = totalHours * salaryPerHour;
        System.out.println("Full-Time Employee Salary: " + totalSalary);
    }
	
	
}

class PartTimeEmployee extends Employee{
	
	int totalHours;
	PartTimeEmployee(int employeeId, String name, double baseSalary, int totalHours){
		super(employeeId, name, baseSalary);
		this.totalHours = totalHours;
	}
	
	@Override
    public void calculateSalary() {
        double salaryPerHour = 10.0;  
        double totalSalary = totalHours * salaryPerHour;
        System.out.println("Part-Time Employee Salary: " + totalSalary);
    }
}

interface Department{
	
	default String assignDepartment() {
		return "Development";
	}
	
	static void getDepartmentDetails(Employee employee) {
		System.out.println("Employee ID: "+employee.employeeId);
		System.out.println("Employee Name: "+employee.name);
	}
}
public class EmployeeManagementSystem {

	public static void main(String[] args) {
        Employee fullTimeEmp = new FullTimeEmployee(101, "John Doe", 3000, 160);
        Employee partTimeEmp = new PartTimeEmployee(102, "Jane Smith", 1500, 80);

        Employee[] employees = {fullTimeEmp, partTimeEmp};
        
        for (Employee emp : employees) {
            emp.displayDetails();
            emp.calculateSalary();
            System.out.println();  
        }

        Department.getDepartmentDetails(fullTimeEmp);
        Department.getDepartmentDetails(partTimeEmp);
	}

}
