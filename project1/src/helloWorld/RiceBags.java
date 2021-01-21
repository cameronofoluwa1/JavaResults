package helloWorld;

public class RiceBags {
	
	public static void main(String[] args) {
		
		method1(5, 5, 5);
		
	}
	
	public static void method1(int SRB, int BRB, int rice) {
		
		int newRiceValue = 0; //New calc value
		int BRBU = 0; //Big rice bags used
		int SRBU = 0; //Small rice bags used
		
		if(rice % (BRB * 5) >= 0) {
			BRBU = BRB;
			newRiceValue = BRB * 5;
			System.out.println("You've used " + BRBU + " big rice bags");
			System.out.println("You have " + newRiceValue + "kg of rice packed");
			if((rice - newRiceValue) - (SRB * 1) >= 0) {
				SRBU = SRB;
				newRiceValue = newRiceValue + (SRBU * 1);
				System.out.println("You've used " + SRBU + " small rice bags");
				System.out.println("You have " + newRiceValue + "kg of rice packed");
				System.out.println("You've got " + (rice - newRiceValue) + "kg of rice left over");
			}else {System.out.println("Not enough rice left over to fill the 1kg bags");}
		}else {System.out.println("Not enough rice to fill the bags");}
	}

}
