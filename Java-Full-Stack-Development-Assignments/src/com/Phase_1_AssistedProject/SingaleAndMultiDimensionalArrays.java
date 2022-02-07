package com.Phase_1_AssistedProject;

public class SingaleAndMultiDimensionalArrays {
	public static void main(String args[]) {
		System.out.println("Single Dimensional Array");
		singleDimensionalArray();
		System.out.println("--------------------------");
		System.out.println("Multi Dimensional Array");
		multiDimensionalArray();
	}

	static void singleDimensionalArray() {
		int number[];
		number = new int[5];
		number[0] = 31;
		number[1] = 28;
		number[2] = 31;
		number[3] = 30;
		number[4] = 31;

		System.out.println("check " + number[3]);
	}

	static void multiDimensionalArray() {
		int[][][] intArray = { { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } } };
		System.out.println("3-d array is given below :");
		for (int i = 0; i < 1; i++)
			for (int j = 0; j < 3; j++)
				for (int z = 0; z < 3; z++)
					System.out.println("intArray [" + i + "][" + j + "][" + z + "] = " + intArray[i][j][z]);
	}

}
