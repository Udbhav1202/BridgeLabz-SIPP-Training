package OOPs.level2;

class Student{
	String name;
	int rollNumber;
	int marks;
	
	public Student(String name, int rollNumber, int marks) {
		this.name = name;
		this.rollNumber = rollNumber;
		this.marks = marks;
	}
	
	public void calculateGrade(int marks) {
		if(marks >=91) {
			System.out.println("Student Grade: A");
		}else if(marks>= 81) {
			System.out.println("Student Grade: B");
		}else {
			System.out.println("Student Grade: C");
		}
	}
	
	public void display() {
		System.out.println("Name: "+name);
		System.out.println("RollNumber: "+rollNumber);
		System.out.println("Marks: "+marks);
	}
}
public class StudentDetails {

	public static void main(String[] args) {
		Student stu1 = new Student("udbhav", 12, 98);
		
		stu1.calculateGrade(stu1.marks);
		stu1.display();
		System.out.println("==================================================");
		Student stu2 = new Student("max", 13, 94);
		stu2.calculateGrade(stu2.marks);
		
		stu2.display();

	}

}
