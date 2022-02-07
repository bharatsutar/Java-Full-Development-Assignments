package com.Phase_1_AssistedProject;
class DataClass {
	private String strname;

	public String getName() {
		return this.strname;
	}

	public void setName(String name) {
		this.strname = name;
	}
}

public class PrivateAccessSpecifier {
	public static void main(String[] main) {
		DataClass d = new DataClass();

		d.setName("Java Programming");
		System.out.println(d.getName());
	}
}
