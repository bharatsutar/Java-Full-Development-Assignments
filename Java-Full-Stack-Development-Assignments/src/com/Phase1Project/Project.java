package com.Phase1Project;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Project {
	static String DIRECTORY;
	static File folder_name;

	public Project() {
		DIRECTORY = System.getProperty("user.dir");
		folder_name = new File(DIRECTORY + "/files");

	}

	public static void main(String[] args) {
		Project p = new Project();
		System.out.println("                                   Welcome                 ");
		boolean exit = false;
		while (!exit) {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			System.out.println("1.Create File \n2.Search File \n3.Delete File \n4.Show File \n5.Exit");
			System.out.print("Enter your choice number : ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				createFile();
				break;

			case 2:
				searchFile();
				break;

			case 3:
				deleteFile();
				break;

			case 4:
				showFile();
				break;

			case 5:
				exit = true;
				break;

			default:
				System.out.println("Enter Valid Option");
			}
		}

	}

	public static void createFile() {
		try {
			System.out.print("Enter file name : ");
			@SuppressWarnings("resource")
			Scanner fi = new Scanner(System.in);
			String fileName = fi.nextLine();
			File file = new File(folder_name + "/" + fileName);
			boolean flag = file.createNewFile();
			if (flag) {
				System.out.println("File has been created successfully at the specified location");
			} else {
				System.out.println("File already present at the specified location");
			}
		} catch (IOException e) {
			System.out.println("Exception Occurred:");
			e.printStackTrace();
		}
	}

	public static void searchFile() {
		try {
			@SuppressWarnings("resource")
			Scanner sf = new Scanner(System.in);
			System.out.print("Enter the file name to open : ");
			String name = sf.nextLine();

			String[] flist = folder_name.list();
			int flag = 0;
			if (flist == null) {
				System.out.println("Empty directory.");
			} else {
				for (int i = 0; i < flist.length; i++) {
					String filename = flist[i];
					if (filename.equalsIgnoreCase(name)) {
						System.out.println(filename + " found");
						flag = 1;
					}
				}
			}
			if (flag == 0) {
				System.out.println("File Not Found");
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void deleteFile() {
		try {
			@SuppressWarnings("resource")
			Scanner dl = new Scanner(System.in);
			System.out.print("Enter the file name to delete: ");
			String name = dl.nextLine();
			System.out.println("Path " + name);
			File f = new File(folder_name + "/" + name);
			if (f.delete()) {
				System.out.println("File " + f.getName() + " is deleted");

			} else {
				System.out.println("Delete operation failed");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void showFile() {

		try {
			if (folder_name.list().length == 0) {
				System.out.println("Empty directory");
			} else {
				String[] list = folder_name.list();
				Arrays.sort(list);
				for (String str : list) {
					System.out.println(str);
				}
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
