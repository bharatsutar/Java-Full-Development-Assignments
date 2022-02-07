package com.Phase_1_AssistedProject;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchStringRegulerExpresssion {
	
	 public static void main(String args[]) {

	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String str = sc.nextLine();

	        Set<String> data = new LinkedHashSet<String>();
	        data.add("bharat is good person");
	        data.add("vishal is good person");
	        data.add("nishant is good person");
	        data.add("onkar is good person");
	        data.add("vaibhav is good person");
	        int flag = 0;

	        for (String s : data) {

	            Pattern p = Pattern.compile(str);
	            Matcher m = p.matcher(s);

	            if (m.find()) {
	                flag = 0;
	                break;
	            } else {
	                flag = 1;
	            }
	        }

	        if (flag == 0) {
	            System.out.println("Found a match");
	        } else {
	            System.out.println("Not Found a match");
	        }

	    }

}
