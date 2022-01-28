package com.AssistedProject;

class AddharCard {
	String name;
	String dob;
	String contactNo;

	public AddharCard() { //Default Constructor
		System.out.println("This my addhar card details.......");
	}

	public AddharCard(String name, String dob, String contactNo) { //Parameterized Constructor
		this.name = name;
		this.dob = dob;
		this.contactNo = contactNo;
		System.out.println("Addhar Name    : "+name);
		System.out.println("Date Of Birth  : "+dob);
		System.out.println("Contact Number : "+contactNo);

	}

}

public class ConstructorWithTypes {
	public static void main(String[] args) {

		AddharCard a = new AddharCard();
		AddharCard p = new AddharCard("Bharat", "12-04-1998", "9876543290");
	}
}
