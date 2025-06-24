package ClassesAndObjects.level1;

class Circle{
	double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public void display() {
		System.out.println("Area of Circle: "+ (3.14*radius*radius));
	}
}

public class AreaOfCircle {

	public static void main(String[] args) {
		Circle cir = new Circle(2.5);
		cir.display();

	}

}
