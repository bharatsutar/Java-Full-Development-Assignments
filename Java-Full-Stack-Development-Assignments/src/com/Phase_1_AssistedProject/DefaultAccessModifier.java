package com.Phase_1_AssistedProject;
class BaseClass 
{ 
    void display()      //no access modifier indicates default modifier
       { 
           System.out.println("Default Access Modifier"); 
       } 
} 
public class DefaultAccessModifier {
	public static void main(String args[]) 
    {   
       //access class with default scope
       BaseClass obj = new BaseClass(); 

       obj.display();    //access class method with default scope
    } 
}
