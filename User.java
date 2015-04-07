package week2Problems;

import java.text.DecimalFormat;

public class User {
	static int purchaseCount = 0; //tied to checkOut
	static double y = Math.random() * (1000000 - 0) + 0;
	static DecimalFormat formatter = new DecimalFormat("#,###.00");
	
	protected static void startUser() {
		System.out.println("Welcome to the user Store");
		userStore();
	}
	
	private static void userStore() {
		String x = Week2Project.input();
		switch(x) {
		case "commands":
			System.out.println("Current Available commands are:");
			 //Rather than print it have it sort all items so that when called they'll be presorted for next call
			System.out.println("View Categories");
			System.out.println("View [All/Category]");
			//etc etc for categories
			System.out.println("Sort by [Name/Price/Category]");
			System.out.println("View cart");
			System.out.println("Cart remove [item/name/id]"); //When called prompt to remove an amount of them.
			System.out.println("View wallet");
			//Figure out how to do this part
			System.out.println("Wallet add [amount]"); 
			System.out.println("Cart add [item/name/id]");
			//End of line 30 comment
			System.out.println("CheckOut"); //When called give purchaseCount ++
			System.out.println("Exit");
			userStore();
			break;
		case "exit":
			System.out.println("Exiting User Store...");
			Week2Project.startStore();
			break;
		case "view wallet":
			System.out.println("The amount currently in your wallet is: $" + formatter.format(y));
			userStore();
			break;
		case "view categories":
			System.out.println("Available Categories are:");
			//Add some method here to view them from stock
			userStore();
			break;
		case "view food":
			//getType method
			userStore();
			break;
		default:
			Week2Project.error();
			userStore();
		}
	}
}
