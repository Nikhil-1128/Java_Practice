package javaPackage;

public class LogicalOperator {

	public static void main(String[] args) {

		int a = 10; // local variable
		int b = 5; // local variable
		int c = 20; // local variable

		// logical operator
		System.out.println(a < b && a < c); // false

		// bitwise operator

		System.out.println(a < b & a < c); // false & true

	}

}
