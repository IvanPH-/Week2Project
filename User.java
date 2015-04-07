package week2Problems;

import java.text.DecimalFormat;
import java.util.HashSet;

import week2Problems.Products.Category;

public class User {
	static int purchaseCount = 0; //tied to checkOut
	static double y = Math.random() * (1000000 - 0) + 0;
	static DecimalFormat formatter = new DecimalFormat("#,###.00");
	
	protected static void startUser(HashSet<Products> y) {
		System.out.println("Welcome to the user Store");
		userStore(y);
	}
	
	private static void userStore(HashSet<Products> y) {
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
			userStore(y);
			break;
		case "exit":
			System.out.println("Exiting User Store...");
			Week2Project.startStore(y);
			break;
		case "view wallet":
			System.out.println("The amount currently in your wallet is: $" + formatter.format(y));
			userStore(y);
			break;
		case "view categories":
			System.out.println("Available Categories are:");
			for(Category c : Category.values()) {
					System.out.println(c.name());
			}
			userStore(y);
			break;
		case "view food":
			getType(y, Category.FOOD);
			userStore(y);
			break;
		case "view tools":
			getType(y, Category.TOOLS);
			userStore(y);
			break;
		case "view medical":
			getType(y, Category.MEDICAL);
			userStore(y);
			break;
		case "view shelter":
			getType(y, Category.SHELTER);
			userStore(y);
			break;
		case "view clothing":
			getType(y, Category.CLOTHING);
			userStore(y);
			break;
		case "view cooking":
			getType(y, Category.COOKING);
			userStore(y);
			break;
		case "view survival":
			getType(y, Category.SURVIVAL);
			userStore(y);
			break;
		case "view hygiene":
			getType(y, Category.HYGIENE);
			userStore(y);
			break;
		case "view emergency":
			getType(y, Category.EMERGENCY);
			userStore(y);
			break;
		case "view communication":
			getType(y, Category.COMMUNICATION);
			userStore(y);
			break;
		case "view backpacks":
			getType(y, Category.BACKPACKS);
			userStore(y);
			break;
		default:
			Week2Project.error();
			userStore(y);
		}
	}
	
	private static void getType(HashSet<Products> y, Category x) {
		for(Products p : y) {
			if(p.category == x) {
				System.out.println(p.name + " $" + p.price);
			}
		}
	}
}
