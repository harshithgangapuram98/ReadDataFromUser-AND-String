package mypackage;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		
		
		//variable declaration
		int n;
		int i;
		int sum=0;
		Scanner obj = new Scanner(System.in);
		
		//read from user
		
		System.out.println("Enter any number: ");
		n=obj.nextInt();
		
		//logic
		for(i=1;i<=n;i++)
		sum+= i;
			System.out.println(sum);
			

	}

}
