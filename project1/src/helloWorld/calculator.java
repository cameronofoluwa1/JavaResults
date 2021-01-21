package helloWorld;

public class Calculator {

	public static void main(String[] args) {
		System.out.println(division(10, 11));
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
		if (num1 >= num2) {
			double divi = num1 / num2;
			return divi;
		}else { System.out.println("First number must be bigger than the second.");
		return 0;
		}
	}

}
