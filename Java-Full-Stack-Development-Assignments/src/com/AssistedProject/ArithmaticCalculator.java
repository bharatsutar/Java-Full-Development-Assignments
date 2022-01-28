package com.AssistedProject;
import java.util.Scanner;

public class ArithmaticCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number :");
		int number1 = sc.nextInt();
		System.out.println("Enter Operation");
		char choice = sc.next().charAt(0);
		System.out.println("enter second number :");
		int number2 = sc.nextInt();
		int result = 0;
		
		switch (choice) {
		case '+':
			result = number1 + number2;
			System.out.println(result);
			break;

		case '-':
			result = number1 - number2;
			System.out.println(result);
			break;

		case '*':
			result = number1 * number2;
			System.out.println(result);
			break;

		case '/':
			result = number1 / number2;
			System.out.println(result);
			break;

		default:
			System.out.println("Invalid operator");
			break;

		}

	}

}
