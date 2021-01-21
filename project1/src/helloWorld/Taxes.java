package helloWorld;

public class Taxes {

	int salary = 0;

	public static void main(String[] args){
		System.out.println(method1(45000));
		System.out.println("You will end up paying £" + method2(45000) + " tax");
	}

	public static int method1(int salary) {
		if (salary >= 0 && salary <= 14999) {
			return salary;
		}
		if (salary >= 15000 && salary <= 19999) {
			return (int) (salary * 0.90);
		}
		if (salary >= 20000 && salary <= 29999) {
			return (int) (salary * 0.85);
		}
		if (salary >= 30000 && salary <= 44999) {
			return (int) (salary * 0.80);
		} else {
			return (int) (salary * 0.75);
		}
	}

	public static int method2(int salary) {
		if (salary >= 0 && salary <= 14999) {
			return salary;
		}
		if (salary >= 15000 && salary <= 19999) {
			return (int) (salary * 0.10);
		}
		if (salary >= 20000 && salary <= 29999) {
			return (int) (salary * 0.15);
		}
		if (salary >= 30000 && salary <= 44999) {
			return (int) (salary * 0.20);
		} else {
			return (int) (salary * 0.25);
		}
	}
}
