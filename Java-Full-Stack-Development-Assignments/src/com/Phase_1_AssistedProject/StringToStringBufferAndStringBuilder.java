package com.Phase_1_AssistedProject;

public class StringToStringBufferAndStringBuilder {
	public static void main(String[] args) {
		StringBuffer();
		StringBuilder();
	}

	static void StringBuffer() {
		// String - 1
		String str1 = " Java  was originally developed by James Golsling";

		// create StringBuffer object
		StringBuffer sb = new StringBuffer();

		// 1. convert String to StringBuffer
		// using append() method
		sb.append(str1);

		// String - 2
		String str2 = " at Sun Microsystems and Released in 1995";

		// 2. again, convert String-2 to StringBuffer
		// using append() method
		sb.append(str2);

		// String - 3
		String str3 = "(Which has since been acquired by Oracle)";

		// 3. third time, convert String-3 and
		// add newline '\n' using + operator
		sb.append("\n" + str3);

		// print to console
		System.out.println("Ex: String to StringBuffer" + " using append() method : \n\n" + sb);
	}

	static void StringBuilder() {
		String str1 = "Conversion Of String to StringBuilder  ";
		StringBuilder sb = new StringBuilder();

		sb.append(str1);
		String str2 = "(Conversion done Successfully)";
		sb.append(str2);
		// convert String to StringBuilder
		// using append() method

		System.out.println("****************************");
		System.out.println();
		System.out.println("Converting String to String Builder");

		System.out.println(sb);
	}

}
