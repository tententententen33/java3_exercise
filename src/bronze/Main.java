package bronze;

class Animal {
	public void speak() {
		System.out.println("動物が鳴く");
	}
}

class Dog extends Animal{
	public void speak() {
		System.out.println("わんわん");
	}
}

class Cat extends Animal{
	public void speak() {
		System.out.println("にゃー");
	}
}

class Bird extends Animal{
	public void speak() {
		System.out.println("ちゅんちゅん");
	}
}

public class Main {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		Bird bird = new Bird();
		dog.speak();
		cat.speak();
		bird.speak();
		
		Animal[] animal = {new Dog(), new Cat(), new Bird()};
		
		for (Animal a : animal) {
			a.speak();
		}
	}
}
