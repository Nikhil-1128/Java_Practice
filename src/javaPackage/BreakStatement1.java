package javaPackage;

public class BreakStatement1 {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {

			// If Statement

			if (i == 5) {
				break;
			}

			System.out.println(i);
		}
		System.out.println("Control came out of the loop as expected");
	}

}
