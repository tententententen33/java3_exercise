package skillUp;

public class Product {
	private String name;
	private int price;
	private int stock;

	public Product(String name, int price, int stock) {
		this.name = name;
		this.price = price;
		this.stock = stock;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public int getStock() {
		return stock;
	}

	public boolean buy(int count) {
		if (count <= 0) {
			return false;
		}

		if (stock < count) {
			return false;
		}

		stock -= count;
		return true;
	}
}