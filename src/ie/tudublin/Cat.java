package ie.tudublin;

public class Cat extends Animal {
	private int numLives;

	public Cat(String name) {
		// Constructor chaining
		super(name);
		setNumLives(9);
	}

	public int getNumLives() {
		return numLives;
	}

	public void setNumLives(String name) {
		this.name = name;
	}

	public void speak() {
		System.out.println("Meow!");
	}
}