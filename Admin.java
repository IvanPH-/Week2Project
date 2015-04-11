package week2Problems;

import java.util.HashSet;

public class Admin {
	static int z = 5;
	static boolean overChecked = false;
	
	protected static void startAdmin(HashSet<Products> y) {
		if (overChecked == true) {
			failed(y);
		}
		else {
		System.out.println("'commands' is currently disabled. Please input your password");
		password(y);
		}
	}
	
	private static void password(HashSet<Products> y) {
		String x = Week2Project.input();
		passwordCheck(x, y);
	}
	
	private static void passwordCheck(String x, HashSet<Products> y) {
		
		switch(x) {
		case "12345":
			System.out.println("Opening administrative controls...");
			z = 5;
			adminInterface(y);
			break;
		default:
			z -= 1;
			checkContinue(z);
			if (overChecked == true) {
				failed(y);
			}
			else {
			System.out.println("Incorrect Password. " + z + " attempts remaining");
			password(y);
			}
		}
	}
	
	private static void checkContinue(int z) {
		if (z == 0) {
			overChecked = true;
		}
	}
	
	private static void failed(HashSet<Products> y) {
		System.out.println("Too many failed attempts. Administrator controls locked out for current session.");
		System.out.println("Returning...");
		Week2Project.startStore(y);
	}
	
	private static void adminInterface(HashSet<Products> y) {
		String x = Week2Project.input();
		switch(x) {
		case "commands":
			System.out.println("View [All/Category/Name/ID"); //They should be allowed to see how many are in stock
			System.out.println("View [Name/ID] - Stock");
			System.out.println("View Purchased"); //See all bought items, name/id quanitity. Also display the amount gained from purchases
			System.out.println("View Popular"); //View the bought items from most purchased to fewer numbers.
			System.out.println("Change stock"); //Allows you to change the stock of an item, add an item to be purchased, or remove an item
			System.out.println("Exit");
			break;
		case "exit":
			System.out.println("Returning...");
			Week2Project.startStore(y);
			break;
		}
	}
}
