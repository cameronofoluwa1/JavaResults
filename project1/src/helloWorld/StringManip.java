package helloWorld;

public class StringManip {

	public static void main(String[] args) {
		changeGiven(50.48);
	}

	public static int countWords(String input) {
		if (input == null || input.isEmpty()) {
			return 0;
		}
		String[] words = input.split("\\s+");
		return words.length;
	}

	public static void changeGiven(double NumberOfMoney){
	    int NumberOfCoins = (int)(NumberOfMoney * 100);

	    System.out.println("Amount of Money: " + NumberOfMoney + "\n");

	    int NumberOfFivePounds = (int)(NumberOfCoins/500);
	    NumberOfCoins = NumberOfCoins - 500 * NumberOfFivePounds;
	    System.out.println("£5: " + NumberOfFivePounds);

	    int NumberOfPoundCoins = (int)(NumberOfCoins/100);
	    NumberOfCoins = NumberOfCoins - 100 * NumberOfPoundCoins;
	    System.out.println("£1: " + NumberOfPoundCoins);

	    int NumberOfFiftyP = (int)(NumberOfCoins/50);
	    NumberOfCoins = NumberOfCoins - 50 * NumberOfFiftyP;
	    System.out.println("50p: " + NumberOfFiftyP);

	    int NumberOfTwentyP = (int)(NumberOfCoins/20);
	    NumberOfCoins = NumberOfCoins - 20 * NumberOfTwentyP;
	    System.out.println("20p: " + NumberOfTwentyP);

	    int NumberOfTenP = (int)(NumberOfCoins/10);
	    NumberOfCoins = NumberOfCoins - 10 * NumberOfTenP;
	    System.out.println("10p: " + NumberOfTenP);

	    int NumberOfFiveP = (int)(NumberOfCoins/5);
	    NumberOfCoins = NumberOfCoins - 5 * NumberOfFiveP;
	    System.out.println("5p: " + NumberOfFiveP);

	    int NumberOfTwoP = (int)(NumberOfCoins/2);
	    NumberOfCoins = NumberOfCoins - 2 * NumberOfTwoP;
	    System.out.println("2p: " + NumberOfTwoP);

	    int NumberOfOneP = (int)(NumberOfCoins/1);
	    NumberOfCoins = NumberOfCoins - 1 * NumberOfOneP;
	    System.out.println("1p: " + NumberOfOneP);
	}
}
