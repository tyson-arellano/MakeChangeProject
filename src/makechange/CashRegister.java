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
//		System.out.println(changeDue);
		int changeDueCoins = tenderCoins - priceCoins;
//		System.out.println(changeDueCoins);
//		System.out.println(coins);
		
		int pennies = changeDueCoins % 100;
		int nickels = changeDueCoins / 5;
		int dimes = changeDueCoins / 10;
		int quarters = changeDueCoins / 25 ;
		int oneDollars = changeDueCoins / 100;
		int fiveDollars = changeDueCoins / 500;
		int tenDollars = changeDueCoins / 1000;
		
		if (pennies < 5 ) {
			System.out.println(pennies + " Pennies");
		}
		
		if (pennies >= 5) {
			int newPennies = pennies % 5;
			
			if ( 0 < newPennies && newPennies < 5 ) {
				System.out.println(newPennies + " Pennies");
			}
			else {	
			}
		}
		
		if (nickels < 2) {
			System.out.println(nickels + " Nickel");
		}
		
//		if (nickels >= 2) {
//			int newNickels = 
//		}
		
		
		

		
		
		
		
		sc.close();
	}

}
