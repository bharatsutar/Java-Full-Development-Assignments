package com.AssistedProject;
 class Animal {
	// public variable
	public int legCount;

	// public method
	public void display() {
		System.out.println("I am an animal.");
		System.out.println("I have " + legCount + " legs.");
	}
}

public class PublicAccessSpecifier {
	public static void main(String[] args) {
		// accessing the public class
		Animal animal = new Animal();

		// accessing the public variable
		animal.legCount = 4;
		animal.display();
	}

}
