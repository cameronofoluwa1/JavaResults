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

		System.out.println("\nPercentage " + displayPercentage(totalMark, bioMark, chemMark, physMark) +"%");
	}

	public static void displayResults(int bioMark, int chemMark, int physMark, int totalMark) {
		System.out.println("====== RESUULTS ======");
		System.out.println("Biology : " + bioMark);
		System.out.println("Chemistry : " + chemMark);
		System.out.println("Physics : " + physMark);
		System.out.println("Total : " + totalMark);
	}

	public static int displayPercentage(int totalMark, int bioMark, int chemMark, int physMark) {
		int totalPercentage = (totalMark * 100) / 450;
		if (totalPercentage >= 60) {
			if(((bioMark*100) / 150) >= 60 || ((chemMark*100) / 150) > 60 || ((physMark*100) / 150) > 60) {
				System.out.println("Congratulations, you passed!");
			}else {
				System.out.println("\nOops, you got less than 60% on one of your exams. You failed.");
			}
		}else {
			System.out.println("\nOops, you got less than 60%. You failed.");
		}return totalPercentage;
	}
}
