package skillUp;

public class PurchaseManager {
	private Product[] products;

	public PurchaseManager(Product[] products) {
		this.products = products;
	}

	public void showProducts() {
		System.out.println("=== 商品一覧 ===");
		for (int i = 0; i < products.length; i++) {
			System.out.println(
				(i + 1) + ". "
				+ products[i].getName()
				+ " / " + products[i].getPrice() + "円"
				+ " / 在庫: " + products[i].getStock() + "個"
			);
		}
	}

	public Product selectProduct(int choice) {
		if (choice < 1 || choice > products.length) {
			return null;
		}
		return products[choice - 1];
	}

	public boolean purchase(Product product, int count) {
		if (product == null) {
			return false;
		}
		return product.buy(count);
	}
}