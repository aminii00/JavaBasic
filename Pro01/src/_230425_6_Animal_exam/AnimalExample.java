package _230425_6_Animal_exam;

public class AnimalExample {
	public static void animalSound (Animal animal) {
		animal.sound();
	}

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("-------");
		
		Animal animal = null; //�߻�Ŭ������ �����ڷ� ȣ�� X
		animal = new Dog();
		animal.sound();
		animal = new Cat();
		animal.sound();
		System.out.println("-------");
		
		animalSound(new Dog());
		animalSound(new Cat());
	}
}