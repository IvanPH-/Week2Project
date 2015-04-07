package week2Problems;

public class Products {
	public enum Category {
		FOOD, TOOLS, MEDICAL, SHELTER, CLOTHING, COOKING, SURVIVAL, HYGIENE, EMERGENCY,
		COMMUNICATION, BACKPACKS
	}
	
	protected String name;
	protected double price;
	private int stock;
	protected Category category;
	
	public Products(String name, double price, int stock) {
		this.name = name;
		this.price = price;
		this.stock = stock;
	}
}
