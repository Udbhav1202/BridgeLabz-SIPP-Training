package Inheritance.level1;

class Animal {
	String name;
	int age;

	Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

 	void makeSound() {
 		System.out.println("Some generic animal sound");
 	}
}

class Dog extends Animal {
	Dog(String name, int age) {
		super(name, age);
	}

	@Override
	void makeSound() {
		System.out.println(name + " Woof!");
	}
}

class Cat extends Animal {
	Cat(String name, int age) {
		super(name, age);
	}

	@Override
 	void makeSound() {
		System.out.println(name + "  Meow!");
	}
}

class Bird extends Animal {
	Bird(String name, int age) {
		super(name, age);
	}

	@Override
	void makeSound() {
		System.out.println(name + "Tweet!");
	}
}

public class Inheritance {
	public static void main(String[] args) {
     Animal myDog = new Dog("Bruno", 3);
     Animal myCat = new Cat("Whiskers", 2);
     Animal myBird = new Bird("Tweety", 1);

     myDog.makeSound();
     myCat.makeSound();
     myBird.makeSound();
 }
}
