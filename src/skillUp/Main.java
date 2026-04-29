package skillUp;

public class Main {
	public static void main(String[] args) {
		Product[] products = {
			new Product("りんご", 120, 10),
			new Product("みかん", 100, 5),
			new Product("バナナ", 150, 8)
		};

		PurchaseManager manager = new PurchaseManager(products);
		UserInterface ui = new UserInterface(manager);

		ui.start();
	}
}