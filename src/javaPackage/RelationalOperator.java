package javaPackage;

public class RelationalOperator {

	public static void main(String[] args) {
		
		int a=300; // local variable
		int b=300; //local variable 
		
		if (a!=b)
		{
			System.out.println("a is not equal to b");
		}else {
			System.out.println("a and b are equal");
		}
			
		String p="seleNium CLAss";
		String q="Selenium CLAss";
		
		// 1st way of string comparison is not correct, never compare string like this
		//we always use == to compare number 
		
		if (p==q)
		{
			System.out.println("p and q are equal for 1st way");
		}else {
			System.out.println("p and q are not equal for 1st way");
		}

		//2nd way of String comparison which is not appropriate
		if (p.equals(q))
		{
			System.out.println("p and q are equal for 2st way");
		}else {
			System.out.println("p and q are not equal for 2st way");
		}
		
		//3rd way of String comparison which correct
		
		if (p.equalsIgnoreCase(q))
		{
			System.out.println("p and q are equal for 3rd way");
		}else {
			System.out.println("p and q are not equal for 3rd way");
		}
	}

}
