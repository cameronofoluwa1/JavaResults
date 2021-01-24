package helloWorld;

public class Bottles {

	public static void main(String[] args) {
		bottleSong(5);

	}

	public static void bottleSong(int numOfBottles) {
		int totalBottles = numOfBottles;
		for (int i = 0; i < totalBottles; i++) {
			System.out.println(numOfBottles + " bottles of beer on the wall, " + numOfBottles + "bottles of beer.");
			System.out.println(
					"Take one down and pass it around, " + (numOfBottles - 1) + " bottles of beer on the wall.");
			numOfBottles--;
		}
	}
}
