package week2Problems;

public class Admin {
	static int y = 5;
	static boolean overChecked = false;
	
	protected static void startAdmin() {
		if (overChecked == true) {
			failed();
		}
		else {
		System.out.println("'commands' is currently disabled. Please input your password");
		password();
		}
	}
	
	private static void password() {
		String x = Week2Project.input();
		passwordCheck(x);
	}
	
	private static void passwordCheck(String x) {
		
		switch(x) {
		case "12345":
			System.out.println("Opening administrative controls...");
			y = 5;
			adminInterface();
			break;
		default:
			y -= 1;
			checkContinue(y);
			if (overChecked == true) {
				failed();
			}
			else {
			System.out.println("Incorrect Password. " + y + " attempts remaining");
			password();
			}
		}
	}
	
	private static void checkContinue(int y) {
		if (y == 0) {
			overChecked = true;
		}
	}
	
	private static void failed() {
		System.out.println("Too many failed attempts. Administrator controls locked out for current session.");
		System.out.println("Returning...");
		Week2Project.startStore();
	}
	
	private static void adminInterface() {
		String x = Week2Project.input();
		switch(x) {
		case "commands":
			System.out.println("View [All/Category/Name/ID"); //They should be allowed to see how many are in stock
			System.out.println("View [Name/ID] - Stock");
			System.out.println("View Purchased"); //See all bought items, name/id quanitity
			System.out.println("View Popular"); //View the bought items from most purchased to fewer numbers. Also display the amount gained from purchases
			System.out.println("Exit");
			break;
		case "exit":
			System.out.println("Returning...");
			Week2Project.startStore();
			break;
		}
	}
}
