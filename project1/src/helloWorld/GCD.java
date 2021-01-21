package helloWorld;

public class GCD {
	public static void main(String[] args) {

		method1(10, 20);

	}

	public static void method1(int int1, int int2) {

		int gcd = 0;

		for (int i = 1; i <= int1 && i <= int2; i++) {
			if (int1 % i == 0 && int2 % i == 0)
				gcd = i;
		}

		System.out.printf("GCD of %d and %d is: %d", int1, int2, gcd);
	}

}
