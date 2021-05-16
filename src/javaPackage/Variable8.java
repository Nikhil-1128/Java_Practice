package javaPackage;

public class Variable8 {

	int b = 12; // Global Variable
	static int c = 10; // Static Variable

	public static void main(String[] args) {

		int a = 5; // Local Variable

		Variable8 v = new Variable8();

		System.out.println(v.b); // 12 // Calling a Variable
		System.out.println(c);// 10
		v.a(); // Calling a method

	}

	public void a() {
		System.out.println("Hello Selenium");
	}

}
