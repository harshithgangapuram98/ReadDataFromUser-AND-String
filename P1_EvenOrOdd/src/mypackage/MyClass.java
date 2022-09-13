package mypackage;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		
		//variable declaration
		int input;
		Scanner obj = new Scanner(System.in);
		
		//Read from user
		System.out.println("Enter any number: ");
		input=obj.nextInt();
		
		
		//logic
		if(input%2==0)
			System.out.println("Even");
		else
			System.out.println("odd");

	}

}
