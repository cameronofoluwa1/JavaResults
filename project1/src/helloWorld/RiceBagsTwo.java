package helloWorld;

public class RiceBagsTwo {

	public static void main(String[] args) {

	}

	public static void method1(int SRB, int BRB, int rice) {

		int newRiceValue = 0; // New calc value
		int BRBU = 0; // Big rice bags used
		int SRBU = 0; // Small rice bags used

		for (int i = 0; i < BRB && rice >= 1; i++) {
			if (Math.floor(rice / 5) >= 1) {
				BRBU++;
				System.out.println("Big rice bags used : " + BRBU);
				rice = rice - 5;
			}
		}
		for(int i = 0; i < SRB && rice >= 1; i++) {
			if (rice > 0) {
				SRBU++;
				System.out.println("Small rice bags used : " + SRBU);
				rice = rice - 1;
			}
		}
		
		System.out.println("Rice left over : " + rice + "kg");
	}

	public static int method2(int rice) {
		return (int) Math.floor(rice / 1);
	}
}
