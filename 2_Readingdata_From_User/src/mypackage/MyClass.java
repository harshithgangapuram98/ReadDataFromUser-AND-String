package mypackage;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) 
	{
		//variable declaration
		Scanner obj = new Scanner(System.in);
		String name;
		float salary;
		int age;
		
		//read data from user
		
		System.out.println("Enter your name :");
		name = obj.nextLine();
		
		System.out.println("Name ="+ name);
		
		System.out.println("Enter your salary :");
		salary = obj.nextInt();
		
		System.out.println("Salary ="+ salary);
		
		System.out.println("Enter your age :");
		age = obj.nextInt();
		
		System.out.println("Age ="+ age);
				
				

	}

}
