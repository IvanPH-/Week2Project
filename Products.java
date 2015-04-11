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
	
	protected Products(String name, double price, int stock) {
		this.name = name;
		this.price = price;
		this.setStock(stock);
	}

	protected int getStock() {
		return stock;
	}

	protected void setStock(int stock) {
		this.stock = stock;
	}
}
