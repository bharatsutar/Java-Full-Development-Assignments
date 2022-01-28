package com.AssistedProject;
class A 
{ 
   protected void display() 
    { 
        System.out.println("SoftwareTestingHelp"); 
    } 
} 
 
class B extends A {}  
class C extends B {}
public class ProtectedAccessSpecifier {
	public static void main(String[] args) {
		
		{   
		       B obj = new B();     //create object of class B   
		       obj.display();       //access class A protected method using obj
		       C cObj = new C();    //create object of class C
		       cObj.display ();     //access class A protected method using cObj
		   } 
	}
}
