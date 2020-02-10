package ie.tudublin;

public class Animal {
	private String name;

	// Constructor
	// Same name as the class
	// No return type
	// If you don't add one, you get a default one
	public Animal(String name) {
		setName(name);
	}

	// Accessor methods
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}