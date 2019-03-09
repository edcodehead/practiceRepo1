package LamarAssignments;

import java.util.Scanner;

public class ChangeMaker {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How much change do you have? (1 to 99)");
		int changeAmount = input.nextInt();
		findCoins(changeAmount);

	}
	
	public static void findCoins(int amount) {
		// Values of: quarters, dimes, nickels, pennies
		double quarters = 25;
		double dimes = 10;
		double nickels = 5;
		double pennies = 1;
		
		double newAmount = 0;
		
		// Determine how many of each coin
		// count quarters
		int q = amount / (int)quarters;
		newAmount = (double)amount - (quarters * q);
		// count dimes
		int d = (int)(newAmount / dimes); 
		newAmount = newAmount - (dimes * d);
		// count nickels
		int n = (int)(newAmount / nickels);
		newAmount = newAmount - (nickels * n);
		// count pennies
		int p = (int)(newAmount / pennies);
		
		System.out.println("Here is your change: ");
		System.out.println("Quarters: " + q);
		System.out.println("Dimes: " + d);
		System.out.println("Nickels: " + n);
		System.out.println("Pennies: " + p);

	}
	
}
