package javaPackage;

public class IfElse4 {

	public static void main(String[] args) {

		int age = 25; // local variable
		int weight = 50;// local variable

		// outer if block

		if (age > 18) {

			// Inner variable
			if (weight > 50) {
				System.out.println("Eligible fo voating");
			} else {
				System.out.println("Not Eligible");
			}

		} else {
			System.out.println("age should be greater that 18");
		}

	}

}
