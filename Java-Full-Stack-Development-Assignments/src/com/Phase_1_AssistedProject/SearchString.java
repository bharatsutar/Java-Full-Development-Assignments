package com.Phase_1_AssistedProject;
import java.util.Scanner;

public class SearchString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] arr = new String[] { "bharat", "pavan", "kaustubh", "vittal", "rushi" };

		System.out.println("Enter string for search");
		String search = sc.next();
		boolean flag = true;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(search)) {
				System.out.println("String is found");
				flag = false;
			}

		}
		if (flag)
			System.out.println("not found");

	}

}
