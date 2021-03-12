package Com.Syntax.class04;

public class Dog {
String breed;
String name;
String color;
public static void main(String[] args) {
	
	Dog dog1= new Dog();
	Dog dog2= new Dog();
	Dog dog3 = new Dog();
	dog1.breed= "Husky";
	dog2.breed= "Bulldog";
	dog3.breed= "Labrador";
	dog1.bark();
	dog1.run();
	dog1.play();
	
	dog2.bark();
	dog2.run();
	dog2.play();
	
	dog3.bark();
	dog3.run();
	dog3.play();
}
	void bark() {
		System.out.println(breed + " can bark");
	}

	void run() {
		System.out.println(breed + " can run");
	}

	void play() {
		System.out.println(breed + " can play");
	}

	
	

	
}
	

