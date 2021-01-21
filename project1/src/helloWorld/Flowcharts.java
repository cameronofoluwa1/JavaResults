package helloWorld;

public class Flowcharts {

	public static void main(String[] args) {
		blackjack(1, 22);
	}

	public static int newMethod(int int1, int int2, boolean newBool) {
		if (newBool == false) {
			return int1 * int2;
		} else {
			return int1 + int2;
		}

	}

	public static void flowchart(int valueA) {
		if (valueA > 2000) {
			print("A");
			if (valueA > 6000) {
				print("B");
			} else {
				print("B");
				if (valueA > 4000) {
					print("D");
				} else {
					print("E");
				}
			}
		} else {
			print("1");
			if (valueA > 100) {
				print("3");
				if (valueA > 600) {
					print("5");
				} else {
					print("4");
					if (valueA > 500) {
						print("6");
					} else {
						print("5");
					}
				}
			} else {
				print("2");
			}
		}
	}

	public static void print(String newInput) {
		System.out.println(newInput);
	}

	public static void blackjack(int int1, int int2) {
		if (int1 == 0 || int2 == 0 || int2 > 21 || int1 > 21) {
			print("There was a 0 value or value greater than 21. cannot run");
		} else {
			if ((int1 - 21) > (int2 - 21)) {
				print("The value " + int1 + " is closer to 21 than the value " + int2);
			}
			if ((int2 - 21) > (int1 - 21)) {
				print("The value " + int2 + " is closer to 21 than the value " + int1);
			}
		}
	}

	public static void uniqueSum(int int1, int int2, int int3) {
		if (int1 != int2 && int1 != int3 && int2 != int3) {
			print("Total = " + (int1 + int2 + int3));
		} else {
			if (int1 != int2 && int2 == int3) {
				print("Total = " + int1);
			}
			if (int1 != int3 && int2 == int3) {
				print("Total = " + int1);
			}
			if (int2 != int3 && int1 == int3) {
				print("Total = " + int2);
			}
			if (int3 != int2 && int1 == int2) {
				print("Total = " + int3);
			} else {
				print("Total = " + (int1 + int2 + int3));
			}
		}

	}
}
