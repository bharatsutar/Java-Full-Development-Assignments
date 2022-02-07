package com.Phase_1_AssistedProject;
class OuterDemo {
	int value = 23;

	class Inner {
		int value = 20;

		public void print() {
			int value = 10;
			System.out.println("This is inner class");
			System.out.println("Accessing inner class method value   : " + value);
			System.out.println("Accessing inner class instance value : " + this.value);
			System.out.println("Accessing outer class instance value : " + OuterDemo.this.value);

		}
	}

	void Display() {
		Inner i = new Inner();
		i.print();
	}
}

public class WorkingWithInnerClass {
	public static void main(String[] args) {
		OuterDemo o = new OuterDemo();
		o.Display();

	}

}
