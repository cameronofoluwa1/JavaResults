package helloWorld;

public class FizzBuzz {

	public static void main(String[] args) {
		numChecker(4);

	}

	public static void numChecker(int int1) {
		if (int1 % 3 == 0 && int1 % 5 == 0) {
			System.out.println("FizzBuzz");
		}
		else if (int1 % 5 == 0) {
			System.out.println("Buzz");
		}
		else if (int1 % 3 == 0) {
			System.out.println("Fizz");
		} else {
			System.out.println("Nevermind, " + int1);
		}
	}

}
