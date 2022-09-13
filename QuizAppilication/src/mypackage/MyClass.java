package mypackage;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		//variable declaration
		
		String name;
		int score=0,ans;
		Scanner obj = new Scanner(System.in);
		
		//Read name from USER
		
		System.out.println("Enter your name: ");
		name = obj.nextLine();
		
		System.out.println("********************");
		
		System.out.println("hi "+name+",welcome to quiz");
		System.out.println("*****************************");
		System.out.println("Q1. Capital of Australia: ");
		System.out.println("1.england 2.canberra 3.Moscow");
		
		System.out.println("Enter your choice : ");
		ans = obj.nextInt();
		if(ans==2) {
			score=score+20;
		}
		
		System.out.println("Q2. Capital of India: ");
		System.out.println("1.Delhi 2.canberra 3.Moscow");
		
		System.out.println("Enter your choice : ");
		ans = obj.nextInt();
		if(ans==1) {
			score=score+20;
		}
		
		System.out.println("Q3. Capital of Telangana: ");
		System.out.println("1.england 2.Hyderabad 3.Moscow");
		
		System.out.println("Enter your choice : ");
		ans = obj.nextInt();
		if(ans==2) {
			score=score+20;
		}
		
		System.out.println("Q4. Capital of Andhra pradesh: ");
		System.out.println("1.england 2.canberra 3.Amaravathi");
		
		System.out.println("Enter your choice : ");
		ans = obj.nextInt();
		if(ans==3) {
			score=score+20;
		}
		
		System.out.println("Q1. Capital of Bihar: ");
		System.out.println("1.england 2.patna 3.Moscow");
		
		System.out.println("Enter your choice : ");
		ans = obj.nextInt();
		if(ans==2) {
			score=score+20;
		}
		
		if (score>60)
			System.out.println("Hi " +name+ ", yo have pass with "+ score);
		else
			System.out.println("Hi " +name+ ", yo have failed with "+ score);
	

	}

}
