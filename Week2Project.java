package week2Problems;

import java.sql.Types;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Scanner;

import week2Problems.Products.Category;

/*
 * # Project 2
## Survival Store

You work as a developer for a company that sells emergency supplies and they've decided to build a virtual store. For some reason, all of their users are still stuck using MS-DOS, so you'll need to design the application for a text-based interface. Using the inventory list in the `resources` folder, create an application that supports the following user stories:

These problems will not be formally graded, but you might be asked to share your solutions with the class.

**Save your `.java` files in the `.answers` directory**



#### When a customer begins the program, he should be able to interact with a text-based menu of options.

The options should include:

- See all products
- See products by category
- View shopping cart
- View wallet
- Exit program

The customer should be able to select any of these options.

-------------

#### A customer should be able to see a list of all products

Each item in the list should include a product ID, the product name, a product category, and whether or not it is in stock. You will need to come up with a system to generate appropriate IDs.

-------------

#### A customer should be able to sort the list of all products by name, category or price

On any screen where the customer sees a list of products, the customer should be presented with options to sort the list by name, category or price. All user input can be gathered in the console through text commands, rather than relying on a graphics-based interface.

-------------

#### A customer should be able to see how much money they have left in their wallet.

Customers should be presented with a random amount of money when the program is started. The current amount of money left should be visible when the customer inputs 'View wallet'.

-------------

#### A customer should be able to add items to a shopping cart

On any screen where the customer sees a list of products, the customer should be able to select a product and a quantity. If there is enough product in stock, the item should get added to a shopping cart and the user should receive feedback. If there is not enough product in stock, the user should receive a message with that information and the item should not be added to the shopping cart.

-------------

#### A customer should be able to view the shopping cart

The shopping cart should contain a list of items to be purchased, including product ID, name and quantity.

-------------

#### A customer should be able to remove items from the shopping cart

-------------

#### A customer should be able to 'purchase' items from a shopping cart if the customer has enough money

If the customer has enough money, he should be able to purchase items in the shopping cart. The customer should receive a confirmation message and the appropriate amount of money should be subtracted from his wallet. In addition, the appropriate quantities of product should be removed from the product inventory.


-------------

## Challenge

#### A users should be given the option to 'sign in' as an admin

When the program is first started, users should be presented with the option to sign in as an admin. If this option is selected, users will need to enter a password. If the password matches a password stored in the system, the user is presented with an admin interface.

### An admin should be able to interact with a menu of options

The options should include:

- See all products
- Search for a product
- See purchased items
- See popular items
- Exit program


-------------

#### An admin should be able to see a list of inventory that can be sorted by name, category  or number of items

-------------

#### An admin should be able to search for items by name

bonus: The search should be case- and whitespace-insensitive

-------------

#### An admin should be able to see a list of purchased items

-------------

#### After 5 purchases have been made, an admin should be able to see a list of the most popular items

-------------

#### Make your own store with a different set of inventory

-------------

***Changes made to inventory should be reflected in calls to inventory-related features**
***Classes, methods and inheritance should be used to separate concerns and organize data**
 */

public class Week2Project {
	public static void main(String[] args) {
		HashSet<Products> stock = Stock.createStock();
		for(Products p : stock) {
			if(p.category == Category.FOOD) {
				System.out.println(p.name + " $" + p.price);
			}
		}
		System.out.println("To view your available commands at any time type 'commands' into the console");
		startStore();
	}
	
	protected static String input() {
		Scanner input = new Scanner(System.in);
		String x = input.nextLine();
		x = x.toLowerCase();
		return x;
	}
	
	protected static void startStore() {
		System.out.println("Would you like to sign in as an administrator?");
		String x = input();
		
		switch(x) {
		case "yes": 
			System.out.println("Starting administrator interface...");
			Admin.startAdmin();
			break;
		case "no": 
			System.out.println("Starting User Store...");
			User.startUser();
			break;
		case "commands":
			System.out.println("Current Available commands are:");
			System.out.println("Yes");
			System.out.println("No");
			System.out.println("Terminate");
			startStore();
			break;
		case "terminate":
			System.out.println("Shutting down...");
			System.exit(0);
			break;
		default:
			error();
			startStore();
		}
	}
	
	protected static void error() {
		System.out.println("Please enter a valid command. To view your commands at any time please type 'commands' into the console");
	}
}