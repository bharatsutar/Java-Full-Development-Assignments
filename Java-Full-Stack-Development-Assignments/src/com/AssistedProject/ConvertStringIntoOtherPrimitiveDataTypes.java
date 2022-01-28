package com.AssistedProject;
import java.util.Scanner;
import java.text.ParseException;

public class ConvertStringIntoOtherPrimitiveDataTypes {
	public static int toInt(String s) {
		return Integer.parseInt(s);
	}

	public static long tolong(String s) {
		return Long.parseLong(s);
	}

	public static double todouble(String s) {
		return Double.parseDouble(s);
	}

	public static float tofloat(String s) {
		return Float.parseFloat(s);
	}

	public static char[] toCharArray(String s) {
		return s.toCharArray();
	}

	public static byte[] toByteArray(String s) {
		return s.getBytes();
	}

	public static boolean toboolean(String s) {
		return Boolean.parseBoolean(s);
	}

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter String");
			String s = sc.next();
			System.out.println("To primitive int: " + toInt(s));
			System.out.println("To primitive long: " + tolong(s));
			System.out.println("To primitive double: " + todouble(s));
			System.out.println("To primitive float: " + tofloat(s));
			System.out.println("To primitive char: " + toCharArray(s));
			System.out.println("To primitive byte: " + toByteArray(s));
			System.out.println("To primitive boolean: " + toboolean(s));
			sc.close();
		} catch (NumberFormatException nfe) {

			System.out.println(nfe);

		}

	}

}
