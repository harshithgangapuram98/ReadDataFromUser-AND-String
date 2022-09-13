package mypackage;

public class MyClass {

	public static void main(String[] args) {
		String s1 = new String("meg");
		String s2 = new String ("meg");
		
		if(s1==s2) {
			System.out.println("Equal");
		}else {
			System.out.println("Not Equal");
		}
	}

}
