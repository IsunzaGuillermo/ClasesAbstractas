package abstractAnimal;

public abstract class Animal {

	// Attributes
	String name;

	// Methods
	public abstract void move();

	public abstract void calls();

}// Animal

class Frog extends Animal {

	@Override
	public void move() {
		System.out.println("Frogs move jumping");
	}

	@Override
	public void calls() {
		System.out.println("Frogs make different sounds to call mates");
	}

}// Frog

class Vulture extends Animal {

	@Override
	public void move() {
		System.out.println("Vultures fly");
	}

	@Override
	public void calls() {
		System.out.println("Vultures hiss because they lack a syrinx");
	}

}//Vulture

class Crocodile extends Animal {

	@Override
	public void move() {
		System.out.println("Crocodiles can gallop on land");

	}

	@Override
	public void calls() {
		System.out.println("Crocodiles bellow");

	}

}// Crocodile

class Gibbon extends Animal {

	@Override
	public void move() {
		System.out.println("Gibbons use brachiation when moving thru the trees");
	}

	@Override
	public void calls() {
		System.out.println("Gibbons make songs to mark their territory");
	}

}// Gibbon

class Lamprey extends Animal {

	@Override
	public void move() {
		System.out.println("Lampreys swim");
	}

	@Override
	public void calls() {
		System.out.println("Lampreys don't make calls or sounds");
	}

}// Lamprey
