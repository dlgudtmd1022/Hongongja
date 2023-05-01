package animal;

public class animalExample {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.sound();
		cat.sound();

	
	animal animal = null;
	animal = new Dog();
	animal.sound;
	
	animal = new Cat();
	animal.sound;

	animalSound(new Dog());
	animalSound(new Cat());
	
	}
	public static void animalSound(animal animal) {
		animal.sound();
	}
	
}

