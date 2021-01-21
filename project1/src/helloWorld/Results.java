package helloWorld;

import java.util.Scanner;

public class Results {

	public static void main(String[] args) {
	    Scanner myObj = new Scanner(System.in);
	    System.out.println("Enter Chemistry mark = ");
		int chemMark = myObj.nextInt();
	    System.out.println("Enter Biology mark = ");
		int bioMark = myObj.nextInt();
	    System.out.println("Enter Physics mark = ");
		int physMark = myObj.nextInt();
		int totalMark = chemMark + bioMark + physMark;
		int totalPercentage = 0;

		displayResults(bioMark, chemMark, physMark, totalMark);

		System.out.println("\nPercentage " + displayPercentage(totalMark));
	}

	public static void displayResults(int bioMark, int chemMark, int physMark, int totalMark) {
		System.out.println("====== RESUULTS ======");
		System.out.println("Biology : " + bioMark);
		System.out.println("Chemistry : " + chemMark);
		System.out.println("Physics : " + physMark);
		System.out.print("Total : " + totalMark);
	}

	public static int displayPercentage(int totalMark) {
		int totalPercentage = (totalMark * 100) / 450;
		return totalPercentage;
	}
}