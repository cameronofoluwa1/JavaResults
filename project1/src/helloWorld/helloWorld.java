package helloWorld;

public class HelloWorld {

	public static void main(String[] args) {
	}

	public static void print(String welcomeText) {
		System.out.println("Hello " + welcomeText);
	}
	
	public static int multiplication(int num1, int num2) {
		int multi = num1 * num2;
		return multi;
	}
	
	public static int subtraction(int num1, int num2) {
		int subct = num1 - num2;
		return subct;
	}
	
	public static double division(int num1, int num2) {
		double divi = num1 / num2;
		return divi;
	}
}
