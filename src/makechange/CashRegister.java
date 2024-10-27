package makechange;

import java.util.Scanner;

public class CashRegister {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the price of the item.");
		double price = sc.nextDouble();
		int priceCoins = ((int)(price * 100));
		
		System.out.println("Please enter the amount tendered.");
		double tender = sc.nextDouble();
		int tenderCoins = ((int)(tender * 100));
		
		double changeDue = tender - price;
		if ( price > tender) {
			System.err.println("Not enough money to purchase this. Please give me more money.");
		}
		if ( price == tender) {
			System.out.println("Thank you for your purchase! Have a great day!");
		}
		else {
		System.out.println("Thank you! Your change is: $ " + changeDue + ". Which is: ");
		}
		int changeDueCoins = tenderCoins - priceCoins;
		
		int twentyDollars = 2000;
		int tenDollars = 1000;
		int fiveDollars = 500;
		int oneDollars =  100;
		int quarters =  25 ;
		int dimes =  10;
		int nickels =  5;
		int pennies = 1;
			
			int twenties = changeDueCoins / twentyDollars;
			int remainingChange = changeDueCoins - (twenties * twentyDollars);
		
			int tens = remainingChange / tenDollars;
			remainingChange = remainingChange - (tens * tenDollars);
			
			int fives = remainingChange / fiveDollars;
			remainingChange = remainingChange - (fives * fiveDollars);
			
			int ones = remainingChange / oneDollars;
			remainingChange = remainingChange -(ones * oneDollars);
			
			int quartersA = remainingChange / quarters;
			remainingChange = remainingChange - (quartersA * quarters);
			
			int dimesA = remainingChange / dimes;
			remainingChange = remainingChange -(dimesA * dimes);
			
			int nickelsA = remainingChange / nickels;
			remainingChange = remainingChange - (nickelsA * nickels);
			
			int penniesA = remainingChange / pennies;
			remainingChange = remainingChange -(penniesA * pennies);
			
			if (twenties > 0) {
				System.out.println(twenties + " Twenties ");
			}
			
			if (tens > 0) {
				System.out.println( tens + " Tens " );
			}
			if (fives > 0) {
				System.out.println( fives + " Fives  " );
			}
			if (ones > 0) {
				System.out.println( ones + " Ones " );
			}
			if (quartersA > 0) {
				System.out.println( quartersA + " Quarters ");
			}
			if (dimesA > 0) {
				System.out.println( dimesA + " Dimes " );
			}
			if (nickelsA > 0) {
				System.out.println( nickelsA + " Nickels " );
			}
			if (penniesA > 0) {
				System.out.println( penniesA + " Pennies ");
			}
				
		sc.close();
	}
}

